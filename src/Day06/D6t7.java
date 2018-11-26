package Day06;

public class D6t7 {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("播放背景音乐");
                }
            }
        }.start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int j = 0; j < 100; j++) {
                    System.out.println("显示画面");
                }
            }
        }) .start();
    }
}
