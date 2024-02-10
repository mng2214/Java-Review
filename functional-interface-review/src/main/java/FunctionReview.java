import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionReview {

    public static void main(String[] args) {

        Function<Integer, Integer> multiplayerByTwo = a -> a * 2;
        System.out.println(multiplayerByTwo.apply(5));

        BiFunction<Integer, Integer, Integer> multiplyTwoNumbers = (a, b) -> a * b;
        System.out.println(multiplyTwoNumbers.apply(3, 8));

        BiFunction<int[], int[], List<Integer>> arraysToList = (ar1, ar2) -> {
            List<Integer> list = new ArrayList<>();

            for (int e : ar1) {
                list.add(e);
            }

            for (int e : ar2) {
                list.add(e);
            }

            return list;
        };

        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 8, 9, 4};

        List<Integer> list = arraysToList.apply(arr1, arr2);
        System.out.println(list);

    }

}
