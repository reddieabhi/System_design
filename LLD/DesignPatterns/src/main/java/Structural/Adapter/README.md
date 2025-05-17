# Adapter Design Pattern

- Adapter design allows adapting the interfaces with a helper adapter class which might not be directly related.
- We will understand this better by following walking through the below example

## Example: 
- Imagine we have a company and it needs a payment service. There are multiple payment providers in market like Razor pay, Payu etc.
- We select best payment provider any may change that anytime in the future. At the time of change we should ensure that it should be done with minimum changes
- Each payment provider may have different payment methods. Hence, we create an interface and it contains methods desired by us. 
- Now the actual classes or methods of payment providers may not match the methods in our interface. 
- Hence, we create an adapter class for each of payment provider and this adapter class will implement our payment interface with methods we defined in the interface. 
- Adapter classes takes care of using methods by payment providers in methods defined in the interface.
- Here are the reference classes
  1. [OurPaymentGateway](./OurPaymentgateway.java)
  2. [PayU](./PayU.java)
  3. [AdapterPayu](./AdapterPayu.java)
  4. [Razorpay](./Razorpay.java)
  5. [AdapterRazorpay](./AdapterRazorpay.java)
  6. [OurService](./OurService.java)
  7. [Main](./Main.java)

- From the above classes you can see that we have our payment gateway and some desired methods which we expect payment providers to use
- But payment providers has its methods which will be used by other customers, and it will not be changed explicitly for us
- Hence, we have an adapter class for each payment provider we use, and that adapter class implements our payment gateway and uses methods of payment provider. 
- You can see in PayU adapter it implements our payment gateway interface and uses methods of payU class.
- 
