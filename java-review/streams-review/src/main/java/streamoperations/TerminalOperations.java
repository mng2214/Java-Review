package streamoperations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperations {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 1, 5, 4, 7, 2, 7, 7, 8, 6);

        // -------------------- Commonly User Terminal Operations --------------------

        // forEach(), collect(), reduce(), count(), findFirst/Any(), any/allMatch(), max/min(), toArray(), nonMatch()

        // collect()

        List<Integer> collectedList = list.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());

        System.out.println(collectedList);
        System.out.println("-".repeat(30));

        // reduce()

        int sum = list.stream()
                .map(x -> x * x)
                .reduce(0, (num1, num2) -> num1 + num2);

        System.out.println(sum);
        System.out.println("-".repeat(30));

        // count()

        long count = list.stream()
                .map(x -> x * x)
                .count();

        System.out.println(count);
        System.out.println("-".repeat(30));

        // findFirst/Any()

        Optional<Integer> first = list.stream()
                .map(x -> x * x)
                .findFirst();

        int firstToIntFirst = list.stream()
                .map(x -> x * x)
                .findFirst()
                .get();

        System.out.println(firstToIntFirst);

        int firstToIntAny = list.stream()
                .map(x -> x * x)
                .findAny()
                .get(); // to int

        System.out.println(firstToIntAny);
        System.out.println("-".repeat(30));

        // any/allMatch()

        boolean anyMatch = list.stream()
                .map(x -> x * x)
                .anyMatch(x -> x < 20);

        System.out.println(anyMatch);

        boolean allMatch = list.stream()
                .map(x -> x * x)
                .allMatch(x -> x < 20);

        System.out.println(allMatch);

        System.out.println("-".repeat(30));



    }

}
