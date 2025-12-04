import java.util.Scanner;

class Studenttt {
    String studentId;
    String name;
    static int studentCount = 0;
    
    Studenttt(String id, String n) {
        this.studentId = id;
        this.name = n;
        studentCount++;  
    }
}
public class Lab2_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();  
        for (int i = 0; i < N; i++) {
            String studentId = scanner.nextLine();
            String name = scanner.nextLine();
            Studenttt student = new Studenttt(studentId, name);
        }
        System.out.println(Studenttt.studentCount);
        scanner.close();
    }
}