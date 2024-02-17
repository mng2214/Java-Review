package streamoperations;

import com.github.javafaker.Faker;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class CompareStreamVsLoop {

//    public static Faker faker = new Faker(Locale.ENGLISH);
//
//    public static List<String> listBuilder(int elementsInListToAdd) {
//        List<String> build = new ArrayList<>();
//        for (int i = 0; i < elementsInListToAdd; i++) {
//            build.add(faker.name().firstName());
//        }
//        return build;
//    }

    public static void main(String[] args) {
        // Setup test data
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 1_000_000; i++) {
            numbers.add(i);
        }

        // Measure for loop
        long startTimeForLoop = System.nanoTime();
        long sumForLoop = 0;
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                sumForLoop += number;
            }
        }
        long endTimeForLoop = System.nanoTime();
        System.out.println("For loop time: " + (endTimeForLoop - startTimeForLoop) + " ns");

        // Measure stream
        long startTimeStream = System.nanoTime();
        long sumStream = numbers.stream()
                .filter(number -> number % 2 == 0)
                .mapToLong(Long::valueOf)
                .sum();
        long endTimeStream = System.nanoTime();
        System.out.println("Stream time: " + (endTimeStream - startTimeStream) + " ns");
    }
}




