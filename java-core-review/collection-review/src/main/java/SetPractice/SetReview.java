package SetPractice;

import TestData.Student;

import java.util.HashSet;
import java.util.Set;

import static ArrayListPracice.ArrayListReview.faker;

public class SetReview {
    public static void main(String[] args) {

        Set<Student> studentSet = new HashSet<>();

        studentSet.add(new Student(1, faker.name().firstName()));
        studentSet.add(new Student(2, faker.name().firstName()));
        studentSet.add(new Student(3, faker.name().firstName()));
        studentSet.add(new Student(4, faker.name().firstName()));
        studentSet.add(new Student(5, faker.name().firstName()));
        studentSet.add(new Student(5, faker.name().firstName()));

        System.out.println(studentSet);

        Set<Integer> testSet = new HashSet<>();
        testSet.add(1);
        System.out.println(testSet.add(1));
        System.out.println(testSet.add(2));

        System.out.println("------------------------------");

        String str = "java Developer"; // First repeated char in a str
        System.out.println(firstRepeatedChar(str));

    }

    public static Character firstRepeatedChar(String str) {
        Set<Character> strSet = new HashSet<>();
//        for (int i = 0; i < str.length(); i++) {
//            if (!strSet.add(str.charAt(i))) return str.charAt(i);
//        }
//        return null;

        for(Character eachLetter : str.toCharArray()) if(!strSet.add(eachLetter)) return eachLetter;
        return null;
    }
}
