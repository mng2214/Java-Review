import java.util.Arrays;
import java.util.stream.Stream;

public class InfiniteStream {
    public static void main(String[] args) {

        int a = 0, b = 1, c;
        for (int i = 0; i < 5; i++) {
            c = a + b;
            System.out.println(a);
            a = b;
            b = c;
        }

        System.out.println("-".repeat(40));


        Stream.iterate(0, n -> n + 2).limit(5).forEach(System.out::println);

        System.out.println("-".repeat(40));

        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(5)
                .forEach(t -> System.out.print(" (" + t[0] + "," + t[1] + ") "));
        System.out.println();

        System.out.println("-".repeat(40));

        Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
                .limit(8)
                .map(x -> x[0])
                .forEach(System.out::println);

    }
}
