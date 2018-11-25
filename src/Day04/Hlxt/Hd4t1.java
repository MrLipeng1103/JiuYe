package Day04.Hlxt;
/*ArrayList<Integer> list 里面存放的是学生成绩{80，90，100，60，50，30，55，98，36}，
        对ArrayList集合中的成绩进行统计，将统计后的结果放入
        map中，"及格的学员数量" = 5   "不及格的学员数量"=4
        最后打印map集合*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Hd4t1 {
    public static void main(String[] args) {
        ArrayList<Integer> scorelist = new ArrayList<>();
        scorelist.add(80);
        scorelist.add(90);
        scorelist.add(100);
        scorelist.add(60);
        scorelist.add(50);
        scorelist.add(30);
        scorelist.add(55);
        scorelist.add(98);
        scorelist.add(36);
        count(scorelist);
    }
    public static void count(ArrayList<Integer> scorelist){
        HashMap<String, Integer> map = new HashMap<>();
        Set<String> set = map.keySet();
        map.put("及格的学员数量:",0);
        map.put("不及格的学员数量:",0);
        for (int i = 0; i < scorelist.size(); i++) {
            if(scorelist.get(i)>=60){
                Integer value = map.get("及格的学员数量:")+1;
                map.put("及格的学员数量:",value);
            }else{
                Integer value2 = map.get("不及格的学员数量:")+1;
                map.put("不及格的学员数量:",value2);
            }
        }
        System.out.println(map);
    }
}
