import java.util.Scanner;

class Car {
    private String model;
    private int year;
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int newYear) {
        this.year = newYear;
    }
}
public class Lab2_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String model = scanner.nextLine();
        int year = scanner.nextInt();
        int newYear = scanner.nextInt();
        Car car = new Car(model, year);
        car.setYear(newYear);
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());
        scanner.close();
    }
}