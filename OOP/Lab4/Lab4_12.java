import java.util.Scanner;

class Schedule {
    private int hour;

    public Schedule(int hour) {
        this.hour = hour;
    }

    public Schedule(Schedule other) {
        this.hour = other.hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }
}

class EmployeeSchedule {
    private final String name;
    private final Schedule schedule;

    public EmployeeSchedule(String name, Schedule schedule) {
        this.name = name;
        this.schedule = schedule;
    }

    public EmployeeSchedule(EmployeeSchedule other) {
        this.name = other.name;
        this.schedule = new Schedule(other.schedule);
    }

    public void displaySchedule() {
        System.out.println(name + ": " + schedule.getHour() + ":00");
    }
}

public class Lab4_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int startHour = scanner.nextInt();
        int newHour = scanner.nextInt();

        Schedule originalSchedule = new Schedule(startHour);

        EmployeeSchedule emp1 = new EmployeeSchedule(name, originalSchedule);
        EmployeeSchedule emp2 = new EmployeeSchedule(emp1);

        originalSchedule.setHour(newHour);

        emp1.displaySchedule();
        emp2.displaySchedule();

        scanner.close();
    }
}
