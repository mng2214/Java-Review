public class GenericsPractice {

    public static String[] stringArr = {"apple", "desk", "laptop"};
    public static Integer[] intArr = {1, 3, 5, 8, 13};
    public static Long[] longArr = {10L, 1000L, 100000L};

//    public void printEach (String[] array){
//        for(String each :array){
//            System.out.println(each);
//        }
//    }
//
//    public void printEach (Integer[] array){
//        for(Integer each :array){
//            System.out.println(each);
//        }
//    }
//
//    public void printEach (Long[] array){
//        for(Long each :array){
//            System.out.println(each);
//        }
//    }

    public static <T> void printEach(T[] array) {
        for (T each : array) {
            System.out.println(each);
        }
    }

    public static void main(String[] args) {
        printEach(stringArr);
        printEach(intArr);
        printEach(longArr);
    }
}
