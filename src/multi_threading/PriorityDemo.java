package multi_threading;

public class PriorityDemo extends Thread {
    public void run() {
        System.out.println("Child's initial priority: "+getPriority());
        setPriority(3);
        System.out.println("After change, child's priority: "+getPriority());
    }

    public static void main(String args[]) {
        Thread t = Thread.currentThread();
        System.out.println("Main's initial priority: "+t.getPriority());
        t.setPriority(7);
        System.out.println("After change, main's priority: "+t.getPriority());
        new PriorityDemo().start();
    }
}
