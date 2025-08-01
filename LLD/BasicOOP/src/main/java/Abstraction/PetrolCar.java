package Abstraction;

public class PetrolCar implements InterfaceCar{

    @Override
    public void sound(){
        System.out.println("Sound horn tuk tuk");
    }

    @Override
    public void start(){
        System.out.println("Car is starting");
    }
}
