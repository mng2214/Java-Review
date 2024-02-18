import java.util.Arrays;
import java.util.List;

public class CityData {

    public static void main(String[] args) {

        State IL = new State();
        IL.addCity("Chicago");
        IL.addCity("Skokie");
        IL.addCity("Niles");

        System.out.println(IL);

        State CA = new State();
        CA.addCity("San Diego");
        CA.addCity("Los Angeles");
        CA.addCity("Santa Monica");

        List<State> listState = Arrays.asList(IL, CA);
//
//        listState.stream()
//                .map(State::getCities)
//                .flatMap(List::stream)
//                .forEach(System.out::println);

    }

    //115 timestamp


}
