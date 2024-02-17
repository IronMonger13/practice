package Arrays.SearchInsertAndDeleteInUnsortedArray.Insert;

// Time Complexity - O(n)
// Space Complexity - O(1)

public class insetionAtAnyPosition {
    public static void main(String[] args) {
        int[] arr = new int[10];
        arr[0] = 2;
        arr[1] = 4;
        arr[2] = 1;
        arr[3] = 8;
        arr[4] = 5;

        // Before Insertion
        System.out.print("Before Insertion: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        int index = 3;
        int element = 10;

        // Right shifting of elements after specified index
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        // Inserting element at thee given index
        arr[index] = element;

        // After Insertion
        System.out.println();
        System.out.print("After Insertion: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
