package BehaviorParameterizationReview;

import com.github.javafaker.App;

import java.util.ArrayList;
import java.util.List;

public class TestApple {

    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();

        inventory.add(new Apple(300, AppleColor.GREEN));
        inventory.add(new Apple(100, AppleColor.RED));
        inventory.add(new Apple(150, AppleColor.RED));
        inventory.add(new Apple(50, AppleColor.GREEN));
        inventory.add(new Apple(200, AppleColor.GREEN));

        List<Apple> heavyApple = filetApples(inventory, new AppleHeavyPredicate());
        List<Apple> greenApple = filetApples(inventory, new AppleGreenColorPredicate());

        System.out.println(heavyApple);
        System.out.println(greenApple);

        System.out.println("***********************");

        prettyPrintApple(inventory,new SimpleOutput());

    }

    private static List<Apple> filetApples(List<Apple> inventory, ApplePredicate applePredicate) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if (applePredicate.test(apple)) {
                result.add(apple);
            }
        }
        return result;
    }

    public static void prettyPrintApple (List<Apple> inventory, AppleFormatter appleFormatter){
        for (Apple apple : inventory) {
            String output = appleFormatter.accept(apple);
            System.out.println(output);
        }
    }



}
