package Day04;

import java.util.*;

public class PokerPlus {
    public static void main(String[] args) {
        //定义一个map集合存储扑克牌
        HashMap<Integer, String> pokers = new HashMap<>();
        ArrayList<String> colors = new ArrayList<>();
        ArrayList<String> nums = new ArrayList<>();
        Collections.addAll(colors, "红桃", "黑桃", "梅花", "方片");
        Collections.addAll(nums, "3-4-5-6-7-8-9-10-J-Q-K-A-2".split("-"));
        int j = 1;
        for (String num : nums) {
            for (String color : colors) {
                String poker = color + num + " ";
                pokers.put(j, poker);//添加索引???
                j++;
            }
        }
        pokers.put(53, "小王");
        pokers.put(54, "大王");
        System.out.println(pokers);
        //洗牌
        Set<Integer> pai = pokers.keySet();
        List<Integer> pa = new ArrayList<>(pai);
        Collections.shuffle(pa);
        //发牌
        ArrayList<Integer> bottom = new ArrayList<>();
        ArrayList<Integer> p1 = new ArrayList<>();
        ArrayList<Integer> p2 = new ArrayList<>();
        ArrayList<Integer> p3 = new ArrayList<>();
        for (int i1= 0; i1 < pa.size(); i1++) {
            if(i1>50){
                bottom.add(pa.get(i1));
            }else if(i1%3==0){
                p1.add(pa.get(i1));
            }else if ((i1%3==1)){
                p2.add(pa.get(i1));
            }else if(i1%3==2){
                p3.add(pa.get(i1));
            }
        }
        //看牌(排序)
        Collections.sort(p1);
        for (Integer num : p1) {
            String s = pokers.get(num);
            System.out.print(s+" ");
        }
        System.out.println();
        Collections.sort(p2);
        for (Integer num : p2) {
            String s1 = pokers.get(num);
            System.out.print(s1+" ");
        }
        System.out.println();
        Collections.sort(p3);
        for (Integer num : p3) {
            String s2 = pokers.get(num);
            System.out.print(s2+" ");
        }
        System.out.println();
        Collections.sort(bottom);
        for (Integer num : bottom) {
            String s3 = pokers.get(num);
            System.out.print(s3+" ");
        }
    }
}

