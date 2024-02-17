import java.util.Arrays;
import java.util.List;

public class ChartTask {
    public static void main(String[] args) {

        // Print number of characters in each word

        List<String> listOfWords = Arrays.asList("Java", "Spring", "Developer", "RestAssured", "BMW");

        listOfWords.stream()
                .map(String::length)
                .forEach(System.out::println);

    }
}
