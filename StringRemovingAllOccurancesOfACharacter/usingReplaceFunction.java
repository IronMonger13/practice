package StringRemovingAllOccurancesOfACharacter;

public class usingReplaceFunction {
    public static void main(String[] args) {
        String str = "GeeksForGeeks";
        char ch = 'e';

        str = str.replace(Character.toString(ch), "");
        System.out.println(str);
    }
}
