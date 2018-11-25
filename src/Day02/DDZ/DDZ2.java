package Day02.DDZ;

import java.util.ArrayList;
import java.util.Collections;

public class DDZ2 {
    public static void main(String[] args) {
        ArrayList<String> pokers = new ArrayList<>();
        ArrayList<String> colors = new ArrayList<>();
        ArrayList<String> nums = new ArrayList<>();
       for(String str :"红桃,黑桃,梅花,方块".split(",")){
           colors.add(str);
       }
        /*colors.add("红桃");
        colors.add("黑桃");
        colors.add("梅花");
        colors.add("方块");*/
        for (int i = 2; i <= 10; i++) {
            nums.add(i + " ");//转字符方法
        }
        for(String st:"A,J,Q,K".split(",")){
            nums.add(st);
        }
       /* nums.add("A");
        nums.add("J");
        nums.add("Q");
        nums.add("K");*/
        for (String num : nums) {
            for (String color : colors) {
                pokers.add(color + num);
            }
        }
        pokers.add("大王");
        pokers.add("小王");
        Collections.shuffle(pokers);
        System.out.println(pokers);
        System.out.println(pokers.size());

    }
}

