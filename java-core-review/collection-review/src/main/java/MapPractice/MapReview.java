package MapPractice;

import java.util.HashMap;
import java.util.Map;

public class MapReview {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1,"Artur");
        map.put(2,"Joe");
        map.put(3,"Will");
        map.put(4,"Matt");

        System.out.println(map);
        System.out.println(map.get(2));

        String str  = "java developer";
        System.out.println(firstNonRepeatedCharMap(str));

    }

    public static Character firstNonRepeatedCharMap(String str) {

        Map<Character, Integer> map = new HashMap<>();
        int count;

        for (Character letter : str.toCharArray()) {
            if (map.containsKey(letter)) {
                count = map.get(letter);
                map.put(letter, count + 1);
            } else {
                map.put(letter, 1);
            }
        }

        for (Character letter : str.toCharArray()) {
            if (map.get(letter) == 1) {
                return letter;
            }
        }

        return Character.MIN_VALUE;
    }
}
