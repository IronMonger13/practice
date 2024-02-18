package Arrays.GFGProblems;

public class equilibriumPoint {
    public static int equilibriumPoint(long arr[], int n) { 
        int index = -1;

        if (arr.length == 1) { // Length of array is 1
            index = 1;
        } else { // Length of array is greater than 1
            int leftSum = 0, rightSum = 0;
            int totalSum = 0;

            // Finding total sum of all elements in array
            for (int i = 0; i < n; i++) {
                totalSum += arr[i];
            }
            for (int i = 0; i < n; i++) {
                // Finding sum of elemennts on right side
                rightSum = (int) (totalSum - arr[i] - leftSum);

                // Checking if sum of left side and right side are equal
                if (rightSum == leftSum) {
                    index = i + 1;
                }

                // Finding sum of elements on right side
                leftSum += arr[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        long A[] = { 1, 3, 5, 2, 2 };
        int n = 5;

        System.out.println(equilibriumPoint(A, n));
    }
}
