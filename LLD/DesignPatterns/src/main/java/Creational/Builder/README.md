# Builder Design Pattern

Builder design pattern is used when we are dealing with following 3 issues.
1. When class has to many attributes
2. When class has immutable attributes
3. When there is a constraint of some mandatory attributes


To solve this we cannot use a normal way of class, as it can violate any of the above 3 conditions. Few ways like using validation methods or hashmap methods we can solve this to an extent. But still our code may not look good. 
Hence we use builder helper class which handles all the validations and make it immutable
- To make the attributes immutable we make the attributes of class as private. But the problem with making them private is they are not accessible fro builder class also. Hence we have to make builder class a sub class (inside class) of actual class


- Here is the example for Hashmap builder[StudentHashMapBuilder.java](./src/main/java/Creational/Builder/StudentHashMapBuilder.java)

This is less recommended 

- Here is the example for Builder class [Student.java](./src/main/java/Creational/Builder/Student.java)


