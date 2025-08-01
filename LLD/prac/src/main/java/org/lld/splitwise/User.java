package org.lld.splitwise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class User {
    private String name;
    private String email;

    private UUID uid;
    private Map<User, Owes> owes;

    public User(String email, UUID uid, String name){
        this.name = name;
        this.email = email;
        this.uid = uid;
        this.owes = new HashMap<>();
    }

    public Map<User, Owes> getOwes(){
        return this.owes;
    }
}
