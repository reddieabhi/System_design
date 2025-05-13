abstract class Car(){
    void start(); // abstract method

    void horn(){  // concrete method, can be accessible by any object implementing this abstract class
        System.out.println("sound tuk tuk");
    }
}