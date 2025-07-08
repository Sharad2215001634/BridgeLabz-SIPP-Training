package Day4_ObjectOrientedDesignPrinciples.LibraryAndBook;

public class Book {
    String title;
    String author;
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public void display() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}
