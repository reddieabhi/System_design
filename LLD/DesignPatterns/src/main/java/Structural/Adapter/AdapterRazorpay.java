package Structural.Adapter;

public class AdapterRazorpay implements OurPaymentgateway{
    private final Razorpay razorpay;

    public AdapterRazorpay(Razorpay razorpay){
        this.razorpay = razorpay;
    }

    @Override
    public boolean pay(String id, int amount) {
        return razorpay.makePayment(id, amount);
    }
}
