package Structural.Adapter;

import java.util.TreeMap;

public class Razorpay {

    public boolean makePayment(String id, int amount){ // Method provided by razorpay for payment
        System.out.println("Payment done via Razorpay" + amount);
        return true;
    }

}
