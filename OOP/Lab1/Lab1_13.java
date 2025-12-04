import java.util.Scanner;

public class Lab1_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();
        int C = scanner.nextInt();
        int[][] grid = new int[R][C];
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
        int onlineCount = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (grid[i][j] == 1) {
                    onlineCount++;
                }
            }
        }
        System.out.println(onlineCount);
        scanner.close();
    }
}