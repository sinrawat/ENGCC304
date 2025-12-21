import java.util.Scanner;

class Location {
    private double latitude;
    private double longitude;

    public Location(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Location(Location location) {
        this.latitude = location.latitude;
        this.longitude = location.longitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void displayInfo() {
        System.out.println("Lat: " + latitude + ", Lon: " + longitude);
    }
}

public class Lab4_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double startLatitude = scanner.nextDouble();
        double startLongitude = scanner.nextDouble();
        double newLatitude = scanner.nextDouble();

        Location originalLocation = new Location(startLatitude, startLongitude);
        Location copiedLocation = new Location(originalLocation);

        originalLocation.setLatitude(newLatitude);

        originalLocation.displayInfo();
        copiedLocation.displayInfo();

        scanner.close();
    }
}
