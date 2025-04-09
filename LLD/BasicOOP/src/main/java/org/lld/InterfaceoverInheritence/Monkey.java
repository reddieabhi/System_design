package org.lld.InterfaceoverInheritence;

public class Monkey extends  Animal implements Walkable{

    WalkingBehaviour walkingBehaviour;

    Monkey(WalkingBehaviour walkingBehaviour){
        this.walkingBehaviour = walkingBehaviour;
    }
    @Override
    public void walk(){
        walkingBehaviour.walk();
    }
}
