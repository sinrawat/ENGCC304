import java.util.Scanner;

class Subscription {
    private final String planName;
    private final int durationDays;
    private static int maxDuration = 365;

    public Subscription(String planName, int durationDays) {
        this.planName = planName;
        this.durationDays = Math.max(0, durationDays);
    }

    public Subscription(Subscription other) {
        this(other.planName, other.durationDays);
    }

    public static void setMaxDuration(int max) {
        if (max > 0) {
            maxDuration = max;
            System.out.println("Max duration set to " + maxDuration);
        } else {
            System.out.println("Invalid max policy.");
        }
    }

    public Subscription extend(int days) {
        if (days <= 0) {
            System.out.println("Invalid extension days.");
            return this;
        }

        int totalDays = durationDays + days;
        if (totalDays > maxDuration) {
            System.out.println("Extension failed: Exceeds max policy.");
            return this;
        }

        System.out.println("Extension successful.");
        return new Subscription(planName, totalDays);
    }

    public void displayInfo() {
        System.out.println("Plan: " + planName + ", Days: " + durationDays);
    }
}

public class Lab4_13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            scanner.close();
            return;
        }

        Subscription.setMaxDuration(scanner.nextInt());

        if (!scanner.hasNext()) {
            scanner.close();
            return;
        }

        Subscription subscription = new Subscription(
                scanner.next(),
                scanner.nextInt()
        );

        while (scanner.hasNextInt()) {
            subscription = subscription.extend(scanner.nextInt());
        }

        subscription.displayInfo();
        scanner.close();
    }
}
