package lambdaRefresh;

public class TestLambda {
    public static void main(String[] args) {

        MyLambda myLambda = x -> (x % 2 == 0) ? "EVEN" : "ODD";

        System.out.println(myLambda.oddOrEvenNumberFinder(-3));

    }
}
