public class ArraySorting {
    public static void main(String[] args) {
        ArraySorting as = new ArraySorting();
        //as.sort();

        QuickSort qs = new QuickSort();
        as.sort(qs);

        BubbleSorting bs = new BubbleSorting();
        as.sort(bs);

        // MyLambda myLambda = () -> System.out.println("Sorting an array");

        // Sorting myLambda2 = () -> System.out.println("Sorting an array");

        Sorting noLambda = new QuickSort();
        noLambda.sort();

        Sorting bubbleSort = () -> System.out.println("quick sorting");
        as.sort(bubbleSort);

        as.sort(() -> System.out.println("quick sorting"));

    }

    private void sort(Sorting sorting) {  // Behavior Parameterization
        sorting.sort();
    }


//    interface MyLambda {
//        void print();
//    }

}
