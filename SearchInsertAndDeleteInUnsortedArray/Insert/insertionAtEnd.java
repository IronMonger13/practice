package Arrays.SearchInsertAndDeleteInUnsortedArray.Insert;

// Time Complexity - O(n)
// Space Complexity - O(1)

public class insertionAtEnd {
    public static void main(String[] args) {
        int[] arr = new int[20];
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;

        int elementToInsert = 26;

        System.out.print("Before Insertion: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Adding element to array's end
        int index = 6;
        arr[index] = elementToInsert;

        System.out.println();
        System.out.print("After Insertion: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
