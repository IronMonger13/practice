package Arrays.GFGProblems;

import java.util.ArrayList;

public class subarrayWithGivenSum {

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
        // Initialize an ArrayList to store the result
        ArrayList<Integer> result = new ArrayList<>();

        int sum = 0;
        int start = 0;

        for (int i = 0; i < n; i++) {
            // Add the current element to the sum
            sum += arr[i];

            // If the sum exceeds the given value and start index is less than the current
            // index, remove elements from the start of the subarray until the sum becomes
            // less than or equal to s
            while (sum > s && start < i) {
                sum -= arr[start];
                start++;
            }

            if (sum == s) {
                result.add(start + 1);
                result.add(i + 1);
                return result;
            }
        }

        result.add(-1);
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 7, 5 };
        int n = 5;
        int s = 7;

        System.out.println(subarraySum(arr, n, s));
    }
}
