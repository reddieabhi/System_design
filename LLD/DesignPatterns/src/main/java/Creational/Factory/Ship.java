package Creational.Factory;

public class Ship implements Logistics{
    @Override
    public void transport() {
        System.out.println("Transporting via ship");
    }
}
