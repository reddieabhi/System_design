package Creational.Factory;

public class LogisticsFactory {

    public static Logistics getLogistics(String mode){
        if (mode == "Road"){
            return new Road();
        } else if (mode == "Air") {
            return  new Air();
        } else {
            return new Ship();
        }
    }
}
