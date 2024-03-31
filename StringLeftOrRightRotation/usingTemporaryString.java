package StringLeftOrRightRotation;

class usingTemporaryString {
    public static void main(String[] args) {
        String str = "Hello World";
        String tempLeft = "";
        String tempRight = "";
        int n = str.length();
        int d = 2;

        // Left Rotation
        tempLeft = str.substring(d, n) + str.substring(0, d);
        System.out.println(tempLeft);

        // Right Rotation
        tempRight = str.substring(n - d, n) + str.substring(0, n - d);
        System.out.println(tempRight);
    }
}