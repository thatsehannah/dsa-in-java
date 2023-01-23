package algorithms.sorts;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 7, 8};
        int[] array2 = {2, 4, 5, 6};
        System.out.println(Arrays.toString(merge(array1, array2)));
    }

    static int[] mergeSort(int[] array) {
        if (array.length == 1) {
            return array;
        }

        int midIndex = array.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(array, 0, midIndex));
        int[] right = mergeSort(Arrays.copyOfRange(array, midIndex, array.length));

        return merge(left, right);
    }

    // Helper method that puts 2 arrays together
    static int[] merge(int[] array1, int[] array2) {
        int[] combined = new int[array1.length + array2.length];
        int cIndex = 0; // index for combined array
        int i = 0; // index for array1
        int j = 0; // index for array2

        // testing if either array is empty
        // if either array is empty, will break out of while loop
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                combined[cIndex] = array1[i];
                i++;
            } else {
                combined[cIndex] = array2[j];
                j++;
            }
            cIndex++;
        }

        // if after the above while loop is finished running, array1 could
        // still have items in it that will need to be pushed into the
        // combined array
        while (i < array1.length) {
            combined[cIndex] = array1[i];
            cIndex++;
            i++;
        }

        // same scenario as above while loop
        while (j < array2.length) {
            combined[cIndex] = array2[j];
            cIndex++;
            j++;
        }

        return combined;
    }

}
