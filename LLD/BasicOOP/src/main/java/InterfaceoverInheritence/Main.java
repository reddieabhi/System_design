package InterfaceoverInheritence;

public class Main {
    public static void main(String[] args){
        Monkey m1 = new Monkey(new FastWalkingBehaviour());
        Monkey m2 = new Monkey(new FastWalkingBehaviour());

        m1.walk(); // prints walking fast
        m2.walk(); // prints walking fast

        Cat c1 = new Cat(new FastWalkingBehaviour(), new SlowSpeakingBehaviour());
        Cat c2 = new Cat(new FastWalkingBehaviour(), new FastSpeakingBehaviour());

        c1.speak(); // speaks slowly
        c2.speak(); // speaks fast

        c2.walk();
        c1.walk();

        // changing behaviour at run time
        c2.speakingBehaviour = new SlowSpeakingBehaviour();

    }
}
