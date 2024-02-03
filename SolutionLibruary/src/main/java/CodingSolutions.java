import java.util.HashSet;
import java.util.Set;

public class CodingSolutions {

    // Find first matching char in a string String str = "java developer"
    public static Character firstRepeatedChar(String str) {
        Set<Character> strSet = new HashSet<>();
//        for (int i = 0; i < str.length(); i++) {
//            if (!strSet.add(str.charAt(i))) return str.charAt(i);
//        }
//        return null;

        for(Character eachLetter : str.toCharArray()) if(!strSet.add(eachLetter)) return eachLetter;
        return null;
    }


}
