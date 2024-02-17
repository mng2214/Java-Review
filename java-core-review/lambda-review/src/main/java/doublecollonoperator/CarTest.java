package doublecollonoperator;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class CarTest {
    public static void main(String[] args) {

        // Zero Arg

        Supplier<Car> c1 = () -> new Car();
        System.out.println(c1.get().getModel());

        Supplier<Car> c2 = Car::new;
        System.out.println(c2.get().getModel());

        // One Arg

        Function<Integer, Car> f1 = (model) -> new Car(model);
        Car bmw = f1.apply(535);
        System.out.println(bmw.getModel());

        Function<Integer, Car> f2 = Car::new;
        Car bmw1 = f2.apply(535);
        System.out.println(bmw1.getModel());

        // Two Arg

        BiFunction<String, Integer, Car> b1 = (make, model) -> new Car(make, model);
        Car honda = b1.apply("honda", 2009);
        System.out.println(honda.getMake() + " " + honda.getModel());

        BiFunction<String, Integer, Car> b2 = Car::new;
        Car audi = b2.apply("audi", 4);
        System.out.println(audi.getMake() + " " + audi.getModel());

    }
}
