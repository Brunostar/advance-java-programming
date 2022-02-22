public class MultipleCatch {
    public static void main(String args[]) {
        try {
            String a = args[0];
            int b = 2/0;
        }
        catch (ArrayIndexOutOfBoundsException
                | ArithmeticException e) {
            System.out.println(e);
        }
    }
}
