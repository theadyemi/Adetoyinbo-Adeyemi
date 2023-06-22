package Account.arrayExercises;

import java.util.HashMap;
import java.util.Map;

public class LetTry {
    public static int findIndexWithMostOccurrences(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty.");
        }

        // Create a HashMap to store the count of each index
        Map<Integer, Integer> indexCountMap = new HashMap<>();

        // Iterate over the array and count the occurrences of each index
        for (int i = 0; i < arr.length; i++) {
            if (indexCountMap.containsKey(arr[i])) {
                indexCountMap.put(arr[i], indexCountMap.get(arr[i]) + 1);
            } else {
                indexCountMap.put(arr[i], 1);
            }
        }

        // Find the index with the maximum count
        int maxCount = 0;
        int maxIndex = -1;
        for (Map.Entry<Integer, Integer> entry : indexCountMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxIndex = entry.getKey();
            }
        }

        return maxIndex;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 1, 2, 2};
        int indexWithMostOccurrences = findIndexWithMostOccurrences(arr);
        System.out.println("Index with most occurrences: " + indexWithMostOccurrences);
    }
}
