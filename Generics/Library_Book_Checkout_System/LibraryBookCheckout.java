package Generics.Library_Book_Checkout_System;

import java.util.LinkedList;
import java.util.Queue;

class LibraryCheckoutSystem {
    private Queue<Request<? extends Book>> requestQueue = new LinkedList<>();
    public void addRequest(Request<? extends Book> request) {
        requestQueue.add(request);
        System.out.println("Added: " + request);
    }
    

    public void processNextRequest() {
        if (requestQueue.isEmpty()) {
            System.out.println("No requests to process.");
            return;
        }
        Request<? extends Book> request = requestQueue.poll();
        System.out.println("Processing: " + request);
    }

    public void showPendingRequests() {
        System.out.println("Pending requests in order:");
        for (Request<? extends Book> req : requestQueue) {
            System.out.println(" - " + req);
        }
    }
}

