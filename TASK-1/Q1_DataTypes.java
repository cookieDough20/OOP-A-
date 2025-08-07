public class Q1_DataTypes {
    public static void main(String[] args) {
        byte b = 100;
        short s = 32000;
        int i = 123456;
        long l = 9876543210L;
        float f = 3.14f;
        double d = 123.456;
        char c = 'A';
        boolean bool = true;

        System.out.println("Byte: " + b + " (Size: " + Byte.BYTES + " bytes)");
        System.out.println("Short: " + s + " (Size: " + Short.BYTES + " bytes)");
        System.out.println("Int: " + i + " (Size: " + Integer.BYTES + " bytes)");
        System.out.println("Long: " + l + " (Size: " + Long.BYTES + " bytes)");
        System.out.println("Float: " + f + " (Size: " + Float.BYTES + " bytes)");
        System.out.println("Double: " + d + " (Size: " + Double.BYTES + " bytes)");
        System.out.println("Char: " + c + " (Size: " + Character.BYTES + " bytes)");
        System.out.println("Boolean: " + bool + " (Size: 1 bit)");
    }
}
