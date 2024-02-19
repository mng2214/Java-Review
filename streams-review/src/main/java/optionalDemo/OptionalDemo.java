package optionalDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(2, 4, 2, 10, 23);

        //isEmpty() - isPresent()

        Optional<String> empty = Optional.empty();

        System.out.println(empty.isPresent());
        System.out.println(empty.isEmpty());
        System.out.println(Optional.of(number).isPresent());

        System.out.println("-".repeat(40));

        Optional<Integer> largeNumber = number.stream().filter(x -> x > 100).findAny();
        largeNumber.ifPresent(System.out::println);

        System.out.println("-".repeat(40));

        // get

        //System.out.println(largeNumber.get());

        //orElse()

        System.out.println(largeNumber.orElse(0));

    }
}
