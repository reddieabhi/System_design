# Bridge Design Pattern

Bridge design pattern involves in decoupling the interfaces and classes so that each of them cam scale independently. 
We understand it better with following example.

## Example
- We have many animals (Cat, Monkey, Cow) and a base animal class, which all animals extends.

### Problem :
- If we hard code behaviours into each animal class, we end up creating too many sub classes
- There is a possibility to create (n*m) subclasses. 
  - n is number of animals and m is variants
  - Adding a new behaviour can result in adding m classes.
- If we have walking and speaking 
  - Fast walking, slow speaking
  - Fast walking, fast speaking
  - Slow walking, slow speaking
  - Slow walking, fast speaking
- For 2 pairs we got 4 classes . 2 more behaviours result in many classes. 

### Solution
- Decouple interfaces and behaviour by creating one interface per behaviour.
- Type of behaviour will be class implementing the behaviour
- Few behaviours of animals are separate interfaces and each interface has multiple classes implementing specifying adjective(fast/slow) of that. 
- Any newly created animal can extend animal **(new animal is a Animal)** and can have other behaviours. New animal can implement other behaviours whichever required by it. 
- While creating object of any animal class, we specify its behaviours in constructor.
- Class Animal (Base class) [Animal](./Animal.java)
- Interface Walking [Walking](./WalkingBehaviour.java)
- Interface Speaking [Speaking](./SpeakingBehaviour.java)
- Interface Flying 
- Interface someBehaviour
- Concrete Classes Fast walking and slow walking implements Walking interface [Fast Walking](./FastWalkingBehaviour.java)
- Concrete Classes fast speaking and slow speaking implements speaking interface [Slow Speaking](./SlowSpeakingBehaviour.java)  [Fast Speaking](./FastSpeakingBehaviour.java)
- Now any animal will extend class animal and takes the behaviours as attributes