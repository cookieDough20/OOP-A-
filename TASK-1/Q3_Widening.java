public class Q3_Widening {
    public static void main(String[] args) {
        int a = 100;
        long b = a;
        float c = b;

        System.out.println("int: " + a);
        System.out.println("long: " + b);
        System.out.println("float: " + c);
    }
}
