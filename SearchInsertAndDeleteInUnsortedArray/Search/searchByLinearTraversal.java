package Arrays.SearchInsertAndDeleteInUnsortedArray.Search;

// Time Complexity - O(n)
// Space Complexity - O(1)

public class searchByLinearTraversal {

    public static String elementInArray(int[] arr, int search) {
        int index = -1;

        // Linearly traversing through the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                index = i;
            }
        }

        if (index == -1) { // Element not found
            return search + " not found in array";
        } else { // Element found
            return search + " found at index " + index;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 34, 10, 6, 40 };

        System.out.println(elementInArray(arr, 40)); // Element exists in array
        System.out.println(elementInArray(arr, 56)); // Element does not exist in array
    }
}
