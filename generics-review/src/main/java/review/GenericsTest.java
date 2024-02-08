package review;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GenericsTest {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Mike", 101));
        studentList.add(new Student("Joe", 102));
        studentList.add(new Student("Max", 103));

        List<Teacher> teacherList = new ArrayList<>();

        teacherList.add(new Teacher("Eric", 201));
        teacherList.add(new Teacher("David", 202));

        //  printInfo(studentList);
        printInfoLambda(studentList);
        printInfoLambda(teacherList);
        System.out.println(lastCharInList(studentList));
    }

    public static void printInfo(List<Student> studentList) {
        for (Student student : studentList) {
            System.out.println(student);
        }
        System.out.println(studentList.size());

    }

// generics

    public static <T> void printInfoLambda(List<T> list) {
        list.forEach(System.out::println);
        System.out.println(list.size());
    }

    public static <T> T lastCharInList (List <T> list ){
        return list.get(list.size()-1);
    }




}
