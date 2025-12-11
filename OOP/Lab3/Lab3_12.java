import java.util.Scanner;

class Employee12 {
    private String name;
    private double monthlySalary;

    public Employee12(String name, double monthlySalary) {
        this.name = name;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0;
        }
    }

    public String getName() {
        return name;
    }

    public void giveRaise(double amount) {
        if (amount > 0) {
            monthlySalary += amount;
            System.out.println("Raise applied.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    private double getAnnualSalary() {
        return monthlySalary * 12;
    }

    public double calculateTax(double taxRate) {
        return getAnnualSalary() * taxRate;
    }
}

public class Lab3_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double monthlySalary = Double.parseDouble(scanner.nextLine());
        double taxRate = Double.parseDouble(scanner.nextLine());
        double raiseAmount = Double.parseDouble(scanner.nextLine());
        Employee12 employee = new Employee12(name, monthlySalary);
        double taxBefore = employee.calculateTax(taxRate);
        System.out.println("Tax (Before): " + taxBefore);
        employee.giveRaise(raiseAmount);
        double taxAfter = employee.calculateTax(taxRate);
        System.out.println("Tax (After): " + taxAfter);
        scanner.close();
    }
}