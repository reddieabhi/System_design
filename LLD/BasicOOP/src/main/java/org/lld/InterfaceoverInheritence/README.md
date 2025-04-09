# Interfaces and Composition

## Interfaces
Interfaces are used to define behaviors. When a class implements an interface, it must provide an implementation for all the methods declared in that interface.

If a class needs multiple behaviors, using inheritance isn’t a good idea — inheritance mainly helps in sharing common properties, not behaviors!

That’s why for behaviors, we define separate interfaces, and classes that need those behaviors implement the required interfaces.

---

### Example:
Let’s say we have **walking** and **speaking** behavior in the animal kingdom.

- Animals that can walk will implement `Walkable`
- Animals that can speak will implement `Speakable`
- Animals that can do both will implement both
- Animals that don’t walk or speak won’t implement any behavior

So each animal can independently choose which behavior it needs. No force, no extra baggage.

---

## Package: InterfaceOverInheritence

Here we’ve taken two animals: **Cat** and **Monkey**.

- **Monkey** can only walk → it implements `Walkable`
- **Cat** can walk and speak → it implements both `Walkable` and `Speakable`

In their constructors, we pass in the actual behavior — whether they walk fast or slow, speak fast or slow.

---

### Behavior Classes:

- `FastWalkingBehaviour`
- `SlowWalkingBehaviour`
- `FastSpeakingBehaviour`
- `SlowSpeakingBehaviour`

So when we create a new Monkey or Cat object, we pass which behavior we want them to follow.

```java
Monkey m1 = new Monkey(new FastWalkingBehaviour());
Cat c1 = new Cat(new SlowWalkingBehaviour(), new FastSpeakingBehaviour());
