package StringInsertCharactersAtCertainPosition;

public class soln {
    public static void main(String[] args) {
        String str = "HelloMyFriends";
        int chars[] = { 1, 5, 7, 9 };
        String result = "";

        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            if (j < chars.length && i == chars[j]) {
                result += "*";
                j++;
            }
            result += str.charAt(i);
        }

        System.out.println(result);
    }
}
