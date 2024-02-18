import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll() {
        return Stream.of(
                new Employee(100, "Artur", "artur@gmail.com", Arrays.asList("773994955", "7731246699")),
                new Employee(101, "Joe", "joe@gmail.com", Arrays.asList("2134567894", "7731246699")),
                new Employee(102, "Mike", "mike@gmail.com", Arrays.asList("1234567894", "4586894555")),
                new Employee(103, "Lia", "lika@gmail.com", Arrays.asList("9788541245", "7853544450"))
        );
    }

}
