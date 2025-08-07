import java.util.Scanner;

public class Q7_Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        double avg = (a + b + c) / 3.0;  // Using 3.0 for correct float division
        System.out.println("Average: " + avg);
        sc.close();
    }
}
