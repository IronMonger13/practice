package Arrays.LeftRotationByDPositions;

// Time Complexity - O(n)
// Space Complexity - O(n)

public class usingATempArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        int d = 2; // Rotating left by 2 positions

        // Creating a temp array
        int[] tempArr = new int[arr.length];

        // Copying from postions d to array length - 1 into temp array
        int i = 0;
        for (int j = d; j < arr.length; j++) {
            tempArr[i] = arr[j];
            i++;
        }

        // Copying from poistion 0 to d into temp array
        for (int j = 0; j < d; j++) {
            tempArr[i] = arr[j];
            i++;
        }

        // Copying temp array into original array
        for (int j = 0; j < tempArr.length; j++) {
            arr[j] = tempArr[j];
        }

        // Printing array
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

    }
}
