package Day06.D6t9;

public class Tunnel implements Runnable {
    private int count;

    @Override
    public void run() {
        cross();
    }
    public synchronized void cross() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        count++;
        System.out.println(Thread.currentThread().getName()+"走过了山洞,他是第"
        +count+"个走过山洞的");
    }
}
