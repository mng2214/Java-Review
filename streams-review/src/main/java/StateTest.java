import java.util.Arrays;
import java.util.List;

public class StateTest {

    public static void main(String[] args) {

        State il = new State();
        il.addCity("chicago");
        il.addCity("niles");
        il.addCity("skokie");
        il.addCity("rockford");

        State tx = new State();
        tx.addCity("austin");
        tx.addCity("dallas");
        tx.addCity("huston");
        tx.addCity("ft worth");

        List<State> list = Arrays.asList(il, tx);

        list.stream()
                .map(State::getCity)
                .flatMap(List::stream)
                .forEach(System.out::println);

        System.out.println("-".repeat(40));

        list.stream()
                .flatMap(state -> state.getCity().stream())
                .forEach(state -> System.out.print(state + " "));


    }
}
