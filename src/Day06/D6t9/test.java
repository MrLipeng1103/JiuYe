package Day06.D6t9;

public class test {
    public static void main(String[] args) {
        Tunnel tunnel = new Tunnel();
        for (int i = 1; i <= 10; i++) {
            Thread t1 = new Thread(tunnel, "玩家" + i);
            t1.start();
        }
    }
}
