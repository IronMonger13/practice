package Arrays.GFGProblems;

import java.util.Arrays;

public class findMissingAndRepeating {

    static int[] findTwoElement(int arr[], int n) {
        int duplicate = 0, missing = 0;
        int[] result = new int[2];

        // Sorting array
        Arrays.sort(arr);

        // Finding duplicate
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                duplicate = arr[i];
                result[0] = duplicate;
                break;
            }
        }

        // Finding missing number
        // Find sum of all numberd from 1 to n
        int totalSum = 0;
        for (int i = 1; i <= n; i++) {
            totalSum += i;
        }

        // Find sum of all ements of array
        int sumOfArr = 0;
        for (int i = 0; i < n; i++) {
            sumOfArr += arr[i];
        }

        // Subtarct duplicate from sum of array
        sumOfArr = sumOfArr - duplicate;

        // Subtract sum of elements from total sum
        missing = totalSum - sumOfArr;
        result[1] = missing;

        return result;
    }

    public static void main(String[] args) {
        int Arr[] = { 13, 33, 43, 16, 25, 19, 23, 31, 29, 35, 10, 2, 32, 11, 47, 15, 34, 46, 30, 26, 41, 18, 5, 17, 37,
                39, 6, 4, 20, 27, 9, 3, 8, 40, 24, 44, 14, 36, 7, 38, 12, 1, 42, 12, 28, 22, 45 };
        int n = 47;

        System.out.println(findTwoElement(Arr, n)[0]);
        System.out.println(findTwoElement(Arr, n)[1]);
    }
}
