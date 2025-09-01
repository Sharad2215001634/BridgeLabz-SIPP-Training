import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequency {
    public static void main(String[] args) {
        String paragraph = "Java is powerful and Java is versatile. Streams make Java powerful.";
        String[] words = paragraph.toLowerCase().split("\\W+");

        Map<String, Long> wordCount = Arrays.stream(words)
                .collect(Collectors.toMap(
                        w -> w,  
                        w -> 1L, 
                        Long::sum
                ));

        wordCount.forEach((word, count) ->
                System.out.println(word + " → " + count));
    }
}
