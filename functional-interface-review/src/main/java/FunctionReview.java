import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionReview {
    public static void main(String[] args) {

        Function<Integer, Integer> multiplayerByTwo = a -> a * 2;
        System.out.println(multiplayerByTwo.apply(5));

        BiFunction<Integer,Integer,Integer> multiplyTwoNumbers = (a,b) -> a * b;
        System.out.println(multiplyTwoNumbers.apply(3,8));

    }
}
