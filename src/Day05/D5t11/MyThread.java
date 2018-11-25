package Day05.D5t11;

import java.util.Date;

public class MyThread extends Thread {
    @Override
    public void run() {
        long sta = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            String c = "程序员";
           // System.out.println(c);
        }
        long end = System.currentTimeMillis();
        System.out.println("线程3用时:" + (end - sta));

    }
}
