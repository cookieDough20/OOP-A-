public class Q14_Bank {
    static String bankName;
    static double baseInterestRate;
    int accNo;
    String holderName;
    double balance;

    static {
        bankName = "RBI Bank";
        baseInterestRate = 4.5;
    }

    Q14_Bank(int accNo, String holder, double balance) {
        this.accNo = accNo;
        this.holderName = holder;
        this.balance = balance;
    }

    static void changeRate(double newRate) {
        baseInterestRate = newRate;
    }

    void display() {
        System.out.println("Bank: " + bankName + ", AccNo: " + accNo + ", Name: " + holderName + ", Balance: " + balance);
    }

    public static void main(String[] args) {
        Q14_Bank b1 = new Q14_Bank(1001, "Ravi", 5000);
        Q14_Bank b2 = new Q14_Bank(1002, "Maya", 8000);

        b1.display();
        b2.display();

        changeRate(5.0);
        System.out.println("New Interest Rate: " + baseInterestRate);
    }
}
