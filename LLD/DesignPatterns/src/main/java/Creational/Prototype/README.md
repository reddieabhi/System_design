# Prototype pattern

Prototype is a creational design pattern that allows you creating a deep copy of an existing object (clone), instead of creating new object.

## When to use
1. Object creation is **costly** or **time-consuming**.
2. You need to **copy existing objects** and change only a few fields. 
3. Want to **avoid re-initialization** of similar objects.



### Example : 
- Imagine an insurance company where each new user gets a similar form filled with standard data (e.g., company name, policy details). 
- Here we need not recreate everything every time — just **copy the existing template and change the name, age, etc.**

- Let’s take `InsuranceForm` class that contains many fields.
- Instead of recreating the class from scratch for every user, we clone the common fields from existing user and change the only required fields. 
- If we go with the normal flow here, we have a class with all fields and every time we create a object of that class we need to initialize all the fields.
#### - Hence, we have a prototype patter here
- In prototype, we have a interface which has a clone method and our Inusranceform class will implement this prototye class.
- Implementing prototype interface, our insurance form class must have a clone method implemented. 
- Here is interface prototype [Protype Interface](./Prototype.java)
- Insurance Form class [Insurance Form](./InsuranceForm.java)
- Main [Main](./Main.java)



**Happy coding**

### Feel free to connect with me. Iam open for suggestions and improvements. I am more than happy for any technical discussions.

## 📩 Let's Catch Up
📧 **Email:** abhinayreddyb.309@gmail.com  
👔 **LinkedIn:** [Connect with me](https://www.linkedin.com/in/abhinay-reddy-bellamkonda-927553191/)