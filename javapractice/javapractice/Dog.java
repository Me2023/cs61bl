public class Dog {
    /** Instance variable.
     * Can have as many of these as you want. --> Object Instantiation: DogLauncher */
    public int weightInPounds;
    public static String binomen = "Canis familiaris"; //Static Variables

    /** One integer constructor for dogs. --> Object Instantiation: DogLauncher */
    public Dog(int w){
        weightInPounds = w;
    }

    /** Class Methods vs. Instance Methods:
     * Instance methods are actions that can be taken only by a specific instance of a class.
     * Static methods are actions that are taken by the class itself.
     * Instance Methods, a.k.a. non-static methods. */
    public void makeNoise() {
        if (weightInPounds < 10) {
            System.out.println("yip!");
        } else if (weightInPounds < 30) {
            System.out.println("bark.");
        } else {
            System.out.println("woooof!");
        }
    }

    public Dog maxDogInstanceMethod(Dog d2) {
        if (this.weightInPounds > d2.weightInPounds) { // (weightInPounds > d2.weightInPounds)
            return this;
        }
        return d2;
    }

    /** Class Methods, a.k.a. static methods.
     * invoked by Dog.maxDog(d, d2) --> DogLauncher */
    public static Dog maxDogClassMethod(Dog d1, Dog d2) {
        if (d1.weightInPounds > d2.weightInPounds) {
            return d1;
        }
        return d2;
    }


}
