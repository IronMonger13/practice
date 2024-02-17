package Arrays.RightRotatedKTimes;

// Time Complexity - O(n)
// Space Complexity - O(1)

public class reversingTheArray {

    // Using two pointer approach in loop to reverse the array
    public static void reverseArray(int[] arr, int start, int end, int k) {
        for (int i = start; i < end; i++) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
            if (start >= end) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 2; // Right shift by 2 positions

        // First reverseing of array from index length-k to end of array
        reverseArray(arr, arr.length - k, arr.length - 1, k);

        // Second reversing of array from index 0 to length-k-1 (-1 so that it doesnt go out of bounds)
        reverseArray(arr, 0, arr.length - k - 1, k);

        // Third reversing of complete array to right shift by k positions
        reverseArray(arr, 0, arr.length - 1, k);

        // Printing the array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
