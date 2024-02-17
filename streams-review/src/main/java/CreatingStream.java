import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreatingStream {

    public static void main(String[] args) {

        // From Array

        int[] arr = {1, 2, 3, 4};
        IntStream arrStream = Arrays.stream(arr);

        // From values

        Stream<Integer> streamValues = Stream.of(1, 2, 3, 4, 5);

        // From collection

        List<Course> courseList = Arrays.asList(
                new Course("Java", 100),
                new Course("Spring", 101),
                new Course("Rest", 102),
                new Course("DS", 103),
                new Course("Microservices", 103)
        );

        Stream<Course> myCourseStream = courseList.stream();



    }
}
