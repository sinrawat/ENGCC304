import java.util.Scanner;

class Rectangle {
    double width;
    double height;
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    double getArea() {
        return width * height;
    }
    double getPerimeter() {
        return 2 * (width + height);
    }
}
public class Lab2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        scanner.close();
    }
}