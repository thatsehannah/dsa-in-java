package algorithms.sorts;

import java.util.Arrays;

public class BubbleSort {

    // Bubble sort traverses an array from the first element to the last. Each element is compared
    // to the next element (to the right). If the current element is greater than its neighbor to the right,
    // they are swapped.

    public static void main(String[] args) {
        int[] myArray = {4, 2, 6, 5, 1, 3};
        bubbleSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    public static void bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j]; // grabs the larger item between the two
                    array[j] = array[j+1]; // the larger number's index now holds the smaller number
                    array[j + 1] = temp; // the smaller number's index now holds the larger number
                }
            }
        }
    }
}
