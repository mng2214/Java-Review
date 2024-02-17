package doublecollonoperator;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;

public class Demo {
    public static void main(String[] args) {

        // Reference to static

        Calculate s1 = (x, y) -> Calculator.findSum(x, y);
        s1.calculate(10, 20);

        Calculate s2 = Calculator::findSum;
        s2.calculate(5, 10);


        // Reference to instance

        Calculate m1 = (x, y) -> new Calculator().FindMultiply(x, y);
        m1.calculate(3, 4);

        Calculator calculatorObject = new Calculator();
        Calculate m2 = calculatorObject::FindMultiply;
        m2.calculate(2, 5);

        Calculate m3 = new Calculator()::FindMultiply;
        m3.calculate(2, 7);

        BiFunction<String, Integer, String> fn = (str, i) -> str.substring(i);
        System.out.println(fn.apply("java", 1));

        BiFunction<String, Integer, String> fn1 = String::substring;
        System.out.println(fn1.apply("java", 1));

        Consumer<String> str = System.out::println;
        str.accept("Developer");

        // Constructor reference

        //-->> Car Test

        BiFunction<MyClass, Integer, Double> v1 = MyClass::method;

        //OR

        Function<Integer, Double> v2 = new MyClass()::method;


    }
}
