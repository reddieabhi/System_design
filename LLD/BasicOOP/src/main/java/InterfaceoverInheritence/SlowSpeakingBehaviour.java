package org.lld.InterfaceoverInheritence;

public class SlowSpeakingBehaviour implements SpeakingBehaviour{

    @Override
    public void speak() {
        System.out.println("Speaking slowly");
    }
}
