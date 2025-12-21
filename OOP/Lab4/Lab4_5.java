import java.util.Scanner;

class Color {
    private final int red;
    private final int green;
    private final int blue;

    public Color(int red, int green, int blue) {
        this.red = clamp(red);
        this.green = clamp(green);
        this.blue = clamp(blue);
    }

    private static int clamp(int value) {
        return Math.max(0, Math.min(255, value));
    }

    public void displayRGB() {
        System.out.printf("R=[%d], G=[%d], B=[%d]%n", red, green, blue);
    }
}

public class Lab4_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Color color = new Color(
                scanner.nextInt(),
                scanner.nextInt(),
                scanner.nextInt()
        );

        color.displayRGB();
        scanner.close();
    }
}
