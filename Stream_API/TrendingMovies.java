import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Movie {
    private String title;
    private double rating;
    private int year;

    public Movie(String title, double rating, int year) {
        this.title = title;
        this.rating = rating;
        this.year = year;
    }

    public String getTitle() { return title; }
    public double getRating() { return rating; }
    public int getYear() { return year; }

    @Override
    public String toString() {
        return title + " (⭐ " + rating + ", " + year + ")";
    }
}

public class TrendingMovies {
    public static void main(String[] args) {
        List<Movie> movies = Arrays.asList(
            new Movie("Inception", 8.8, 2010),
            new Movie("The Dark Knight", 9.0, 2008),
            new Movie("Avengers: Endgame", 8.4, 2019),
            new Movie("Interstellar", 8.6, 2014),
            new Movie("Parasite", 8.6, 2019),
            new Movie("Joker", 8.5, 2019),
            new Movie("Spider-Man: No Way Home", 8.3, 2021),
            new Movie("Oppenheimer", 8.9, 2023),
            new Movie("Dune: Part Two", 8.7, 2024)
        );

        System.out.println("🎬 Top 5 Trending Movies:");

        movies.stream()
            .filter(m -> m.getYear() >= 2010) 
            .sorted(Comparator.comparingDouble(Movie::getRating)
                              .thenComparing(Movie::getYear)
                              .reversed())   
            .limit(5)  
            .forEach(System.out::println);
    }
}
