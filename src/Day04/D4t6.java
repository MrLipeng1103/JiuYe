package Day04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class D4t6 {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer, String>();
        map.put(1, "张三丰");
        map.put(2, "周芷若");
        map.put(3, "汪峰");
        map.put(4, "灭绝师太");
        //遍历集合
        Set<Integer> set = map.keySet();
        for (Integer ke : set) {
            String value = map.get(ke);
            System.out.println(ke+"----"+value);
        }
        //向该map集合中插入一个编码为5姓名为李晓红的信息
        map.put(5,"李晓红");
        //移除该map中的编号为1的信息
        map.remove(1);
        //将map集合中编号为2的姓名信息修改为"周林"
        map.replace(2,"周林");
        System.out.println(map);
    }
}
