import java.util.Scanner;

class SystemConfig {
    private static SystemConfig instance;
    private String serverUrl;
    private int maxConnections;

    private SystemConfig() {
        this.serverUrl = "default.server.com";
        this.maxConnections = 10;
    }

    public static SystemConfig getInstance() {
        if (instance == null) {
            instance = new SystemConfig();
        }
        return instance;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String url) {
        this.serverUrl = url;
    }

    public int getMaxConnections() {
        return maxConnections;
    }

    public void setMaxConnections(int count) {
        if (count > 0) {
            this.maxConnections = count;
            System.out.println("Max connections set.");
        } else {
            System.out.println("Invalid count.");
        }
    }
}

public class Lab3_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < N; i++) {
            String command = scanner.nextLine().trim();
            SystemConfig config = SystemConfig.getInstance();
            
            if (command.equals("SET_URL")) {
                String url = scanner.nextLine();
                config.setServerUrl(url);
            } else if (command.equals("SET_MAX")) {
                int count = Integer.parseInt(scanner.nextLine());
                config.setMaxConnections(count);
            } else if (command.equals("SHOW")) {
                System.out.println("URL: " + config.getServerUrl());
                System.out.println("MAX: " + config.getMaxConnections());
            }
        }
        
        scanner.close();
    }
}