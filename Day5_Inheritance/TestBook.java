package Day5_Inheritance;

class Book {
    String title;
    int publicationYear;

    Book(String title, int year) {
        this.title = title;
        this.publicationYear = year;
    }
}
class Author extends Book {
    String name, bio;

    Author(String title, int year, String name, String bio) {
        super(title, year);
        this.name = name;
        this.bio = bio;
    }
    void display() {
        System.out.println("Book: " + title + " (" + publicationYear + ")");
        System.out.println("Author: " + name + ", Bio: " + bio);
    }
}

public class TestBook {
    public static void main(String[] args) {
        Author a = new Author("Java Basics", 2024, "John Doe", "Tech Author");
        a.display();
    }
}