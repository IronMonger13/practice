package Arrays.GFGProblems;

public class cyclicallyRotateAnArrayByOne {
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

    public void rotate(int arr[], int n) {
        // First reverseing of array from index length-1 to end of array
        reverseArray(arr, n - 1, n - 1, 1);

        // Second reversing of array from index 0 to length-2 (-1 extra so that it
        // doesnt go out of bounds)
        reverseArray(arr, 0, n - 2, 1);

        // Third reversing of complete array to right shift by k positions
        reverseArray(arr, 0, n - 1, 1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = 5;

    }
}
