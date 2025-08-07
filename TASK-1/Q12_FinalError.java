public class Q12_FinalError {
    public static void main(String[] args) {
        final int x = 10;
        // x = 20; // ❌ Uncommenting this line will cause a compile-time error
        System.out.println("x = " + x);
    }
}
