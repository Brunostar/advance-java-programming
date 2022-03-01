package multi_threading;

public class RaceConditionDemo extends Thread {
    static class Counter {
        int val = 0;
        synchronized void inc() { val++; }
        synchronized void dec() { val--; }
    }

    Counter c;
    RaceConditionDemo(Counter c) { this.c = c; start(); }
    public void run() {
        for(int i=0; i<1000; i++) c.dec();
    }
    public static void main(String args[]) throws Exception {
        Counter c = new Counter();
        RaceConditionDemo rc = new RaceConditionDemo(c);
        for (int i=0; i<1000; i++) c.inc();
        rc.join();
        System.out.println("Final value of c.val: "+c.val);
    }
}
