package lombok;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class CarTest {

    public static void main(String[] args) {
        List<Car> carList = Arrays.asList(
                Car.carBuilder().make("bmw").topSpeed(250).year(2023).build(),
                Car.carBuilder().make("honda").topSpeed(200).year(2000).build(),
                Car.carBuilder().make("audi").topSpeed(150).year(2021).build(),
                Car.carBuilder().make("nissan").topSpeed(100).year(2008).build()
        );

        System.out.println("FAST CARS - Traditional");
        System.out.println(filterFastCards(carList));

        System.out.println("NEW CARS - Traditional");
        System.out.println(filterNewCards(carList));

//        System.out.println("FAST CARS - Behavior Parameterization");
//        System.out.println(carFilter(carList, new CarFastPredicate()));
//
//        System.out.println("NEW CARS - Behavior Parameterization");
//        System.out.println(carFilter(carList, new CarYearPredicate()));

        System.out.println("LAMBDA");

        System.out.println("FAST CARS");
        List<Car> fastCars = carFilter(carList, c -> c.getTopSpeed() > 150);
        System.out.println(fastCars);

        System.out.println("NEW CARS");
        List<Car> newCrs = carFilter(carList, c -> c.getYear() > 2015);
        System.out.println(newCrs);

        //OR
        Predicate<Car> predicate = c -> c.getTopSpeed() > 150 && c.getYear() > 2015;

        System.out.println("NEW AND FAST CARS");
        List<Car> newAndFastCars = carFilter(carList, predicate);
        System.out.println(newAndFastCars);

    }

    private static List<Car> filterNewCards(List<Car> carList) {
        List<Car> filteredCarList = new ArrayList<>();

        for (Car car : carList) {
            if (car.getYear() > 2015) {
                filteredCarList.add(car);
            }
        }
        return filteredCarList;
    }

    private static List<Car> filterFastCards(List<Car> carList) {
        List<Car> filteredCarList = new ArrayList<>();

        for (Car car : carList) {
            if (car.getTopSpeed() > 160) {
                filteredCarList.add(car);
            }
        }
        return filteredCarList;
    }

    // Behavior parameterization
    private static List<Car> carFilter(List<Car> carList, Predicate<Car> predicate) {
        List<Car> filteredCarList = new ArrayList<>();

        for (Car car : carList) {
            if (predicate.test(car)) {
                filteredCarList.add(car);
            }
        }
        return filteredCarList;
    }


}
