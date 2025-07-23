package Generics.Library_Book_Checkout_System;

class Request<T extends Book> {
    private T book;
    private String requestedBy;

    public Request(T book, String requestedBy) {
        this.book = book;
        this.requestedBy = requestedBy;
    }

    public T getBook() { return book; }
    public String getRequestedBy() { return requestedBy; }

    @Override
    public String toString() {
        return requestedBy + " requested " + book;
    }
}
