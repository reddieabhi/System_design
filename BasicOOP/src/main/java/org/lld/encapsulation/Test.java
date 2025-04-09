package org.lld.encapsulation;
import org.lld.User;


public class Test {

    public static void main(String[] args){
        User user = new User();
        user.name = "Abhi"; // can access as it is public
//        user.int = 13;    // cannot access this as this is protected
//        user.message = "hi"; // cannot access this as this is private
    }


}
