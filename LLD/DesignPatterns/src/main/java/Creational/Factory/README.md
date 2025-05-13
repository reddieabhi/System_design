# Factory Design Pattern

Factory Design Pattern is a creational design pattern that provides an interface for creating objects without actually specifying the exact class of the object that will be created.


## Usage
- Consider you have a logistic system hat can deliver products via Road, Ship and air. 
- You want the flexibility to choose any transport at runtime, and you don’t want the client code to worry about the internal implementation. The only thing that matters here is — "the product should be delivered."
- Then Factory method allows this by providing the client any desired class. 

## Example:
- Here we go through an example where a logistics factory gives you the desired logistics .
- This  is Logistics[.java](./Logistics.java), The actual interface for logistics
- Respective mode classes
  1. [Air](./Air.java)
  2. [Road](./Road.java)
  3. [Ship](./Ship.java)
- All the mentioned 3 classes above implements logistics. Hence, we need a factory helper class which can give you the class
- Here is the [LogisticsFactory](./LogisticsFactory.java)


**Happy coding**

### Feel free to connect with me. Iam open for suggestions and improvements. I am more than happy for any technical discussions.

## 📩 Let's Catch Up
📧 **Email:** abhinayreddyb.309@gmail.com  
👔 **LinkedIn:** [Connect with me](https://www.linkedin.com/in/abhinay-reddy-bellamkonda-927553191/)