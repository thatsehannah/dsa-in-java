package algorithms.sorts;

import java.util.Arrays;

public class InsertionSort {

    // Insertion sort always start with the second item, and we compare it to the item before
    // it. If the second item is less than, the two elements swap, and we move on to the next
    // item, repeating the same process. Otherwise, you move on to the next item. However, once
    // you get to an item that is less than, say the previous 3 elements. You're gonna keep swapping
    // with those 3 previous elements until you can't swap anymore. This is repeated until the last
    // item in the array is compared

    public static void main(String[] args) {
        int[] myArray = {1, 2, 4, 3, 5, 6};
        insertionSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j > -1 && temp < array[j]) {
                array[j + 1] = array[j];
                array[j] = temp;
                j--;
            }
        }
    }
}
