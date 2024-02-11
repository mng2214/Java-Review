package FunctionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserTest {

    public static void main(String[] args) {

        List<User> users = Arrays.asList(
                new User("Edward", "Jonson", 30),
                new User("Mike", "Miller", 25),
                new User("Ema", "Watson", 42),
                new User("Will", "Smith", 24)
        );

        printName(users, p -> p.getFirstName().startsWith("E"));
        System.out.println("------");
        printName(users, p -> true);

    }

    private static void printName(List<User> users, Predicate<User> p) {
        for (User user : users) {
            if (p.test(user)) {
                System.out.println(user);
            }
        }
    }


}
