import java.util.Scanner;

class BankAccount {
    String ownerName;
    double balance;
    BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }
    void deposit(double amount) {
        balance += amount;  
    }
    void displaySummary() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Balance: " + balance);
    }
}
public class Lab2_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ownerName = scanner.nextLine();
        double initialBalance = scanner.nextDouble();
        double depositAmount = scanner.nextDouble();
        BankAccount account = new BankAccount(ownerName, initialBalance);
        account.deposit(depositAmount);
        account.displaySummary();
        scanner.close();
    }
}