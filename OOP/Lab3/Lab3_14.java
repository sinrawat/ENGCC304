import java.util.Scanner;

class BankAccount14 {
    private double balance;
    private static int totalTransactionCount = 0;

    public BankAccount14(double initialDeposit) {
        if (initialDeposit >= 0) {
            this.balance = initialDeposit;
        } else {
            this.balance = 0;
        }
        System.out.println("Account created.");
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            totalTransactionCount++;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
            totalTransactionCount++;
            System.out.println("Withdrawal successful.");
        }
    }

    public static int getTotalTransactionCount() {
        return totalTransactionCount;
    }
}
public class Lab3_14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount14 myAccount = null;
        int N = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < N; i++) {
            String command = scanner.nextLine().trim();
            
            switch (command) {
                case "CREATE":
                    double initialDeposit = Double.parseDouble(scanner.nextLine());
                    myAccount = new BankAccount14(initialDeposit);
                    break;
                    
                case "DEPOSIT":
                    if (myAccount == null) {
                        System.out.println("No account exists.");
                    } else {
                        double depositAmount = Double.parseDouble(scanner.nextLine());
                        myAccount.deposit(depositAmount);
                    }
                    break;
                    
                case "WITHDRAW":
                    if (myAccount == null) {
                        System.out.println("No account exists.");
                    } else {
                        double withdrawAmount = Double.parseDouble(scanner.nextLine());
                        myAccount.withdraw(withdrawAmount);
                    }
                    break;
                    
                case "STATUS":
                    if (myAccount == null) {
                        System.out.println("No account exists.");
                    } else {
                        System.out.println("Balance: " + myAccount.getBalance());
                    }
                    break;
                    
                case "GLOBAL_STATUS":
                    System.out.println("Total Transactions: " + BankAccount14.getTotalTransactionCount());
                    break;
            }
        }
        
        scanner.close();
    }
}