package Arrays.GFGProblems;

import java.util.Arrays;

// Given in question
class Pair {
    long first, second;

    public Pair(long first, long second) {
        this.first = first;
        this.second = second;
    }
}

public class FindMinimumAndMaximumElementInAnArray {
    static Pair getMinMax(long a[], long n) {
        long big = 0, small = 0;
        Arrays.sort(a);
        small = a[0];
        big = a[(int) (n - 1)];

        System.out.println(big + " " + small);

        Pair p1 = new Pair(small, big);
        return p1;
    }

    public static void main(String[] args) {
        long[] arr = { 3, 2, 1, 56, 10000, 167 };
        int n = 6;

        getMinMax(arr, n);
    }
}
