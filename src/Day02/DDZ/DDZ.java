package Day02.DDZ;

import java.util.ArrayList;
import java.util.Collections;

public class DDZ {
    public static void main(String[] args) {
        ArrayList<String> pokers = new ArrayList<>();
        ArrayList<String> colors = new ArrayList<>();
        ArrayList<String> nums = new ArrayList<>();
        colors.add("红桃");
        colors.add("黑桃");
        colors.add("梅花");
        colors.add("方块");
        for (int i = 2; i <= 10; i++) {
            nums.add(i + " ");//转字符方法
        }
        nums.add("A");
        nums.add("J");
        nums.add("Q");
        nums.add("K");
        for (String num : nums) {
            for (String color : colors) {
                pokers.add(color + num);
            }
        }
        pokers.add("大王");
        pokers.add("小王");
        Collections.shuffle(pokers);
        ArrayList<String> p1 = new ArrayList<>();
        ArrayList<String> p2 = new ArrayList<>();
        ArrayList<String> p3 = new ArrayList<>();
        ArrayList<String> liu = new ArrayList<>();
        for (int i = 0; i < pokers.size(); i++) {
            if (i > 50) {
                liu.add(pokers.get(i));
            } else if (i % 3 == 0) {
                p1.add(pokers.get(i));
            } else if (i % 3 == 1) {
                p2.add(pokers.get(i));
            } else {
                p3.add(pokers.get(i));
            }
        }
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(liu);
        System.out.println(pokers.size());
    }
}

