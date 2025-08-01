package InterfaceoverInheritence;

public class FastSpeakingBehaviour implements SpeakingBehaviour {

    @Override
    public void speak() {
        System.out.println("Speaking fast");
    }
}
