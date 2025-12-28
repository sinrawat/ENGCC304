import java.util.Scanner;

class RentalVehicle {
    protected String model;
    protected double rentalRate;

    public RentalVehicle(String model, double rentalRate) {
        this.model = model;
        this.rentalRate = rentalRate;
    }

    public double calculateFee() {
        return rentalRate;
    }
}

class Car1 extends RentalVehicle {
    public Car1(String model, double rentalRate) {
        super(model, rentalRate);
    }

    public double calculateFee() {
        return rentalRate + 100.0;
    }
}

class Motorcycle extends RentalVehicle {
    public Motorcycle(String model, double rentalRate) {
        super(model, rentalRate);
    }

    @Override
    public double calculateFee() {
        return rentalRate * 1.10;
    }
}

public class Lab5_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("");
        String carModel = sc.nextLine();
        System.out.print("");
        double carRate = sc.nextDouble();
        sc.nextLine();

        System.out.print("");
        String motoModel = sc.nextLine();
        System.out.print("");
        double motoRate = sc.nextDouble();

        Car1 myCar = new Car1(carModel, carRate);
        Motorcycle myMoto = new Motorcycle(motoModel, motoRate);

        RentalVehicle[] vehicles = { myCar, myMoto };

        double totalRentalFee = 0;

        for (RentalVehicle v : vehicles) {
            double fee = v.calculateFee();
            totalRentalFee += fee;
        }

        System.out.println("" + String.format("%.2f", totalRentalFee));

        sc.close();
    }
}
