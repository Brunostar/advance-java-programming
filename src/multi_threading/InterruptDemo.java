package multi_threading;

public class InterruptDemo {
    static class Timer extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println(
                        "Timer running. Date & time: " + new java.util.Date()
                );
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Timer was interrupted");
                    return;
                }
            }
        }
    }

    public static void main(String args[]) throws InterruptedException {
        Timer t = new Timer();
        t.start();
        Thread.sleep(4000);
        t.interrupt();
    }
}
