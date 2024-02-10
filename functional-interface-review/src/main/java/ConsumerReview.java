import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerReview {
    public static void main(String[] args) {

        List<String> languages = Arrays.asList("java","c","c++","python","ruby");

        Consumer<List<String>> printEach = c -> {
           c.forEach(System.out::println);
        };

        printEach.accept(languages);

        BiConsumer<String,Integer> printRepeat = (word,numberOfTimes) ->{
            for (int i = 0; i < numberOfTimes; i++) {
                System.out.println(word);
            }
        };

        printRepeat.accept("biConsumer",5);

        Map<String,Integer> staff = new HashMap<>();
        staff.put("dev",18);
        staff.put("qa",4);
        staff.put("po",3);

        staff.forEach( (k,v) -> {
            System.out.println("key is : "+k +" ; " + " value is : " + v);
        });







    }
}
