import java.util.Scanner;

class Employee7 {
    protected String name;
    protected double baseSalary;

    public Employee7(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculatePay() {
        return baseSalary;
    }
}

class SalesEmployee extends Employee7 {
    protected double commissionRate;

    public SalesEmployee(String name, double baseSalary, double commissionRate) {
        super(name, baseSalary);
        this.commissionRate = commissionRate;
    }

    public double calculatePay() {
        return baseSalary + (baseSalary * commissionRate);
    }
}

class Manager extends Employee7 {
    protected double fixedBonus;

    public Manager(String name, double baseSalary, double fixedBonus) {
        super(name, baseSalary);
        this.fixedBonus = fixedBonus;
    }


    public double calculatePay() {
        return baseSalary + fixedBonus;
    }
}

class PayrollProcessor {
    public static void process(Employee7 e) {
        System.out.println(e.name + " total pay: " + e.calculatePay());
    }
}

public class Lab5_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sName = sc.next();
        double sSalary = sc.nextDouble();
        double sRate = sc.nextDouble();
        SalesEmployee sales = new SalesEmployee(sName, sSalary, sRate);

        String mName = sc.next();
        double mSalary = sc.nextDouble();
        double mBonus = sc.nextDouble();
        Manager manager = new Manager(mName, mSalary, mBonus);

        PayrollProcessor.process(sales);
        PayrollProcessor.process(manager);
        
        sc.close();
    }
}
