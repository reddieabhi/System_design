package Creational.Singleton;

public class SingletonEager {
    public static SingletonEager INSTANCE = new SingletonEager();

    private SingletonEager(){}

    public static SingletonEager getInstance(){
        return INSTANCE;
    }
}
// This is thread safe. But creates the instance at time of initialization. Not memory efficient.