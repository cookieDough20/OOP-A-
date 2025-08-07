public class Q13_StudentStatic {
    static String college;
    int id;
    String name;

    static {
        college = "Tech University";
    }

    static void changeCollege(String newName) {
        college = newName;
    }

    Q13_StudentStatic(int id, String name) {
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", College: " + college);
    }

    public static void main(String[] args) {
        Q13_StudentStatic s1 = new Q13_StudentStatic(1, "Anu");
        Q13_StudentStatic s2 = new Q13_StudentStatic(2, "Bina");

        s1.display();
        s2.display();

        changeCollege("National College");

        s1.display();
        s2.display();
    }
}
