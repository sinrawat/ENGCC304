import java.util.Scanner;

class Shipping {
    protected String trackingId;
    protected double baseFee;

    public Shipping(String trackingId, double baseFee) {
        this.trackingId = trackingId;
        this.baseFee = baseFee;
    }

    public double calculateTotalFee() {
        return baseFee;
    }
}

class StandardShipping extends Shipping {
    public StandardShipping(String id, double baseFee) {
        super(id, baseFee);
    }

    @Override
    public double calculateTotalFee() {
        return baseFee * 1.05;
    }
}

class PremiumShipping extends Shipping {
    protected double insuranceFee;

    public PremiumShipping(String id, double baseFee, double insuranceFee) {
        super(id, baseFee);
        this.insuranceFee = insuranceFee;
    }

    @Override
    public double calculateTotalFee() {
        return super.calculateTotalFee() + insuranceFee;
    }
}

public class Lab5_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sId = sc.next();
        double sBase = sc.nextDouble();
        StandardShipping std = new StandardShipping(sId, sBase);

        String pId = sc.next();
        double pBase = sc.nextDouble();
        double pInsure = sc.nextDouble();
        PremiumShipping pre = new PremiumShipping(pId, pBase, pInsure);

        Shipping[] shipments = new Shipping[2];
        shipments[0] = std;
        shipments[1] = pre;

        for (Shipping s : shipments) {
            System.out.println(s.calculateTotalFee());
        }
        
        sc.close();
    }
}
