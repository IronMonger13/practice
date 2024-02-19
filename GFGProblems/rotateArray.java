package Arrays.GFGProblems;

public class rotateArray {
    public static int HCF(int length, int d) {
        int HCF = 0;
        for (int i = 1; i <= d; i++) {
            if (length % i == 0 && d % i == 0) {
                HCF = i;
            } else {
                continue;
            }
        }
        return HCF;
    }

    static void rotateArr(int arr[], int d, int n) {
        d = d % n;
        int hcf = HCF(n, d);

        int temp, currentPosition, newPosition = 0;

        // Iterating the numebr of times as the hcf
        for (int i = 0; i < hcf; i++) {
            temp = arr[i];
            currentPosition = i;

            // Shifting values in the set
            while (true) {
                newPosition = currentPosition + d; // Calculating new position by adding d to current position

                // If the new position exceeds the array length, adjust it by wrapping around
                if (newPosition >= n) {
                    newPosition = newPosition - n;
                }

                // If the new position reaches the original starting position 'i', exit the loop
                if (newPosition == i) {
                    break;
                }

                // Move the element at the new position to the old position
                arr[currentPosition] = arr[newPosition];

                // Update the old position for the next iteration
                currentPosition = newPosition;
            }
            arr[currentPosition] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int d = 2;
        int n = 5;

        rotateArr(arr, d, n);
    }
}
