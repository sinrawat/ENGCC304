import java.util.Scanner;

public class Lab1_10 {
    public static double calculateArea(double width, double height) {
        return width * height;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        double area = calculateArea(width, height);
        System.out.println(area);
        scanner.close();
    }
}