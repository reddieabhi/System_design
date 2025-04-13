package Creational.Singleton;

public class Singleton {
    private static Singleton INSTANCE = null;

    private Singleton(){}

    public Singleton getInstance(){
        if (INSTANCE == null){
            INSTANCE = new Singleton(); // for the first time creates a instance
        }
        return INSTANCE;  // returns the created instance
    }
}

// Not thread safe, if 2 threads tries to initialize same time then 2 instances may be created.