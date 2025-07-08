package Day4_ObjectOrientedDesignPrinciples.LibraryAndBook;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho");
        Book b2 = new Book("1984", "George Orwell");
        Book b3 = new Book("Clean Code", "Robert C. Martin");
        Library lib1 = new Library("City Library");
        Library lib2 = new Library("College Library");
        lib1.addBook(b1);
        lib1.addBook(b2);

        lib2.addBook(b2);
        lib2.addBook(b3);
        lib1.displayBooks();
        lib2.displayBooks();
    }
}

