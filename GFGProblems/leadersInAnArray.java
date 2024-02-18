package Arrays.GFGProblems;

import java.util.ArrayList;

public class leadersInAnArray {
    static ArrayList<Integer> leaders(int arr[], int n) {
        ArrayList<Integer> result = new ArrayList<>();

        // Using variable to keep track of indexes that are on right of i in loop
        int pointer;

        for (int i = 0; i < n - 1; i++) {
            // Using flag to break out of while loop so that index stays within array's
            // length
            int flag = 0;
            pointer = i + 1;

            while (arr[i] >= arr[pointer] && flag == 0) {
                if (pointer == n - 1) {
                    result.add(arr[i]);
                    flag = 1;
                } else
                    pointer++;
            }
        }

        // Adding last element to result
        result.add(arr[n - 1]);
        return result;
    }

    public static void main(String[] args) {
        int A[] = { 1, 2, 3, 4, 0 };
        int n = 5;

        System.out.println(leaders(A, n));
    }
}
