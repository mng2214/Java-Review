import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CodingSolutions {

    // Find first matching char in a string String str = "java developer" SET Solution
    public static Character firstRepeatedChar(String str) {
        Set<Character> strSet = new HashSet<>();
//        for (int i = 0; i < str.length(); i++) {
//            if (!strSet.add(str.charAt(i))) return str.charAt(i);
//        }
//        return null;

        for (Character eachLetter : str.toCharArray()) if (!strSet.add(eachLetter)) return eachLetter;
        return null;
    }

    // Find first matching char in a string String str = "java developer" MAP Solution

    public static Character firstNonRepeatedCharMap(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (Character letter : str.toCharArray()) {
            map.put(letter, map.getOrDefault(letter, 0) + 1);
        }

        for (Character letter : str.toCharArray()) {
            if (map.get(letter) == 1) {
                return letter;
            }
        }

        return null;
    }


}
