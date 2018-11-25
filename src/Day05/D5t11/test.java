package Day05.D5t11;

public class test {
    public static void main(String[] args) {
        long s = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            Integer a = i;
            //System.out.println(a);
        }
        long e = System.currentTimeMillis();
        System.out.println("线程1用时:" + (e - s));
        MyThread t1 = new MyThread();
        t1.start();
        MyThread2 t2 = new MyThread2();
        t2.start();
    }
}
