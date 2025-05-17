package Structural.Bridge;

public class Cat extends Animal {
    WalkingBehaviour walkingBehaviour;
    SpeakingBehaviour speakingBehaviour;

    Cat(WalkingBehaviour walkingBehaviour, SpeakingBehaviour speakingBehaviour){
        this.walkingBehaviour = walkingBehaviour;
        this.speakingBehaviour = speakingBehaviour;
    }


    public void walk(){
       walkingBehaviour.walk();
    }


    public void speak(){
        speakingBehaviour.speak();
    }
}
