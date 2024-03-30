public class usingTwoPointers {
    public static void main(String[] args) {
        String str = "Hello World";
        int start = 0;
        int end = str.length() - 1;

        char ch[] = str.toCharArray();
        char temp;

        for (start = 0; start <= end; start++) {
            temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            end--;
        }

        System.out.println(ch);
    }
}
