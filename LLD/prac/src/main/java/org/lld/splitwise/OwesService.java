package org.lld.splitwise;

public class OwesService {

    public void addOwes(User user1, User user2, float amount){

        Owes owe = user1.getOwes().get(user2);
        if (owe != null){
            owe.setAmount(owe.getAmount() + (-1 * amount));
        } else {
            owe = new Owes(user1, user2, -1*amount);
            user1.getOwes().put(user2, owe);
        }

        Owes owe2 = user2.getOwes().get(user1);
        if (owe2 != null){
            owe2.setAmount(owe2.getAmount() + amount);
        } else {
            owe2 = new Owes(user2, user1, amount);
            user2.getOwes().put(user1, owe2);

        }


    }
}
