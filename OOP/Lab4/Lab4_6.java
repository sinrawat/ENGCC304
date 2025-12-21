
import java.util.Scanner;

class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point move(int dx, int dy) {
        return new Point(x + dx, y + dy);
    }

    public void displayInfo() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

public class Lab4_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Point start = new Point(
                scanner.nextInt(),
                scanner.nextInt()
        );

        int dx = scanner.nextInt();
        int dy = scanner.nextInt();

        Point second = start.move(dx, dy);
        Point third = second.move(dx, dy);

        start.displayInfo();
        second.displayInfo();
        third.displayInfo();

        scanner.close();
    }
}
