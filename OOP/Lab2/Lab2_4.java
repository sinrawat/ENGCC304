import java.util.Scanner;

class Studentttt {
    String name;
    int midtermScore;
    int finalScore;

    Studentttt(String name, int midtermScore, int finalScore) {
        this.name = name;
        this.midtermScore = midtermScore;
        this.finalScore = finalScore;
    }
    double calculateAverage() {
        return (midtermScore + finalScore) / 2.0;
    }
    void displaySummary() {
        double average = calculateAverage();
        String status = (average >= 50.0) ? "Pass" : "Fail";
        System.out.println("Name: " + name);
        System.out.println("Average Score: " + average);
        System.out.println("Status: " + status);
    }
}

public class Lab2_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int midtermScore = scanner.nextInt();
        int finalScore = scanner.nextInt();
        Studentttt student = new Studentttt(name, midtermScore, finalScore);
        student.displaySummary();
        scanner.close();
    }
}