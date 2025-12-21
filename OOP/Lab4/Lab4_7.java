import java.util.Scanner;

class Resource {
    private final String id;

    public Resource(String id) {
        this.id = id;
        System.out.println("Resource " + id + " created.");
    }

    @Override
    protected void finalize() throws Throwable {
        try {
            System.out.println("Resource " + id + " finalized (destroyed).");
        } finally {
            super.finalize();
        }
    }
}

public class Lab4_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Resource r1 = new Resource(scanner.next());
        Resource r2 = new Resource(scanner.next());
        Resource r3 = new Resource(scanner.next());

        r1 = null;
        r2 = null;
        runGC();

        r3 = null;
        runGC();

        scanner.close();
    }

    private static void runGC() {
        System.gc();
        try {
            Thread.sleep(100);
        } catch (InterruptedException ignored) {
        }
    }
}
