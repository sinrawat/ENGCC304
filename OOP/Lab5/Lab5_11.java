import java.util.Scanner;

class Document {
    protected String title;
    
    public Document(String title) { 
        this.title = title; 
    }
    
    public void displayDetails() {
        System.out.println("Document: " + title);
    }
}

class TextDocument extends Document {
    protected int wordCount;
    
    public TextDocument(String title, int wordCount) {
        super(title);
        this.wordCount = wordCount;
    }
    
    @Override
    public void displayDetails() {
        System.out.println("Text: " + title + ", Words: " + wordCount);
    }
}

class PDFDocument extends Document {
    protected int pageCount;
    
    public PDFDocument(String title, int pageCount) {
        super(title);
        this.pageCount = pageCount;
    }
    
    @Override
    public void displayDetails() {
        System.out.println("PDF: " + title + ", Pages: " + pageCount);
    }
}

public class Lab5_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String textTitle1 = sc.nextLine();
        int wordCount1 = sc.nextInt();
        sc.nextLine();
        
        String pdfTitle1 = sc.nextLine();
        int pageCount1 = sc.nextInt();
        sc.nextLine();
        
        String textTitle2 = sc.nextLine();
        int wordCount2 = sc.nextInt();
        sc.nextLine();
        
        String pdfTitle2 = sc.nextLine();
        int pageCount2 = sc.nextInt();
        
        TextDocument textDoc1 = new TextDocument(textTitle1, wordCount1);
        PDFDocument pdfDoc1 = new PDFDocument(pdfTitle1, pageCount1);
        TextDocument textDoc2 = new TextDocument(textTitle2, wordCount2);
        PDFDocument pdfDoc2 = new PDFDocument(pdfTitle2, pageCount2);
        
        Document[] documents = {textDoc1, pdfDoc1, textDoc2, pdfDoc2};
        
        int totalPages = 0;
        
        for (Document doc : documents) {
            if (doc instanceof PDFDocument) {
                PDFDocument pdfDoc = (PDFDocument) doc;
                totalPages += pdfDoc.pageCount;
            }
        }
        
        for (Document doc : documents) {
            doc.displayDetails();
        }
        
        System.out.println("Total Pages: " + totalPages);
        
        sc.close();
    }
}
