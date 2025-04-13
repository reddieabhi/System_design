package Creational.Singleton;

public class SingletonSynchronized {
    private static SingletonSynchronized INSTANCE = null;

    private SingletonSynchronized() {}

    public static synchronized SingletonSynchronized getInstance() { // Here we saying this is synchronized
        if (INSTANCE == null) {
            INSTANCE = new SingletonSynchronized();
        }
        return INSTANCE;
    }
}

// This is thread safe, 2 treads could not access this at same time.