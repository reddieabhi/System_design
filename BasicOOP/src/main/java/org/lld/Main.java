package org.lld;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        User user = new User();

        user.name = "Abhi"; // can access
        user.age = 23;  // Can access this until we are in same package
//        user.message = "Hi"; // cannot access this as message is private
    }
}