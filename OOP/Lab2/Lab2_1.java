import java.util.Scanner;

class Student {
    String studentId;
    String name;
}
public class Lab2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentId = scanner.nextLine();
        String name = scanner.nextLine();
        Student student = new Student();
        student.studentId = studentId;
        student.name = name;
        System.out.println(student.studentId);
        System.out.println(student.name);
        scanner.close();
    }
}