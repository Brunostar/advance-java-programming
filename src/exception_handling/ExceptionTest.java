public class ExceptionTest {
    public static void main(String[] args) {
        int d = 0, result;
        try {
            result = 100/d;
        }
        catch (ArithmeticException e) {
            System.out.println("An arithmetic exception occurred.");
            result = 100;
        }
        System.out.println("After catch block");
    }
}
