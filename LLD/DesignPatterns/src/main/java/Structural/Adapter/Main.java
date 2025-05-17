package Structural.Adapter;

public class Main {




    public static void main(String args[]){
        OurPaymentgateway adapterRazorpay = new AdapterRazorpay(new Razorpay());

        OurPaymentgateway adapterPayu = new AdapterPayu(new PayU());

        OurService paygw1 = new OurService(adapterRazorpay);

        OurService paygw2 = new OurService(adapterPayu);

        int amount = 129;
        String  id = "12";

        paygw1.payment(id, amount);

        paygw2.payment(id, amount);
    }
}
