class Animal {
    public void eat() {
        System.out.println("Animal eats food");
    }
}
class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }
}
class Puppy extends Dog {
    public void weep() {
        System.out.println("Puppy is weeping");
    }
}
public class PetManagement {
    public static void main(String[] args) {
        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.bark();
        puppy.weep();
    }
}