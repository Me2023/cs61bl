public class DogLauncher {
    public static void main(String[] args) {
        Dog smallDog;                   // Declaration of a Dog variable.
        new Dog(20);                // Instantiation of the Dog class as a Dog Object.
        smallDog = new Dog(5);      // Instantiation and Assignment.
        Dog hugeDog = new Dog(150); //Declaration, instantiation and Assignment.

        smallDog.makeNoise();
        hugeDog.makeNoise(); // Invocation

        /** Class Methods vs. Instance Methods */
        Dog d = new Dog(15);
        Dog d2 = new Dog(100);
        Dog.maxDogClassMethod(d, d2).makeNoise();
        d.maxDogInstanceMethod(d2).makeNoise();

        /** Array Instantiation, Arrays of Objects */
        int[] someArray = new int[5];
        someArray[0] = 3;
        someArray[1] = 4;


        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog(8);
        dogs[1] = new Dog(20);
        dogs[0].makeNoise();
    }
}
