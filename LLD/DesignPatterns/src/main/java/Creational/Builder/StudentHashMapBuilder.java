package Creational.Builder;

import java.util.HashMap;

public class StudentHashMapBuilder {
    private HashMap<String, String> attributes;

    public StudentHashMapBuilder() {
        attributes = new HashMap<>();
    }

    public StudentHashMapBuilder set(String key, String value) {
        attributes.put(key, value);
        return this;
    }

    public void build() {
        System.out.println("Creating student with:");
        attributes.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}
