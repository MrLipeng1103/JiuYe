package Day06;

public class D6t6 {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for (int j = 0; j < 100; j++) {
                    System.out.println("子线程执行"+j);
                }
            }
        }.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("主线程执行"+i);
        }
    }
}
