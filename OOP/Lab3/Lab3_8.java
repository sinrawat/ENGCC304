import java.util.Scanner;

class InventoryItem {
    private String productName;
    private int stock;

    // Constructor
    public InventoryItem(String productName, int initialStock) {
        this.productName = productName;

        if (initialStock >= 0) {
            this.stock = initialStock;
        } else {
            this.stock = 0;
        }
    }

    public String getProductName() {
        return productName;
    }

    public int getStock() {
        return stock;
    }

    public void addStock(int amount) {
        if (amount > 0) {
            stock += amount;
            System.out.println("Stock added.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void sellStock(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } 
        else if (amount > stock) {
            System.out.println("Not enough stock.");
        } 
        else {
            stock -= amount;
            System.out.println("Sale successful.");
        }
    }
}

public class Lab3_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // รับข้อมูลเริ่มต้น
        String name = sc.nextLine();
        int initial = sc.nextInt();

        InventoryItem item = new InventoryItem(name, initial);

        int N = sc.nextInt(); // จำนวนคำสั่ง

        for (int i = 0; i < N; i++) {
            String command = sc.next();
            int amount = sc.nextInt();

            if (command.equals("ADD")) {
                item.addStock(amount);
            } 
            else if (command.equals("SELL")) {
                item.sellStock(amount);
            }
        }

        System.out.println("Final Stock: " + item.getStock());
        sc.close();
    }
}
