class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog is barking.");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("Puppy is weeping.");
    }
}

public class PetApp {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat();   // from Animal
        puppy.bark();  // from Dog
        puppy.weep();  // own method
    }
}
