import java.util.Scanner;

public class Q2_StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Gender (M/F): ");
        char gender = sc.next().charAt(0);
        System.out.print("Enter Percentage: ");
        float percent = sc.nextFloat();

        System.out.printf("Student Details:\nName: %s\nRoll: %d\nAge: %d\nGender: %c\nPercentage: %.2f%%\n",
                          name, roll, age, gender, percent);
        sc.close();
    }
}
