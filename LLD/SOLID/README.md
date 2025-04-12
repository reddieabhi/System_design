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
- **L** -
- **I** -
- **D** -

---

## Single Responsibility Principle (SRP)


Any piece of code or method or a class should have a single responsibility. In other words a class or method must only do single job

### Problems of violating SRP
1. Difficult to Debug
2. Not easy to understand
3. Difficult to work in parallel

## Examples:

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



## How to identify SRP
1. Multiple if else statements
2. Monster method (A method like above shown save method which have multiple tasks to do)
3. Utilities Packages/ classes - A single utility class may have multiple different methods which are not actually belonging to the same class. Or a single utility package has multiple classes each of them serve differently. 

! In  most of big tech companies utility packages/functions are banned. So any method/ classes thinking to place in utility create a separate package and define the classes of it. 



