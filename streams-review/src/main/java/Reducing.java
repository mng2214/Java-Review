import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {

        List<Integer> numbers1 = Arrays.asList(4, 5, 3, 9);
        int reduce = numbers1.stream().reduce(0, (a, b) -> a + b);
        System.out.println(reduce);
        System.out.println("-".repeat(40));

        // No initial value

        Optional<Integer> reduce2 = numbers1.stream().reduce((a, b) -> a + b);
        System.out.println(reduce2.get());
        System.out.println("-".repeat(40));

        // MAX MIN

        Optional<Integer> reduce3 = numbers1.stream().reduce(Integer::min);
        System.out.println(reduce3.get());
        System.out.println("-".repeat(40));

        Optional<Integer> reduce4 = numbers1.stream().reduce(Integer::max);
        System.out.println(reduce4.get());
        System.out.println("-".repeat(40));

        // SUM

        Optional<Integer> reduce5 = numbers1.stream().reduce(Integer::sum);
        System.out.println(reduce5.get());
        System.out.println("-".repeat(40));

        // Count dishes

        Integer numberOfDishes = DishData.getAll().stream()
                .map(d -> 1)
                .reduce(0, Integer::sum);
        System.out.println(numberOfDishes);
        System.out.println("-".repeat(40));

    }

}
