import java.util.Scanner;

class BankAccountt {
    String ownerName;
    double balance;
    BankAccountt(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;  
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }
    void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}
public class Lab2_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ownerName = scanner.nextLine();
        double initialBalance = scanner.nextDouble();
        double withdrawAmount1 = scanner.nextDouble();
        double withdrawAmount2 = scanner.nextDouble();
        BankAccountt account = new BankAccountt(ownerName, initialBalance);
        account.withdraw(withdrawAmount1);
        account.withdraw(withdrawAmount2);
        account.displayBalance();
        scanner.close();
    }
}