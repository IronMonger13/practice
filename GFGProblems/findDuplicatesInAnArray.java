package Arrays.GFGProblems;

import java.util.ArrayList;
import java.util.Arrays;

public class findDuplicatesInAnArray {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        ArrayList<Integer> dups = new ArrayList<>();

        // Sorting array in ascending order
        Arrays.sort(arr);

        // Variable to indicate last position of a duplicate
        int prev = -1;

        for (int i = 1; i < n; i++) {
            // Checking if element at i and i-1 are same and element at index i should not
            // be equal to element at index 'prev'
            if (arr[i] == arr[i - 1] && arr[i] != prev) {
                dups.add(arr[i]);
                prev = arr[i];
            }
        }

        if (dups.isEmpty()) {
            dups.add(-1);
        }

        return dups;
    }

    public static void main(String[] args) {
        int arr[] = { 0, 3, 1, 2 };
        int n = 4;

        System.out.println(duplicates(arr, n));
    }
}
