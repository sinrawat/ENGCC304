import java.util.Scanner;

class Item {
    protected String name;
    
    public Item(String name) { 
        this.name = name; 
    }
    
    public double getValue() {
        return 0.0;
    }
}

class PhysicalProduct extends Item {
    protected double unitPrice;
    protected int quantity;
    
    public PhysicalProduct(String name, double unitPrice, int quantity) {
        super(name);
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }
    
    @Override
    public double getValue() {
        return unitPrice * quantity;
    }
}

class DigitalSubscription extends Item {
    protected double monthlyCost;
    protected int months;
    
    public DigitalSubscription(String name, double monthlyCost, int months) {
        super(name);
        this.monthlyCost = monthlyCost;
        this.months = months;
    }
    
    @Override
    public double getValue() {
        return monthlyCost * months;
    }
}

public class Lab5_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String productName = sc.nextLine();
        double unitPrice = sc.nextDouble();
        int quantity = sc.nextInt();
        sc.nextLine();
        
        String subscriptionName = sc.nextLine();
        double monthlyCost = sc.nextDouble();
        int months = sc.nextInt();
        
        PhysicalProduct product = new PhysicalProduct(productName, unitPrice, quantity);
        DigitalSubscription subscription = new DigitalSubscription(subscriptionName, monthlyCost, months);
        
        Item[] items = {product, subscription};
        
        double totalValue = 0;
        
        for (Item item : items) {
            totalValue += item.getValue();
        }
        
        System.out.println(totalValue);
        
        sc.close();
    }
}
