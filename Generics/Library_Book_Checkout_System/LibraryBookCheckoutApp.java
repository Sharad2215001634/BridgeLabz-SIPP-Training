package Generics.Library_Book_Checkout_System;

public class LibraryBookCheckoutApp{
    public static void main(String[] args) {
        LibraryCheckoutSystem library = new LibraryCheckoutSystem();
        EBook ebook = new EBook("Java in Depth", "John Doe");
        HardCopyBook hardCopy = new HardCopyBook("Data Structures", "Jane Smith");
        AudioBook audioBook = new AudioBook("Algorithms Unlocked", "Tim Lee");

        Request<EBook> req1 = new Request<>(ebook, "User A");
        Request<HardCopyBook> req2 = new Request<>(hardCopy, "User B");
        Request<AudioBook> req3 = new Request<>(audioBook, "User C");

        library.addRequest(req1);
        library.addRequest(req2);
        library.addRequest(req3);

        library.showPendingRequests();
        System.out.println("---");

        library.processNextRequest();
        library.processNextRequest();
        library.processNextRequest();
        library.processNextRequest();

        System.out.println("---");
        library.showPendingRequests();
    }
}
