import java.util.Arrays;
import java.util.List;

public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 3, 1, 3, 9);
        //myList.forEach(System.out::println);

        // FILTER
        System.out.println("FILTER");
        myList.stream()
                .filter(x -> x % 3 == 0)
                .forEach(System.out::println);
        System.out.println("-".repeat(40));

        // DISTINCT
        System.out.println("DISTINCT");
        myList.stream()
                .distinct()
                .forEach(System.out::println);
        System.out.println("-".repeat(40));

        // LIMIT
        System.out.println("LIMIT");
        myList.stream()
                .distinct()
                .limit(5L)
                .forEach(System.out::println);
        System.out.println("-".repeat(40));

        // SKIP
        System.out.println("SKIP");
        myList.stream()
                .distinct()
                .skip(2L)
                .forEach(System.out::println);
        System.out.println("-".repeat(40));

        // MAP
        System.out.println("MAP");
        myList.stream()
                .distinct()
                .map(x -> x * 2)
                .forEach(System.out::println);
        System.out.println("-".repeat(40));

        // REDUCE
        System.out.println("REDUCE");
        int sum = myList.stream()
                .distinct()
                .map(x -> x * 2)
                .reduce(0, Integer::sum);

        System.out.println(sum);
        System.out.println("-".repeat(40));

    }
}
