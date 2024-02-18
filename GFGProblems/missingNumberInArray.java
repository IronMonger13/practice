package Arrays.GFGProblems;

public class missingNumberInArray {

    static int missingNumber(int array[], int n) {
        // Finding sum of all elements in array
        int arrSum = 0;
        for (int i = 0; i < n - 1; i++) {
            arrSum += array[i];
        }

        // Finding sum of all numbers from 1 to n
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        // Returning difference to find missing number in the array
        return sum - arrSum;
    }

    public static void main(String[] args) {
        int n = 10;
        int[] array = { 6, 1, 2, 8, 3, 4, 7, 10, 5 };

        System.out.println(missingNumber(array, n));
    }
}
