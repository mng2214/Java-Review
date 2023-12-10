import java.util.*;

public class MapReview {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Artur");
        map.put(2, "John");
        System.out.println(map.get(2));
        System.out.println(findFirstNonRepeating("JONNY"));

        //Count how many of each item in list
        List<String> items = List.of("Apple", "Peach", "Pen", "Laptop", "GitHub", "Laptop", "Peach");
        Map<String, Integer> mapOfItems = new HashMap<>();
        for (String item : items) {
            mapOfItems.put(item, mapOfItems.getOrDefault(item, 0) + 1);
        }
        System.out.println(mapOfItems);

        // OR
        Map<String, Integer> newMapOfItems = new HashMap<>();
        for (String each : items) {
            newMapOfItems.merge(each,1, Integer::sum);
        }
        System.out.println(newMapOfItems);
    }

    public static Character findFirstNonRepeating(String str) {
        Map<Character, Integer> map = new HashMap<>();
        // for counting the chars
        int count;
        // counting chars and putting values in the hash map
        for (Character ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                count = map.get(ch);
                map.put(ch, count + 1);
            } else map.put(ch, 1);
        }
        // starting from string, check if the char count equals 1
        for (Character ch : str.toCharArray()) {
            if (map.get(ch) == 1) return ch;
        }
        return null;
    }
}
