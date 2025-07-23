package Generics.Library_Book_Checkout_System;

abstract class Book {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public abstract String getType();
    public String toString() {
        return getType() + ": \"" + title + "\" by " + author;
    }
}

class EBook extends Book {
    public EBook(String title, String author) {
        super(title, author);
    }
    public String getType() {
        return "E-Book";
    }
}


class HardCopyBook extends Book {
    public HardCopyBook(String title, String author) {
        super(title, author);
    }
    public String getType() {
        return "Hardcopy Book";
    }
}

class AudioBook extends Book {
    public AudioBook(String title, String author) {
        super(title, author);
    }
    public String getType() {
        return "Audio Book";
    }
}
