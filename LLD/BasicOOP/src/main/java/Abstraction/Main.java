package Abstraction;

public class Main {
    public static void main(String[] args){
        AbstractCar c1 = new DieselCar();

        c1.horn(); //
        c1.start();  // abstract method implemented by concrete class
    }
}
