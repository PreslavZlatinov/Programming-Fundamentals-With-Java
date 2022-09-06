public class Demo {
    public static void main(String[] args) {
        int input = 2345;
        String numberAsString = "" + input;

        for (int i = 0; i <numberAsString.length() ; i++) {
            int currentDigit = Integer.parseInt("" + numberAsString.charAt(i));
            int result = currentDigit + 1;
            System.out.print(result);
        }
    }
}
