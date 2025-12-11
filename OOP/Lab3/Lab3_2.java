import java.util.Scanner;

class Player {
    private int score;

    public Player(int initialScore) {
        this.score = initialScore;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int newScore) {
        this.score = newScore;
    }
}

public class Lab3_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialScore = scanner.nextInt();
        int updatedScore = scanner.nextInt();
        scanner.close();
        Player player = new Player(initialScore);
        player.setScore(updatedScore);
        System.out.println(player.getScore());
    }
}