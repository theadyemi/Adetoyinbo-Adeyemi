package Account.arrayExercises;

import java.util.Arrays;

public class ArrayHighestIndex {
    int [] arrays;
    public int[] collectHighest(int[] array) {
        int counter = 0;
        int[] arrays = {3, 5, 5, 8, 3, 8, 8};
        for (int i = 0; i < array.length; i++) {
            for (counter = 0; counter > i; counter++) {
                counter = array[counter];
                if (counter > array[counter]) {

                }

            }


            return arrays;

        }
        return new int[]{0};
    }

    public static void main(String[] args) {
        ArrayHighestIndex mywork = new ArrayHighestIndex();
        int[] array = {3, 5, 5, 8, 3, 8, 8};
        System.out.println(Arrays.toString(mywork.collectHighest(array)));;
    }

}


