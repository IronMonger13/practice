class usingALoop {
    public static void main(String[] args) {
        String str = "Hello World";

        StringBuilder revstr = new StringBuilder();

        for (int i = str.length() - 1; i >=0; i--) {
            revstr.append(str.charAt(i));
        }

        System.out.println(revstr.toString());
    }
}