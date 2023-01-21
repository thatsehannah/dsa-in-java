package algorithms.sorts;

import java.util.Arrays;

// Selection sort starts with a minimum index (set to the first index in the array)
// and compares the value at the index to the other values after it in the array while traversing.
// If it comes across a value that is less than the value currently at the minimum index,
// minimum index will now equal the index of that lesser value. Once the traversal reaches
// the end of the array, whatever the value is at minimum index (if it changed at all) is
// swapped with the value that was originally at minimum index. This is repeated
// until the starting place is at the last element of the array.

public class SelectionSort {
    public static void main(String[] args) {
        int[] myArray = {4, 2, 6, 5, 1, 3};
        selectionSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }

        }
    }
}
