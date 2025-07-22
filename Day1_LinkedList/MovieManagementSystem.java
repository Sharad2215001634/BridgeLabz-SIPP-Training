package Day1_LinkedList;

class Movie {
    String title;
    String director;
    int year;
    double rating;

    Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }
}

class Node {
    Movie data;
    Node prev, next;

    Node(Movie data) {
        this.data = data;
    }
}

class MovieList {
    private Node head, tail;
    public void addAtBeginning(Movie movie) {
        Node newNode = new Node(movie);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    public void addAtEnd(Movie movie) {
        Node newNode = new Node(movie);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    public void addAtPosition(Movie movie, int position) {
        if (position <= 0 || head == null) {
            addAtBeginning(movie);
            return;
        }

        Node temp = head;
        for (int i = 0; i < position - 1 && temp.next != null; i++) {
            temp = temp.next;
        }

        if (temp.next == null) {
            addAtEnd(movie);
        } else {
            Node newNode = new Node(movie);
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next.prev = newNode;
            temp.next = newNode;
        }
    }

    
    public void removeByTitle(String title) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.title.equalsIgnoreCase(title)) {
                if (temp == head) {
                    head = temp.next;
                    if (head != null) head.prev = null;
                } else if (temp == tail) {
                    tail = temp.prev;
                    if (tail != null) tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                System.out.println("Movie \"" + title + "\" removed.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie \"" + title + "\" not found.");
    }
    public void searchByDirector(String director) {
        boolean found = false;
        Node temp = head;
        while (temp != null) {
            if (temp.data.director.equalsIgnoreCase(director)) {
                printMovie(temp.data);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No movies found by director: " + director);
    }
    public void searchByRating(double rating) {
        boolean found = false;
        Node temp = head;
        while (temp != null) {
            if (temp.data.rating >= rating) {
                printMovie(temp.data);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No movies found with rating >= " + rating);
    }
    public void updateRating(String title, double newRating) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.title.equalsIgnoreCase(title)) {
                temp.data.rating = newRating;
                System.out.println("Rating updated for \"" + title + "\".");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie \"" + title + "\" not found.");
    }
    public void displayForward() {
        System.out.println("Movies (Forward):");
        Node temp = head;
        while (temp != null) {
            printMovie(temp.data);
            temp = temp.next;
        }
    }
    public void displayReverse() {
        System.out.println("Movies (Reverse):");
        Node temp = tail;
        while (temp != null) {
            printMovie(temp.data);
            temp = temp.prev;
        }
    }
    private void printMovie(Movie m) {
        System.out.printf("Title: %s | Director: %s | Year: %d | Rating: %.1f\n",
                m.title, m.director, m.year, m.rating);
    }
}

public class MovieManagementSystem {
    public static void main(String[] args) {
        MovieList list = new MovieList();

        list.addAtEnd(new Movie("Inception", "Christopher Nolan", 2010, 8.8));
        list.addAtBeginning(new Movie("The Matrix", "Lana Wachowski", 1999, 8.7));
        list.addAtPosition(new Movie("Interstellar", "Christopher Nolan", 2014, 8.6), 1);

        list.displayForward();
        System.out.println();

        list.searchByDirector("Christopher Nolan");
        System.out.println();

        list.searchByRating(8.7);
        System.out.println();

        list.updateRating("Interstellar", 9.0);
        list.displayForward();
        System.out.println();

        list.removeByTitle("The Matrix");
        list.displayReverse();
    }
}
