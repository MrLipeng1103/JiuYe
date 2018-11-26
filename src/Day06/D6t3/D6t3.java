package Day06.D6t3;

public class D6t3 {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        mt1.start();
        MyRunnable mr = new MyRunnable();
        Thread t = new Thread(mr);
        t.start();
    }
}
