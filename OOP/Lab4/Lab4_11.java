import java.util.Scanner;

class Configuration {
    private final String theme;
    private final int fontSize;
    private final boolean darkMode;

    public Configuration(String theme, int fontSize, boolean darkMode) {
        this.theme = theme;
        this.fontSize = clamp(fontSize);
        this.darkMode = darkMode;
    }

    public Configuration(Configuration base, Configuration user) {
        this(user.theme, base.fontSize, user.darkMode);
    }

    private static int clamp(int size) {
        return Math.max(10, Math.min(20, size));
    }

    public void displaySettings() {
        System.out.printf(
                "Theme: [%s], Size: [%d], Dark: [%b]%n",
                theme, fontSize, darkMode
        );
    }
}

public class Lab4_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Configuration baseConfig = new Configuration(
                scanner.next(),
                scanner.nextInt(),
                scanner.nextBoolean()
        );

        Configuration userConfig = new Configuration(
                scanner.next(),
                scanner.nextInt(),
                scanner.nextBoolean()
        );

        Configuration finalConfig = new Configuration(baseConfig, userConfig);
        finalConfig.displaySettings();

        scanner.close();
    }
}
