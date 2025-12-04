import java.util.Scanner;

class Studentt {
    String studentId;
    String name;

    void displayInfo() {
        System.out.println(studentId);
        System.out.println(name);
    }
}
public class Lab2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentId = scanner.nextLine();
        String name = scanner.nextLine();
        Studentt student = new Studentt();
        student.studentId = studentId;
        student.name = name;
        student.displayInfo();
        scanner.close();
    }
}