public class usingInBuiltMethod {
    public static void main(String[] args) {
        String str = "Hello World";
        
        StringBuffer revStr = new StringBuffer(str);

        System.out.println(revStr.reverse());
    }
}
