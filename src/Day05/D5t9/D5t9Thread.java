package Day05.D5t9;

public class D5t9Thread {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println("主线程" + i);
            }
        }
    }

}
