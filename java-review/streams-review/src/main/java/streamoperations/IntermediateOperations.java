package streamoperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IntermediateOperations {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 7, 8, 9};
        List<Integer> list = Arrays.asList(2, 1, 5, 4, 7, 2, 7, 7, 8, 6);

        // Declaration

        Arrays.stream(args);
        Stream.of(1, 2, 3, 4, 5, 6, 7, 7, 8, 9);
        list.stream();

        Stream<Integer> stream = list.stream();

        // --------------------- Commonly used intermediate operations ---------------------

        // map(), filter(), distinct(), sorted(), limit(), skip(), peek()

        // map()

        list.stream()
                .map(x -> x * x)
                .forEach(System.out::println);

        System.out.println("-".repeat(30));

        // filter()

        list.stream()
                .map(x -> x * x)
                .filter(x -> x > 20)
                .forEach(System.out::println);

        System.out.println("-".repeat(30));

        // distinct()

        list.stream()
                .map(x -> x * x)
                .distinct()
                .forEach(System.out::println);

        System.out.println("-".repeat(30));

        // sorted()

        list.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println("-".repeat(30));

        // limit()

        list.stream()
                .sorted()
                .limit(5L)
                .forEach(System.out::println);

        System.out.println("-".repeat(30));

        // skip

        list.stream()
                .skip(5)
                .forEach(System.out::println);

        System.out.println("-".repeat(30));

        //limit

        list.stream()
                .limit(5)
                .forEach(System.out::println);

        System.out.println("-".repeat(30));

        //peek

        List<Integer> peekList = list.stream()
                .map(x -> x * x)
                .filter(x -> x % 3 == 0)
                .peek(System.out::println)
                .collect(Collectors.toList());

        System.out.println(peekList);
        System.out.println("-".repeat(30));



    }
}
