package review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MyUtils<T extends Person> {

    public void printInfoLambda(List<T> list) {
        list.forEach(System.out::println);
        System.out.println(list.size());
    }

    public T lastCharInList(List<T> list) {
        return list.get(list.size() - 1);
    }

    public void printNames(List<T> list) {
        for (T person : list) {
            System.out.println(person.getName());
        }
    }

    Consumer<List<T>> printEach = (students) -> {
        for (T each : students) {
            System.out.println(each.getName());
        }
    };

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>(Arrays.asList(
                new Student("Joe", 1),
                new Student("Alex", 2),
                new Student("Brian", 3)
        ));

        MyUtils<Student> myUtils = new MyUtils<>();
        System.out.println(myUtils.lastCharInList(students));

        // ============

        myUtils.printNames(students);

        myUtils.printEach.accept(students);

    }

}
