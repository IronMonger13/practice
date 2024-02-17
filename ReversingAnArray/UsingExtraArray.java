package Arrays.ReversingAnArray;

//Time Complexity - O(n)
// Space Complexity - O(n)

public class UsingExtraArray {
    public static void main(String[] args) {
        int[] originalArray = { 1, 2, 3, 4, 5 };
        int[] reversedArray = new int[originalArray.length]; //Creating new array forr reverse

        //Reverse copying into new array
        for (int i = 0; i < originalArray.length; i++) {
            reversedArray[i] = originalArray[originalArray.length - 1 - i]; 
        }

        // Printing Reversed Array
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.println(reversedArray[i]);
        }
    }
}
