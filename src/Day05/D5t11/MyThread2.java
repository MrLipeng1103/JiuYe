package Day05.D5t11;

public class MyThread2 extends Thread {
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            String b = "程序员" + i;
            //System.out.println(b);
        }
        long end = System.currentTimeMillis();
        System.out.println("线程2用时:" + (end - start));

    }
}
