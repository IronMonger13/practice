package Arrays.SearchInsertAndDeleteInUnsortedArray.Delete;

// Time Complexity - O(n)
// Space Complexity - O(1)

public class deletionByLinearSearch {
    public static void main(String[] args) {
        int[] arr = { 10, 50, 30, 40, 20 };
        int element = 30;
        int flag = 0;
        int index = -1;

        // Checking if element exists in array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                flag = 1;
                index = i;
                break;
            }
        }

        if (flag == 0) { // Element doesnt exist
            System.out.println(element + " not in array");
        } else { // Element exists

            // Printing before deletion
            System.out.print("Before Deletion: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

            // Shifting elements to left at specified element's index
            for (int i = index; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }

            // Setting last indeex's value to 0
            arr[arr.length - 1] = 0;

            // Printing after deletion
            System.out.println();
            System.out.print("After Deletion: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}
