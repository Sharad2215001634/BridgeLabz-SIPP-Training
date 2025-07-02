package Day2_Static_Final;

public class Book {
    static String libraryName = "City Central Library";
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    private String title;
    private String author;
    private final String isbn;
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("ISBN: " + isbn);
        } else {
            System.out.println("Invalid book object.");
        }
    }
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "James Gosling", "ISBN123456");
        Book book2 = new Book("Clean Code", "Robert C. Martin", "ISBN987654");
        Book.displayLibraryName();
        System.out.println();
        System.out.println("Book 1 Details:");
        book1.displayBookDetails();
        System.out.println();
        System.out.println("Book 2 Details:");
        book2.displayBookDetails();
    }
}
