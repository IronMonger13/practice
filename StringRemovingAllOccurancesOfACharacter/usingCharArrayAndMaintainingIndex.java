package StringRemovingAllOccurancesOfACharacter;

public class usingCharArrayAndMaintainingIndex {
    public static void main(String[] args) {
        String s = "geeksforgeeks";
        char c = 'e';

        int j, count = 0, n = s.length();
        char[] t = s.toCharArray();
        for (int i = j = 0; i < n; i++) {
            if (t[i] != c) {
                t[j++] = t[i];
            } else {
                count++;
            }

        }
        for (int i = 0; i < t.length - count; i++) {
            System.out.print(t[i]);
        }
    }
}
