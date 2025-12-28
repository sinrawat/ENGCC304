import java.util.Scanner;

class Vehicle {
    protected String color;

    public Vehicle(String color) {
        this.color = color;
    }
}

class Car extends Vehicle {
    protected int wheels;

    public Car(String color, int wheels) {
        super(color);
        this.wheels = wheels;
    }

    public void displayDetails() {
        System.out.println("Color: " + color + ", Wheels: " + wheels);
    }
}

public class Lab5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String color = sc.nextLine();
        int wheels = sc.nextInt();
        
        Car car = new Car(color, wheels);
        car.displayDetails();
        
        sc.close();
    }
}
