import java.util.Scanner;

class TimePeriod {
    private int startHour;
    private int endHour;

    public TimePeriod() {
        this(9, 17);
    }

    public TimePeriod(int startHour, int endHour) {
        this.startHour = normalize(startHour);
        this.endHour = normalize(endHour);

        if (this.startHour > this.endHour) {
            int temp = this.startHour;
            this.startHour = this.endHour;
            this.endHour = temp;
        }
    }

    private int normalize(int hour) {
        return Math.max(0, Math.min(23, hour));
    }

    public void displayPeriod() {
        System.out.println(startHour + ":00 - " + endHour + ":00");
    }
}

public class Lab4_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mode = scanner.nextInt();
        TimePeriod period;

        if (mode == 1) {
            period = new TimePeriod();
        } else {
            period = new TimePeriod(
                    scanner.nextInt(),
                    scanner.nextInt()
            );
        }

        period.displayPeriod();
        scanner.close();
    }
}
