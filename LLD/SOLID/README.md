# SOLID PRINCIPLES

SOLID principles are a set of rules that help us write better code.

A good codebase is:
- **Reusable**
- **Understandable**
- **Reliable**
- **Extensible**

**SOLID stands for:**
- **S** - Single Responsibility Principle
- **O** - Open/Closed Principle
- **L** - Liskov's substitution principle 
- **I** - Interface segregation
- **D** - Dependency Inversion

---

## Single Responsibility Principle (SRP)


Any piece of code or method or a class should have a single responsibility. In other words a class or method must only do single job

### Problems of violating SRP
1. Difficult to Debug
2. Not easy to understand
3. Difficult to work in parallel

### Examples:

**Example 1:** Let us have a method `save()`. This method does the following:
- Loads data
- Prepares data
- Establishes a connection
- Finds the index or table
- Pushes the data into the table

If the `save()` method fails at any point, it will be hard to find where exactly the issue occurred.  
🛠 **Fix:** We must create separate methods for each task:
- One method to load data
- One to prepare data
- One to establish a connection
- One to push data


By separating the work into multiple methods or classes we are reducing the responsibility of each method. 

**Example2:** Consider a class Animal having few methods. One of its method is this way shown. 

```java
void act() {
    if (animal is Monkey) {
        // do something
    } else if (animal is Lion) {
        // do something else
    } else if (animal is Human) {
        // start coding
    }
}
```

Here the same method has different functionality to do something based on the type. So here number of responsibilities of this method is > 1. which is a bad sign.
TO avoid this we split the code into multiple classes/ multiple animals will be inherited from Animal class. 



### How to identify SRP
1. Multiple if else statements
2. Monster method (A method like above shown save method which have multiple tasks to do)
3. Utilities Packages/ classes - A single utility class may have multiple different methods which are not actually belonging to the same class. Or a single utility package has multiple classes each of them serve differently. 

! In  most of big tech companies utility packages/functions are banned. So any method/ classes thinking to place in utility create a separate package and define the classes of it. 



## Open/Closed Principle (OCP)

Any addition of new code/ method should be a such a way that it **does not modify the existing working code.** Instead we should extend by  adding new classes or methods

> In simple terms:  
> A project should be **open for extension**, but **closed for modification**.

--- 


### Example:

If we have a Animal class and multiple animals are inheriting the parent animal class. Now adding a new animal should not effect or modify the existing animals code. It should be simply done by adding new class.


## Liskov's Substitution principle (LCP)

LSP states that **objects of a subclass should be replaceable with objects of the parent class** without affecting the correctness of the program.
In simple if B is a subclass of class A, then we should be able to replace A by B for any objects. 
And while inheriting or implementing some class we should only do it if there is a proper logical relationship between the classes. 

Here is a example for LCP violation

### Example 
Consider a interface PrintToConsole has a function Print(), and a class Printer which also has function Print().
Now both have print functions but here Printer class implementing PrintToConsole class will cause LCP violation. 


LCP occurs in 2 cases 
1. When a child class is having exception for any method which is in parent
   1. If a Parent class Animal, child class Dog, child of Dog is lab. Let us consider all Animals have make sound method, hence all dogs will have a make sound method. But lab doesnot have makesound, hence in make sound method of Lab it raises a exception. 
2. When we are inheriting or implementing non logically matching classes. 




## Interface Segregation

Interfaces should be light. Avoid creating bulky interfaces with too many methods. 
### Example 

```java
public Interface Animal{
    void makeSound();
}

public class Dog implements Animal{
    public  void makeSound(){
        //do something
    }

}
```

Interface should be as light as possible to have one method only.
Most of the interfaces should have one method only.

Below we have a bad example of interface

```java
public interface Animal {
    void makeSound();
    void walk();
    void fly();
}
```



## Dependency Inversion

No 2 classes can directly depend on each other. If 2 classes are depending on each other they have to interact through a Interface(abstract). 

Go through the example below for more clarity

We have a method in paytm which completes the payment using razorpay.

```java
public class PaytmPaymentProcessing(){
    Razorpay r = new Razorpay<>();
    public void pay(){
        r.generatePaymentLink();
       r.pay()
    }
}
```

If Paytm wants to switch to Juspay, we need to do multiple code changes:


```java
public class PaytmPaymentProcessing(){
    Juspay r = new Juspay<>();
    public void pay(){
        r.generateLink();
       r.makePayment();
    }
}
```

we have to make many changes when Paytm is switching from razorpay to juspay as methods of razorpay and juspay differnt.

Hence to minimize the changes we have to place a abstract Payment interface in between, and that interface has a method pay().

Both razorpay, juspay have to implement this Payment interface and they must have method pay(). In that pay method razorpay will use its own way, and same for juspay.

now while changing from razorpay to juspay we only need to change at initialization. 


```java
public Interface Payment{
    void pay();
}

public class Razorpay implements Payment{
    public void pay(){
        r.generatePaymentLink();
        r.pay();
    }
}

public class Juspay implements Payment{
    public void pay(){
        r.generateLink();
        r.pay();
    }
}
        
```

Now in our class we use this Payment interface to make the payments.

```java
public class PaytmPaymentProcessing(){
    Payment p = new Razorpay<>();
    public void pay(){
        p.pay();
    }
}
```

In the above case if we want to change razorpay to juspay we have to make only 1 change. 



```java
public class PaytmPaymentProcessing(){
    Payment p = new Juspay<>();
    public void pay(){
        p.pay();
    }
}
```


---

## Note: Final Thoughts on SOLID Principles

- **SOLID principles are guidelines**, not strict rules.
- They are meant to **improve code quality**, making it more:
   -  Reusable
   -  Understandable
   -  Extensible
   -  Reliable

While applying SOLID can lead to cleaner architecture and easier maintenance, remember:

>  **Too much abstraction or over-engineering can hurt than help.**

The goal is to **find the right balance** — use SOLID where it adds value.

---



**Happy coding** 

### Feel free to connect with me. Iam open for suggestions and improvements. I am more than happy for any technical discussions.

## 📩 Let's Catch Up
📧 **Email:** abhinayreddyb.309@gmail.com  
👔 **LinkedIn:** [Connect with me](https://www.linkedin.com/in/abhinay-reddy-bellamkonda-927553191/)

