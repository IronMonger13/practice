package StringLeftOrRightRotation;

public class usingExtendedString {
    public static void main(String[] args) {
        String str = "Hello World";
        String strExt = str + str;
        int n = str.length();
        int d = 2;

        // Left Rotation
        System.out.println(strExt.substring(d, n + d));

        // Right Rotation
        System.out.println(strExt.substring(strExt.length() - d - 1, strExt.length()) + strExt.substring(0, n - d - 1));
    }
}
