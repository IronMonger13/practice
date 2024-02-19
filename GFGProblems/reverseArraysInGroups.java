package Arrays.GFGProblems;

import java.util.ArrayList;

public class reverseArraysInGroups {

    static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // Checking if k >= n
        if (k >= n) { // k >= n so setting value of k to n
            k = n;
        }
        int kDup = k; // Storing value of k in another variable so that k can be changed

        for (int i = 0; i < n; i = i + kDup) { // Incrementing kDup times so that we move to the next set
            int temp = 0;
            int start = i, end = k - 1;

            // Swapping positions
            while (start < end) {
                temp = arr.get(start);
                arr.set(start, arr.get(end));
                arr.set(end, temp);
                start++;
                end--;
            }

            k = k + kDup;
            if (k >= n) {
                k = n;
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr.get(i));
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = 5;
        int k = 77;
        int[] arr1 = { 35, 56, 48, 21, 87 };

        for (int i = 0; i < arr1.length; i++) {
            arr.add(arr1[i]);
        }

        reverseInGroups(arr, n, k);
    }
}
