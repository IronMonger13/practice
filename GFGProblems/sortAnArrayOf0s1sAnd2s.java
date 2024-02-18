package Arrays.GFGProblems;

import java.util.Arrays;

public class sortAnArrayOf0s1sAnd2s {

    public static void sort012(int a[], int n) {
        Arrays.sort(a);

        for (int i = 0; i < n; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0 };
        int n = 3;
        sort012(arr, n);
    }
}
