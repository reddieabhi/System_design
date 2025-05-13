package Creational.Factory;

public class Road implements Logistics{

    @Override
    public void transport() {
        System.out.println("Transporting via Road");
    }
}
