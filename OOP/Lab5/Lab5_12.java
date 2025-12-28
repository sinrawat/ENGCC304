import java.util.Scanner;

class Service {
    protected String name;
    protected double basePrice;

    public Service(String name, double basePrice) {
        this.name = name;
        this.basePrice = basePrice;
    }

    public double calculateFinalPrice() {
        return basePrice;
    }
}

class BasicService extends Service {
    public BasicService(String name, double basePrice) {
        super(name, basePrice);
    }

    @Override
    public double calculateFinalPrice() {
        return basePrice * 1.05;
    }
}

class PremiumService extends Service {
    protected double premiumRate;

    public PremiumService(String name, double basePrice, double premiumRate) {
        super(name, basePrice);
        this.premiumRate = premiumRate;
    }

    @Override
    public double calculateFinalPrice() {
        return basePrice * (1 + premiumRate);
    }
}

public class Lab5_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String bName = sc.nextLine();
        double bPrice = sc.nextDouble();
        sc.nextLine();

        String pName = sc.nextLine();
        double pPrice = sc.nextDouble();
        double pRate = sc.nextDouble();

        Service[] services = new Service[2];
        services[0] = new BasicService(bName, bPrice);
        services[1] = new PremiumService(pName, pPrice, pRate);

        for (Service s : services) {
            System.out.println(s.name + " " + s.calculateFinalPrice());
        }

        sc.close();
    }
}
