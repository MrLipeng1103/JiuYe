package Day03;

import java.util.HashSet;
import java.util.Random;

public class D3t12 {
    public static void main(String[] args) {
        HashSet<Integer> Hlist = new HashSet<>();
        HashSet<Integer> Llist = new HashSet<>();
        Random rd = new Random();
        Random rd1 = new Random();
        for (int i = 0; i < 6; i++) {
            Hlist.add(rd.nextInt(32)+1);
        }
        Llist.add(rd1.nextInt(15)+1);
        System.out.print("红球为:"+Hlist);
        System.out.println("蓝球为:"+Llist);
    }
}
