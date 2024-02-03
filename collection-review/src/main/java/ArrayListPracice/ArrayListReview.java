package ArrayListPracice;

import com.github.javafaker.Faker;

import java.util.*;

public class ArrayListReview {
    public static Faker faker = new Faker(Locale.ENGLISH);

    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student(1, faker.name().fullName()));
        studentList.add(new Student(2, faker.name().fullName()));
        studentList.add(new Student(3, faker.name().fullName()));
        studentList.add(new Student(4, faker.name().fullName()));
        studentList.add(new Student(5, faker.name().fullName()));

        // Iteration

        // For i loop

        for (int i = 0; i < studentList.size(); i++) System.out.println(studentList.get(i));

        System.out.println("-----------------------------------");
        // Iterator forward

        ListIterator<Student> iterator = studentList.listIterator();

        while (iterator.hasNext()) System.out.println(iterator.next());

        System.out.println("-----------------------------------");

        // For each

        iterator = studentList.listIterator();

        for (Student student : studentList) {
            if (iterator.hasNext()) {
                System.out.println(student);
            }
        }

        System.out.println("-----------------------------------");
        // Iterator backward

        iterator = studentList.listIterator();

//        while(((ListIterator<?>) iterator).hasPrevious()){
//            System.out.println(((ListIterator<?>) iterator).previous());
//        }

//        while (iterator.hasPrevious()){
//            Student student = iterator.previous();
//            System.out.println(student);
//        }

        // Lambda
        studentList.forEach(System.out::println);
        //studentList.forEach(s -> System.out.println(s));
        System.out.println("-----------------------------------");

        // Sorting by id desc
        Collections.sort(studentList, new sortByIdDesc());
        System.out.println(studentList);

        // Sorting by name desc
        Collections.sort(studentList, new sortByNameDesc());
        System.out.println(studentList);

    }


    static class sortByIdDesc implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o2.id - o1.id;
        }
    }

    static class sortByNameDesc implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }

}
