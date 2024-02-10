import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateReview {
    public static void main(String[] args) {


        Predicate<Integer> isOddOrEven = input -> input % 2 == 0;
        System.out.println(isOddOrEven.test(241));


        BiPredicate<int[], Integer> isArrayContainsNumber = (arrayOfNumbers, number) -> {

            boolean result = false;

            for (int x : arrayOfNumbers) {
                if (x == number) {
                    result = true;
                    break;
                }
            }
            return result;
        };

        int[] arr = {1, 3, 5};
        int num = 5;

        System.out.println(isArrayContainsNumber.test(arr, num));
    }
}
