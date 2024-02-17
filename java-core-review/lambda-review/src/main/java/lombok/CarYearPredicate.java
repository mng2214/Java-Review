package lombok;

public class CarYearPredicate implements CarPredicate {
    @Override
    public boolean test(Car car) {
        return car.getYear() > 2015;
    }
}
