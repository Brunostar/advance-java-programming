package multi_threading;

public class MyClass implements Runnable {
    public void run() {
        for(int i=0; i<4; i++)
            System.out.println("In my thread: "+i);
    }
    public static void main(String arg[]) {
        Thread t = new Thread(new MyClass());
        t.start();
        for(int i=0; i<6; i++)
            System.out.println("In main thread: "+i);
    }
}
