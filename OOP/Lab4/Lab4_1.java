import java.util.Scanner;

class Book {
    private String title;
    private String author;
    public Book(String bookTitle) {
        this.title = bookTitle;
        this.author = "Unknown";
    }
    public Book(String bookTitle, String bookAuthor) {
        this.title = bookTitle;
        this.author = bookAuthor;
    }
    public void showBookInfo() {
        String output = "Title: " + this.title + ", Author: " + this.author;
        System.out.println(output);
    }
}
public class Lab4_1 {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        int selectedMode = inputReader.nextInt();
        inputReader.nextLine(); 
        
        Book myBook;
        
        if (selectedMode == 1) {
            String bookTitle = inputReader.nextLine();
            myBook = new Book(bookTitle);
            myBook.showBookInfo();
        } 
        else if (selectedMode == 2) {
            String bookTitle = inputReader.nextLine();
            String bookAuthor = inputReader.nextLine();
            myBook = new Book(bookTitle, bookAuthor);
            myBook.showBookInfo();
        }
        
        inputReader.close();
    }
}
