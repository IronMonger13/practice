package StringCheckingIfTwoStringsAreIdentical;

public class usingEqualsFunction {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "Hello World";        
        
        if (str1.equals(str2)){
            System.out.println(str1 + " is equal to " + str2);
        } else{
            System.out.println(str1 + " is not equal to " + str2);
        }

        String str3 = "Hello World";
        String str4 = "Hello";        
        
        if (str3.equals(str4)){
            System.out.println(str3 + " is equal to " + str4);
        } else{
            System.out.println(str3 + " is not equal to " + str4);
        }
    }
}
