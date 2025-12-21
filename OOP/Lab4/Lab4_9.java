import java.util.Scanner;

class ImmutableAccount {
    private final String accountId;
    private final double balance;

    public ImmutableAccount(String accountId, double balance) {
        this.accountId = accountId;
        this.balance = Math.max(0.0, balance);
    }

    public ImmutableAccount(ImmutableAccount other) {
        this(other.accountId, other.balance);
    }

    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public ImmutableAccount deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return this;
        }
        return new ImmutableAccount(accountId, balance + amount);
    }

    public ImmutableAccount withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return this;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return this;
        }
        return new ImmutableAccount(accountId, balance - amount);
    }

    public void displayInfo() {
        System.out.println("ID: " + accountId + ", Balance: " + balance);
    }
}

public class Lab4_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ImmutableAccount account = new ImmutableAccount(
                scanner.next(),
                scanner.nextDouble()
        );

        account = account.deposit(scanner.nextDouble());
        account = account.withdraw(scanner.nextDouble());

        account.displayInfo();
        scanner.close();
    }
}
