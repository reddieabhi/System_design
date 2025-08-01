package org.lld.splitwise;

public class Owes {

    private User user1;
    private User user2;
    private float amount;

    public Owes(User user1, User user2, float amount){
        this.user1 = user1;
        this.user2 = user2;
        this.amount = amount;
    }

    public void setAmount(float amount){
        this.amount = amount;
    }

    public float getAmount(){
        return this.amount;
    }
}
