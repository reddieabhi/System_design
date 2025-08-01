# Abstraction

- Abstraction is concept of hiding the implementation and giving necessary functions to the user. 
So we get to know what an object does but not how it does

- Abstraction is achieved by using abstract classes and in java it can be achieved from interfaces also.


## Features of Abstraction

1. Hiding implementation 
2. Abstract methods. (Any class implementing or extending abstract methods must have the methods defined in Abstract class)


## Benefits
1. Simplifies the code by hiding the implementation
2. Decreases direct dependency on class (We can see this in Dependency Inversion (SOLID))


## Methods to achieve abstraction
1. Abstract classes
2. Interfaces (Java)


### Abstract classes
You can see the abstract class here [AbstractCar.java](./AbstractCar.java)

You can see the DieselCar class here [DieselCar.java](./DieselCar.java)

Here DieselCar is extending the abstract class hence it must implement the abstract methods mentioned in the abstract class



### Interfaces
- Interfaces are blueprints to the classes that defines the behaviour of class but not actually implements the methods. Any  class implementing interface must implement the methods defined in the interface.  

- Interfaces are similar to abstraction, but they can have only abstract methods till java 8. All methods in interface are implicitly abstract methods (need not mention it).

- You can see the interface here [InterfaceCar.java](./InterfaceCar.java)

- You can see Petrol Car which is implementing interface InterfaceCar [PetrolCar.java](./PetrolCar.java)

- Here Petrol car must have the methods mentioned in the interface.

The key difference between interface and abstract class are a single class can implement 2 or more interfaces, but cannot extend more than 1 abstract class. 

## Default and Static methods in Interfaces







