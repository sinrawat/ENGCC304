import java.util.Scanner;

class Employee3 {
    protected double salary;
    
    public double calculateBonus() {
        return salary * 0.10;
    }
}

class Manager3 extends Employee3 {
    @Override
    public double calculateBonus() {
        double basicBonus = super.calculateBonus();
        double managerExtra = salary * 0.05;
        return basicBonus + managerExtra;
    }
}

public class Lab5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double salary = sc.nextDouble();
        
        Manager3 manager = new Manager3();
        manager.salary = salary;
        
        System.out.println(manager.calculateBonus());
        
        sc.close();
    }
}
