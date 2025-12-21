import java.util.Scanner;

class Movie {
    private final String title;
    private final String director;
    private final double rating;

    public Movie(String title) {
        this(title, "Unknown");
    }

    public Movie(String title, String director) {
        this(title, director, 0.0);
    }

    public Movie(String title, String director, double rating) {
        this.title = title;
        this.director = director;
        this.rating = clamp(rating);
    }

    private double clamp(double value) {
        return Math.max(0.0, Math.min(10.0, value));
    }

    public void displayDetails() {
        System.out.printf(
                "Title: %s, Director: %s, Rating: %.1f%n",
                title, director, rating
        );
    }
}

public class Lab4_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mode = scanner.nextInt();
        scanner.nextLine();

        Movie movie;

        if (mode == 1) {
            movie = new Movie(scanner.nextLine());
        } else if (mode == 2) {
            movie = new Movie(
                    scanner.nextLine(),
                    scanner.nextLine()
            );
        } else {
            movie = new Movie(
                    scanner.nextLine(),
                    scanner.nextLine(),
                    scanner.nextDouble()
            );
        }

        movie.displayDetails();
        scanner.close();
    }
}
