package data_structures.hash_tables.interview_questions;

import java.util.HashMap;

public class ItemsInCommon {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 5};
        int[] array2 = {2, 4, 8};

        System.out.println("Are there items in common in these 2 arrays? " + itemInCommon(array1, array2));
    }

    // Common interview question
    // O(n)
    static boolean itemInCommon(int[] array1, int[] array2) {
        HashMap<Integer, Boolean> myHashMap = new HashMap<>();

        for (int i : array1) {
            myHashMap.put(i, true);
        }

        for (int j : array2) {
            if (myHashMap.containsKey(j)) {
                return true;
            }
        }

        return false;
    }
}
