import java.util.Scanner;

class Player {
    private String username;
    private int level;

    public Player() {
        username = "Guest";
        level = 1;
    }

    public Player(String username, int level) {
        this.username = username;
        this.level = level;
    }

    public void displayProfile() {
        System.out.println("User: " + username + ", Level: " + level);
    }
}

public class Lab4_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mode = scanner.nextInt();
        scanner.nextLine();

        Player player;

        if (mode == 1) {
            player = new Player();
        } else {
            String username = scanner.nextLine();
            int level = scanner.nextInt();
            player = new Player(username, level);
        }

        player.displayProfile();
        scanner.close();
    }
}
