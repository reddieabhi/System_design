package Creational.Singleton;

public class SingletonDoubleCheck {
    private static volatile SingletonDoubleCheck INSTANCE = null;

    private SingletonDoubleCheck() {}

    public static SingletonDoubleCheck getInstance() {
        if (INSTANCE == null) { // first check
            synchronized (SingletonDoubleCheck.class) { // this block is synchronized
                if (INSTANCE == null) { // second check
                    INSTANCE = new SingletonDoubleCheck();
                }
            }
        }
        return INSTANCE;
    }
}

// checks twice, once in normal method and second time in synchronized block.
