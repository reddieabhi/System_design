package Structural.Adapter;

import java.util.TreeMap;

public class PayU {
    public boolean doPayment(String id, int amount){ // payment provided by Payu
        System.out.println("Payment done via Payu" + amount);
        return true;
    }
}
