import java.util.HashSet;
import java.util.Set;

public class SetReview {
    public static void main(String[] args) {
        //1. create a set
        Set<Student> mySet=new HashSet<>();

        // 2 add element
        mySet.add(new Student(7, "Artur"));
        mySet.add(new Student(8, "John"));
        mySet.add(new Student(9, "Stan"));
        mySet.add(new Student(9, "Lisa"));

        System.out.println(mySet);

        Set<Integer> numSet=new HashSet<>();
        numSet.add(1);
        numSet.add(2);
        //System.out.println(numSet);
        //System.out.println(numSet.add(2));
        // System.out.println("first repeating:  " +firstRepeatingChar("java developer"));

        System.out.println(SetReview.firstRepeatingChar("Java Developer"));
        System.out.println(SetReview.returner());
    }
    public static Character firstRepeatingChar(String str){
        //Create a hashmap
        Set<Character> chars=new HashSet<>();
        // Iteration return ch if add returns false
        for(Character ch:str.toCharArray()) if(!chars.add(ch)) return ch;
        return null;
    }
    public static char returner () {
        String str =  "Java Developer";
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if(!set.add(str.charAt(i))){
                return  str.charAt(i);
            }
        }
        return 0;
    }

}
