package Structural.Adapter;

public class OurService {
    private OurPaymentgateway ourPaymentgateway;

    public OurService(OurPaymentgateway ourPaymentgateway){
        this.ourPaymentgateway = ourPaymentgateway;
    }

    public boolean payment(String id, int amount){
        return ourPaymentgateway.pay(id, amount);
    }
}
