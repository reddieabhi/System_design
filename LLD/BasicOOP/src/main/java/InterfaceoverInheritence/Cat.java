package InterfaceoverInheritence;

public class Cat extends Animal implements Walkable,Speakable{
    WalkingBehaviour walkingBehaviour;
    SpeakingBehaviour speakingBehaviour;

    Cat(WalkingBehaviour walkingBehaviour, SpeakingBehaviour speakingBehaviour){
        this.walkingBehaviour = walkingBehaviour;
        this.speakingBehaviour = speakingBehaviour;
    }

    @Override
    public void walk(){
       walkingBehaviour.walk();
    }

    @Override
    public void speak(){
        speakingBehaviour.speak();
    }
}
