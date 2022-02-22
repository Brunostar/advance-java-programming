public class ThrowTest {
    public static void main(String[] args) {
        try {
            throw new Exception("test");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
