package FunctionalInterfaces;

import java.util.function.*;

public class Examples {
    public static void main(String[] args) {

        // Predicate ---------------------------

        // Anonymous class
        Predicate<Integer> lessThen = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer < 20;
            }
        };
        // System.out.println(lessThen.test(21));

        Predicate<Integer> lessThen1 = num -> num < 20;
        System.out.println(lessThen1.test(20));

        // Consumer ---------------------------

        //Consumer<Integer> display = s -> System.out.println(s);
        Consumer<Integer> display = System.out::println;
        display.accept(32);

        // Bi Consumer ---------------------------

        BiConsumer<Integer, Integer> addTwo = (a, b) -> System.out.println(a + b);
        addTwo.accept(2, 2);

        // Function ---------------------------

        Function<String, String> fun = "Hi "::concat;
        System.out.println(fun.apply("Artur"));

        // Supplier ---------------------------

        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());

    }
}
