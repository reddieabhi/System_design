# Singleton Design Pattern

Singleton Design Patterns allows to use only one instance of the class. 
**Example** 
1. DB connection
2. logger

Any singleton class should only have one Instance that can be used in entire project. 
For example a DB connection, if multiple instances are created, each instance tries to maintain a TCP connection with the DB making it less efficient and not necessary. The good approach is to create only one connection instance and that maintains a TCP connection and hence to be used in everywhere of the project

### Key points
* For any singleton class make the constructor private to restrict initialization. 
* We need a get instance method to get a instance of class and also that method should return the same instance if we try to reinitialize the class.
* Make sure get instance is a static method. 


## Implementation of Singleton
Singleton class can be implemented in multiple ways based on the requirement. Few are here

### 1. Basic Singleton (Not thread safe)
Instance is created only once, but not thread safe.
Here is example of [`Singleton.java`](./Singleton.java)

### 2. Synchronized Singleton (Thread safe)
Adds synchronized to get instance method making the method thread safe. 
Here is the example of [`SingletonSynchronized.java`](./SingletonSynchronized.java)

### 3. Eager Initialization
Instance is created at class loading time. This creates the instance at the time of build hence may not be the suitable one
Here is the example of SingletonEager [`SingletonEager`](./SingletonEager.java)

### 4. Double Checked Login
Has 2 checks making it thread safe and entire method is not synchronized. Only if block is. 
Here is the example of SingletonEager [`SingletonDoubleCheck`](./SingletonDoubleCheck.java)

### 5. enum Singleton
The most efficient thread safe and also handles serialization. This is widely used. 
Here is the example of SingletonEager [`SingletonEnum`](./SingletonEnum.java)



**Happy coding**

### Feel free to connect with me. Iam open for suggestions and improvements. I am more than happy for any technical discussions.

## 📩 Let's Catch Up
📧 **Email:** abhinayreddyb.309@gmail.com  
👔 **LinkedIn:** [Connect with me](https://www.linkedin.com/in/abhinay-reddy-bellamkonda-927553191/)


