import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SumTwo {
    public static void main(String[] args) {
        // Fist 2 elements in array gives sum of 9
        int[] myarray={2,7,9,11};
    //    System.out.println(Arrays.toString(twoSum1(myarray,9)));
        System.out.println("Optimal Solution .....");
        System.out.println(Arrays.toString(twoSum2(myarray,20)));

        System.out.println("Another option");
        // Another option
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, 7, 11, 15));
        int target = 9;
        ArrayList<Integer> twoNums = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            for (int k = i; k < numbers.size() - 1; k++) {
                if (numbers.get(i) + numbers.get(k) == target) {
                    twoNums.add(numbers.get(i));
                    twoNums.add(numbers.get(k));
                    break;
                }
            }
        }
        System.out.println(twoNums);
    }
    public static int[] twoSum1(int[] array, int target){
        for(int i=0;i<array.length-1;i++){  //n
            for(int j=i+1; j<array.length;j++) //n
                if((array[i]+array[j])==target) return new int[]{i,j};
        }
        return new int[]{};
    }
    // my Optimal Solution O(n)
    public static int[] twoSum2(int[] array, int target){
        //Create HashMap
        Map<Integer,Integer> map=new HashMap<>();

        //Iterate over the array.
        // If a potential match exists return that indices else put the array value and index to map
        for(int i=0;i< array.length;i++){
            //int potentialMatch=target-array[i];
            int potentialMatch=target-array[i];
            if(map.containsKey(potentialMatch)) return new int[]{map.get(potentialMatch),i};
            else map.put(array[i],i);
        }
        return new int[]{};

//        for (int i = 0; i < array.length; i++) {
//            int potentialMatch = target - array[i];
//            if (map.containsKey(potentialMatch)) {
//                return new int[] { map.get(potentialMatch), i };
//            }
//            map.put(array[i], i);
//        }
//
//        return new int[] {};

    }
}
