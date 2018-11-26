package Day06;

public class D6t8 {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
        new Thread(){
            @Override
            public void run() {
                for (int j = 0; j < 20; j++) {
                    System.out.println(j);
                }
            }
        }.start();
    }
}
