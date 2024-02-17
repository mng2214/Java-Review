import java.util.ArrayList;
import java.util.Objects;

public class ArrayListExample {
    public static void main(String[] args) {

        ArrayList<Integer>items = new ArrayList<>();

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        // items.add("4");

        printDouble(items);

        for(Integer item : items){
            System.out.println(item * 2 );
        }

    }

    private static void printDouble(ArrayList<Integer> items) {

//        for (Object number : items) {
//            System.out.println((Integer) number * 2 );
//        }

        for (int number : items) {
            System.out.println(number * 2);
        }
    }
}
