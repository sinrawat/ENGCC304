import java.util.Scanner;

class User15 {
    private String username;
    private int failedAttempts;
    private boolean isLocked;
    private static int maxAttempts = 3;

    public User15(String username) {
        this.username = username;
        this.failedAttempts = 0;
        this.isLocked = false;
    }

    public static void setPolicy(int max) {
        if (max > 0) {
            maxAttempts = max;
            System.out.println("Policy updated.");
        } else {
            System.out.println("Invalid policy.");
        }
    }

    public String getUsername() {
        return username;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public int getFailedAttempts() {
        return failedAttempts;
    }

    public void login(String password) {
        if (isLocked) {
            System.out.println("Account is locked.");
            return;
        }
        if (password.equals("pass123")) {
            failedAttempts = 0;
            System.out.println("Login successful.");
            return;
        }
        failedAttempts++;
        
        if (failedAttempts >= maxAttempts) {
            isLocked = true;
            System.out.println("Login failed. Account locked.");
        } else {
            int attemptsLeft = maxAttempts - failedAttempts;
            System.out.println("Login failed. " + attemptsLeft + " attempts left.");
        }
    }
}

public class Lab3_15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        User15 user = new User15(username);
        int N = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < N; i++) {
            String command = scanner.nextLine().trim();
            
            if (command.equals("SET_POLICY")) {
                int newMax = Integer.parseInt(scanner.nextLine());
                User15.setPolicy(newMax);
            } else if (command.equals("LOGIN")) {
                String password = scanner.nextLine();
                user.login(password);
            }
        }
        scanner.close();
    }
}