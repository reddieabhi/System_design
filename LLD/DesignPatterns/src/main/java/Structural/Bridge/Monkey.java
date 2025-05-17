package Structural.Bridge;

public class Monkey extends  Animal{

    WalkingBehaviour walkingBehaviour;

    Monkey(WalkingBehaviour walkingBehaviour){
        this.walkingBehaviour = walkingBehaviour;
    }

    public void walk(){
        walkingBehaviour.walk();
    }
}
