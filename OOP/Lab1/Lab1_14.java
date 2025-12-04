import java.util.Scanner;

public class Lab1_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();
        int C = scanner.nextInt();
        char[][] map = new char[R][C];
        for (int i = 0; i < R; i++) {
            String row = scanner.next();
            for (int j = 0; j < C; j++) {
                map[i][j] = row.charAt(j);
            }
        }
        int targetR = scanner.nextInt();
        int targetC = scanner.nextInt();
        if (map[targetR][targetC] == '*') {
            System.out.println("Mine");
        } else {
            int mineCount = 0;
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    if (i == 0 && j == 0) continue;
                    int newR = targetR + i;
                    int newC = targetC + j;
                    if (newR >= 0 && newR < R && newC >= 0 && newC < C) {
                        if (map[newR][newC] == '*') {
                            mineCount++;
                        }
                    }
                }
            }
            System.out.println(mineCount);
        }
        scanner.close();
    }
}