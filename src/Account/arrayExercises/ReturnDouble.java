package Account.arrayExercises;

import java.util.Arrays;

public class ReturnDouble {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] doubledArray = doubleArrayLength(array);
        System.out.println(Arrays.toString(doubledArray));
    }

    public static int[] doubleArrayLength(int[] array) {
        int[] doubledArray = new int[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            doubledArray[i] = array[i];
        }
        return doubledArray;
    }
}