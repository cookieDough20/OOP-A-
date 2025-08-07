// Parent class
class Animal {
    void eat() {
        System.out.println("Animal is eating.");
    }
}

// Child class (inherits from Animal)
class Lion extends Animal {
    void roar() {
        System.out.println("Lion is roaring.");
    }
}

// Main method
public class ZooApp {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat();   // inherited
        lion.roar();  // specific to Lion
    }
}
