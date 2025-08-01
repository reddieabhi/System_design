package lld;

// This package tell us about providing access to only selected data

public class User {
    public String  name; // can be accessed from anywhere
    protected int age; // can be accessed within the package
    private String message; // cannot be accessed outside this class
}
