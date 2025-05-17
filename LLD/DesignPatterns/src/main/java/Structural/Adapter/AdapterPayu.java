package Structural.Adapter;

public class AdapterPayu implements OurPaymentgateway{

    private final PayU payU;

    public AdapterPayu(PayU payU){
        this.payU = payU;
    }

    @Override
    public boolean pay(String id, int amount) {
        return payU.doPayment(id, amount);
    }
}
