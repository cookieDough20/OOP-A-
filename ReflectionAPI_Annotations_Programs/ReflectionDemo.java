class Product {
    public void showDetails() {
        System.out.println("Product: Laptop, Price: ₹50,000");
    }
}
public class ReflectionDemo {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("Product");
        Object obj = clazz.getDeclaredConstructor().newInstance();
        clazz.getMethod("showDetails").invoke(obj);
    }
}