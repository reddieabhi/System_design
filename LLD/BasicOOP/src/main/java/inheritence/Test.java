package inheritence;

public class Test {
    // Normal Usage


    public static void main(String[] args) {
        Animal a = new Animal();
        Monkey m = new Monkey();

        a.makeSound();  // common sound
        m.makeSound();  // monkey sound


        // upcasting
        Animal m1 = new Monkey();  // this will be having Animal functions only,
        // if something is overridden in monkey then that method will be called. Only monkey functions
        // are not available here.
        m1.makeSound(); // animal object but monkey sound

        //downcasting

        //1
//    Monkey m2 = new Animal(); this will cause run time error, as few only animal methods
        // are not here. And we are expecting newly created Animal object to have monkey methods

        //2
        Animal m2 = new Monkey();
        Monkey m3 = (Monkey) m2; // this will work as m2 is already animal but in above line when it
        // was upcasted few monkey only methods are blocked now this after downcasting again they
        // can be accessible again
        m2.makeSound(); // initially we dont know its monkey while creating, but we know it is
        // Animal hence upcasted first and then later if confirmed that it is of type Monkey we are
        // downcasting to monkey.
    }

}
