package Day05.D5t9;

public class MyThread extends Thread {

    @Override
    public void run() {
        for (int j = 1; j <= 100; j++) {
            if (j % 2 == 0) {
                System.out.println("子线程正在执行" + j);
            }
        }
    }
}

