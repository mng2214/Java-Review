import java.util.Optional;

public class MatchingAndFinding {
    public static void main(String[] args) {

        // ALL MATCH

        boolean allMatch = DishData.getAll().stream().allMatch(dish -> dish.getCalories() < 1000);
        System.out.println("allMatch = " + allMatch);
        System.out.println("-".repeat(40));

        // ANY MATCH

        if (DishData.getAll().stream().anyMatch(Dish::isVegetarian)) ;
        System.out.println("Menu contains vegetarian dishes");
        System.out.println("-".repeat(40));

        // NONE MATCH

        boolean noneMatch = DishData.getAll().stream().noneMatch(dish -> dish.getCalories() >= 1000);
        System.out.println("noneMatch  = " + noneMatch);
        System.out.println("-".repeat(40));

        // FIND ANY

        Optional<Dish> dish = DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findAny();


        System.out.println("findAny  = " + dish.get());
        System.out.println("-".repeat(40));

        // FIND FIRST

        Optional<Dish> findFirst = DishData.getAll().stream()
                .filter(Dish::isVegetarian)
                .findFirst();

        System.out.println("findFirst = " + findFirst.get());
        System.out.println("-".repeat(40));

    }


}
