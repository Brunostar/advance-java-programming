package multi_threading;

public class JoinDemo {
    public static void main(String args[]) throws Exception {
        int a[] = {2, 6, 0, 1, 5, 3};
        MyThread t = new MyThread(a);
        t.join();
        System.out.println("Main printing array elements are: ");
        for(int i = 0; i<a.length; i++)
            System.out.print(a[i]+" ");
    }

    static class MyThread extends Thread {
        int[] a;
        MyThread(int[] ar) {
            a = ar;
            start();
        }
        public void run() {
            java.util.Arrays.sort(a);
            System.out.println("Child complete sorting.");
        }
    }
}
