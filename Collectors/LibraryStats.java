import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Book {
    private final String title;
    private final String genre;
    private final int pages;

    public Book(String title, String genre, int pages) {
        this.title = title;
        this.genre = genre;
        this.pages = pages;
    }
    public String getGenre() { return genre; }
    public int getPages() { return pages; }
    public String getTitle() { return title; }
}

public class LibraryStats {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
            new Book("Book A", "Fiction", 300),
            new Book("Book B", "Fiction", 450),
            new Book("Book C", "Science", 200),
            new Book("Book D", "Science", 350),
            new Book("Book E", "History", 500)
        );

        Map<String, IntSummaryStatistics> statsByGenre =
                books.stream().collect(
                    Collectors.groupingBy(
                        Book::getGenre,
                        Collectors.summarizingInt(Book::getPages)
                    )
                );

        statsByGenre.forEach((genre, stats) -> {
            System.out.println("Genre: " + genre);
            System.out.println("  Total pages: " + stats.getSum());
            System.out.println("  Average pages: " + stats.getAverage());
            System.out.println("  Max pages: " + stats.getMax());
        });
    }
}
