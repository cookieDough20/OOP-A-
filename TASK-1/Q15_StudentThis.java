public class Q15_StudentThis {
    int id;
    String name, course;

    Q15_StudentThis() {
        this(101, "Default", "CSE");
    }

    Q15_StudentThis(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    void display() {
<<<<<<< HEAD
        System.out.println("ID: " + this.id + ", Namne: " + this.name + ", Course: " + this.course);
=======
        System.out.println("ID: " + this.id + ", Name: " + this.name + ", Course: " + this.course);
>>>>>>> c164e98ec9747bc203084566aa6aaa7a932b2d07
    }

    public static void main(String[] args) {
        Q15_StudentThis s1 = new Q15_StudentThis();
        Q15_StudentThis s2 = new Q15_StudentThis(102, "Riya", "ECE");

        s1.display();
        s2.display();
    }
}
