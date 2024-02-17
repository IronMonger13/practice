package Arrays.ReversingAnArray;

// Time Complexity - O(n)
// Space Complexity - O(1)

public class usingALoopAndtwoPointers {
    public static void main(String[] args) {
        int[] originalArray = { 1, 2, 3, 4, 5 };

        // Initializing start and end pointers
        int start = 0;
        int end = originalArray.length - 1;

        // Making a temporary variable to store value
        int temp = 0;
        
        for (int i = 0; i < originalArray.length; i++) {
            // Swapping start and end pointer values
            temp = originalArray[start];
            originalArray[start] = originalArray[end];
            originalArray[end] = temp;

            // Increasing start pointer value and decreasing end pointer value by 1
            start++;
            end--;

            // Breaking out of loop when start and end poinnters meet or cross each other
            if (start >= end) {
                break;
            }
        }

        // Printing reversed array
        for (int i = 0; i <= originalArray.length; i++) {
            System.out.println(originalArray[i]);
        }
    }
}
