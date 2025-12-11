import java.util.Scanner;

class SystemLogger {
    private static int currentLogLevel = 1;

    private static String getLevelName(int level) {
        switch (level) {
            case 1: return "INFO";
            case 2: return "DEBUG";
            case 3: return "ERROR";
            default: return "UNKNOWN";
        }
    }

    public static void setLogLevel(int newLevel) {
        if (newLevel >= 1 && newLevel <= 3) {
            currentLogLevel = newLevel;
            System.out.println("Log level set to " + getLevelName(newLevel));
        } else {
            System.out.println("Invalid log level.");
        }
    }

    public static void log(int messageLevel, String message) {
        if (messageLevel >= currentLogLevel) {
            System.out.println("[" + getLevelName(messageLevel) + "]: " + message);
        }
    }
}

public class Lab3_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < N; i++) {
            String command = scanner.nextLine().trim();
            
            if (command.equals("SET")) {
                int newLevel = Integer.parseInt(scanner.nextLine());
                SystemLogger.setLogLevel(newLevel);
            } else if (command.equals("LOG")) {
                int messageLevel = Integer.parseInt(scanner.nextLine());
                String message = scanner.nextLine();
                SystemLogger.log(messageLevel, message);
            }
        }
        
        scanner.close();
    }
}