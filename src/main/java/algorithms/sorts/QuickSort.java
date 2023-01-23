package algorithms.sorts;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] myArray = {4, 6, 1, 7, 3, 2, 5};
        // tests pivot function
//        int returnedIndex = pivot(myArray, 0, myArray.length - 1);
//        System.out.println("Returned index: " + returnedIndex);
//        System.out.println(Arrays.toString(myArray));

        quickSort(myArray);
        System.out.println(Arrays.toString(myArray));
    }

    static void quickSort(int[] array) {
        quickSortHelper(array, 0, array.length - 1);
    }

    static void quickSortHelper(int[] array, int leftIndex, int rightIndex) {
        if (leftIndex < rightIndex) {
            int pivotIndex = pivot(array, leftIndex, rightIndex);
            quickSortHelper(array, leftIndex, pivotIndex - 1);
            quickSortHelper(array, pivotIndex + 1, rightIndex);
        }


    }

    private static int pivot(int[] array, int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex;
        for (int i = pivotIndex + 1; i <= endIndex; i++) {
            if (array[i] < array[pivotIndex]) {
                swapIndex++;
                swap(array, swapIndex, i);
            }
        }
        swap(array, pivotIndex, swapIndex);
        return swapIndex;
    }

    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }


}
