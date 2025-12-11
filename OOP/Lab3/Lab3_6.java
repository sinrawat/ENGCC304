import java.util.Scanner;

public class Lab3_6 {

    public static class BankAccount {
        private double balance; 

        public BankAccount(double initialBalance) {
            if (initialBalance >= 0) {
                balance = initialBalance;
            } else {
                balance = 0;
            }
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println("Deposit successful.");
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }

        public void withdraw(double amount) {
            if (amount > 0) {
                if (amount <= balance) {
                    balance -= amount;
                    System.out.println("Withdrawal successful.");
                } else {
                    System.out.println("Insufficient funds.");
                }
            } else {
                System.out.println("Invalid withdrawal amount.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("");
        double initial = sc.nextDouble();

        System.out.print("");
        double dep = sc.nextDouble();

        System.out.print("");
        double wd = sc.nextDouble();

        BankAccount acc = new BankAccount(initial);

        acc.deposit(dep);
        acc.withdraw(wd);

        System.out.println("Final Balance: " + acc.getBalance());
    }
}
