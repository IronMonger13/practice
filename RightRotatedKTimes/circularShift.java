package Arrays.RightRotatedKTimes;

// Time Complexity - O(n)
// Space Complexity - O(1)

public class circularShift {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 2;

        // Calculating mod of k
        k = k % arr.length;

        for (int i = 0; i < arr.length - 1; i++) {
            if (i < k) {
                System.out.println(arr[arr.length + i - k]); // Printing rightmost element
            } else {
                System.out.println(arr[i - k]); // Printing remaining elements
            }
        }
    }
}
