package Creational.Factory;

public class Air implements Logistics{

    @Override
    public void transport(){
        System.out.println("Transporting via Air");
    }
}
