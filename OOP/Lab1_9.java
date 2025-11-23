import java.util.Scanner;

public class Lab1_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += numbers[i];
        }
        double average = (double) sum / n;
        System.out.println(average);
        scanner.close();
    }
}