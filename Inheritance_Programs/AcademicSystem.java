class Person {
    public void displayInfo() {
        System.out.println("Person Information");
    }
}
class Student extends Person {
    int studentID = 101;
    public void displayStudent() {
        System.out.println("Student ID: " + studentID);
    }
}
class GraduateStudent extends Student {
    public void submitThesis() {
        System.out.println("Graduate Student submitted thesis");
    }
}
public class AcademicSystem {
    public static void main(String[] args) {
        GraduateStudent gs = new GraduateStudent();
        gs.displayInfo();
        gs.displayStudent();
        gs.submitThesis();
    }
}