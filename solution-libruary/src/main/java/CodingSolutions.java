import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

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

    // Given an array of int and target num. Return indexes of a number from array that will give result as target
    // Input [2,7,11,15] target = 9
    // Output [0,1]

    public static int[] indexOfSumFinder(int[] arr, int target) {
        // int [] result = new int[2];

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    // OR

    public static int[] indexOfSumFinderOptimal(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int potentialMatch = target - arr[i];
            if (map.containsKey(potentialMatch)) return new int[]{i, potentialMatch};
            else map.put(arr[i], i);
        }
        return null;
    }


    // count elements in collection as a map key / value
    public <T> Map<T, Long> collectionToMap(Collection<T> collection) {
        return collection.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public <T>   List<T> findDuplicates (List<T> list){
        List<T> collect = list.stream()
                .filter(i -> list.indexOf(i) != list.lastIndexOf(i))
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Dups: "+ collect);
        return collect;
        //  List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 2, 3, 5, 6, 6, 7, 8, 9, 9));
    }


    public static void main(String[] args) {
       List<String> lang = Arrays.asList("java", "java", "python", "ruby", "c", "c++", "c++");
       List<Integer> nums = Arrays.asList(1, 23, 4, 4, 1, 2, 5, 7, 6, 4);
//
     CodingSolutions codingSolutions = new CodingSolutions();
//        System.out.println(codingSolutions.collectionToMap(nums));

        codingSolutions. findDuplicates(nums);
    }

}
