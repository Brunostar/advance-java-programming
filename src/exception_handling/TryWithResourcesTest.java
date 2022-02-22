public class TryWithResourcesTest {
    public static void main(String args[]) throws Exception {
        try {
            try (MyResource mr = new MyResource()) {
                System.out.println("Throwing from try block");
                throw new Exception("try block");
            }
        }
        catch (Exception e) {
            System.out.println(e);
            Throwable[] t = e.getSuppressed();
            System.out.println("Suppressed exception...");
            for(int i=0; i<t.length; i++)
                System.out.println(t[i]);
        }
    }
}

class MyResource implements AutoCloseable {
    public void close() throws Exception {
        System.out.println("Throwing from close()");
        throw new Exception("close()");
    }
}
