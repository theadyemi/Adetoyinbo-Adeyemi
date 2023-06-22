package Account.arrayExercises;

import java.util.Arrays;
import java.util.Scanner;

public class ReturnsDouble {

    public static void main(String[] args) {
        int[]array = {2, 5, 1, 5, 8};
        int [] doubleArray = arrayMethod(array);
        System.out.println(Arrays.toString(doubleArray));
    }
    public static int[] arrayMethod (int[] array){
        int[] arrayCollector = new int[array.length * 2];
        for (int index = 0; index < array.length; index++) {
            arrayCollector[index] = array[index];
        }
        return arrayCollector;
    }

}


