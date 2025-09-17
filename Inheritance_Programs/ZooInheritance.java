class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }
}
class Lion extends Animal {
    public void roar() {
        System.out.println("Lion is roaring");
    }
}
public class ZooInheritance {
    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.eat();
        lion.roar();
    }
}