package Arrays.LeftRotationByDPositions;

// Time Complexity - O(n^2)
// Space Complexity - O(1)

public class rotateOneByOne {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int d = 2; // Rotating left by 2 positions

        int temp = 0;
        for (int i = 1; i <= d; i++) { //Iterating d times
            // Creating temp variable to store arr[0]
            temp = arr[0];

            // Using loop to shift values one position to left circularly
            for (int j = 1; j < arr.length; j++) {
                arr[j - 1] = arr[j];
            }

            // Storing temp value in last index of array
            arr[arr.length - 1] = temp;
        }

        // Printing the array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
