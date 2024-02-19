import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaCollectors {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 4, 6, 8, 6, 9, 15, 5, 9);

        //toCollection (Supplier) -> creates collection using collector

        Set<Integer> collect = numbers.stream()
                .filter(x -> x % 3 == 0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println("toCollection() " + collect);
        System.out.println("-".repeat(40));

        // toList() returns a collector interface that gathers the input data into new list

        List<Integer> collect1 = numbers.stream()
                .filter(x -> x % 3 == 0)
                .collect(Collectors.toList());
        System.out.println("toList() " + collect1);
        System.out.println("-".repeat(40));

        // toSet() returns a collector interface that gathers the input data into new Set

        Set<Integer> collect2 = numbers.stream()
                .filter(x -> x % 3 == 0)
                .collect(Collectors.toSet());
        System.out.println("toSet() " + collect2);
        System.out.println("-".repeat(40));

        // toMap(Function,Function) returns a collector interface that gathers the input data into new Map

        Map<String, Integer> collect4 = DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName, Dish::getCalories));
        System.out.println("toMap() " + collect4);
        System.out.println("-".repeat(40));

        // counting() returns collector that count the number of elements

        Long collect3 = numbers.stream()
                .filter(x -> x % 3 == 0)
                .collect(Collectors.counting());

        // .count();

        System.out.println("counting() " + collect3);
        System.out.println("-".repeat(40));

        //summingInt (toIntFunction) returns collector that produces sum of int value function

        int collect5 = DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println("summingInt() " + collect5);
        System.out.println("-".repeat(40));

        //averagingInt (toIntFunction) average

        Double collect6 = DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println("averagingInt() " + collect6);
        System.out.println("-".repeat(40));

        // summarizingInt(toIntFunction)

        IntSummaryStatistics collect7 = DishData.getAll().stream()
                .collect(Collectors.summarizingInt(Dish::getCalories));
        System.out.println("summarizingInt() " + collect7);
        System.out.println("-".repeat(40));

        //jointing() is used to join various elements of a character or string array into single string obj

        List<String> lang = Arrays.asList("java", "javascript", "typescript");
        String collect8 = lang.stream().collect(Collectors.joining(","));
        System.out.println("jointing() " + collect8);
        System.out.println("-".repeat(40));

        // partitioningBy() used to partition a stream of objects based on a given predicate return, key predicate!

        Map<Boolean, List<Dish>> collect9 = DishData.getAll().stream()
                .collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println("partitioningBy() " + collect9);
        System.out.println("-".repeat(40));

        // groupingBy used for grouping obj by some property and storing to map. we decide what key to use!

        Map<Type, List<Dish>> collect10 = DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));
        System.out.println("groupingBy() " + collect10);
        System.out.println("-".repeat(40));




    }
}
