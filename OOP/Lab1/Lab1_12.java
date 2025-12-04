import java.util.Scanner;

public class Lab1_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] productIDs = new int[n];
        int[] stockQuantities = new int[n];
        for (int i = 0; i < n; i++) {
            productIDs[i] = scanner.nextInt(); 
            stockQuantities[i] = scanner.nextInt();  
        }
        int searchID = scanner.nextInt();
        boolean found = false;
        int foundIndex = -1;
        for (int i = 0; i < n; i++) {
            if (productIDs[i] == searchID) {
                found = true;
                foundIndex = i;
                break;
            }
        }
        if (found) {
            System.out.println(stockQuantities[foundIndex]);
        } else {
            System.out.println("Product " + searchID + " not found");
        }
        scanner.close();
    }
}