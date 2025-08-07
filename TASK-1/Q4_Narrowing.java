import java.util.Scanner;

public class Q4_Narrowing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a double value: ");
        double d = sc.nextDouble();
        int i = (int) d;

        System.out.println("Double: " + d);
        System.out.println("Converted to int: " + i);
        sc.close();
    }
}
