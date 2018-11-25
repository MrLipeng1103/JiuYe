package Day04;

import java.util.*;

public class D4t8 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个字符串:");
        list.add(sc.next());
        list.add(sc.next());
        countnum(list);
    }

    public static void countnum(List<String> list) {
        HashMap<Character, Integer> map = new HashMap<>();
        Set<Character> set = map.keySet();
        for (int i = 0; i < list.size(); i++) {
            char[] ch = list.get(i).toCharArray();
            for (int j = 0; j < ch.length; j++) {
                if (!set.contains(ch[j])) {
                    map.put(ch[j], 1);
                } else {
                    Integer value = map.get(ch[j]) + 1;
                    map.put(ch[j], value);
                }
            }
        }
        System.out.println(map);
    }
}
