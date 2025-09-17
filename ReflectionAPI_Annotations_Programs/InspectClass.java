import java.lang.reflect.*;
class Employee {
    private String name;
    private int id;
    public void display() {}
    public int getId() { return id; }
}
public class InspectClass {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("Employee");
        System.out.println("Fields:");
        for (Field f : clazz.getDeclaredFields()) {
            System.out.println(f.getName() + " : " + f.getType());
        }
        System.out.println("\nMethods:");
        for (Method m : clazz.getDeclaredMethods()) {
            System.out.println(m.getName() + " : " + m.getReturnType());
        }
    }
}