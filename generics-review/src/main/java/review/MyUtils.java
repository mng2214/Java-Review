package review;

import java.util.List;

public class MyUtils {

    public static <T> void printInfoLambda(List<T> list) {
        list.forEach(System.out::println);
        System.out.println(list.size());
    }

    public static <T> T lastCharInList (List <T> list ){
        return list.get(list.size()-1);
    }

}
