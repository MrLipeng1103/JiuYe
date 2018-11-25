package Day04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class D4t4 {
    public static void main(String[] args) {
        HashMap<String, Integer> HsMap = new HashMap<>();
        HsMap.put("王五", 18);
        HsMap.put("张三", 28);
        HsMap.put("李四", 48);
        HsMap.put("赵六", 38);
        Set<String> key = HsMap.keySet();
        Iterator<String> ke = key.iterator();
        while (ke.hasNext()){
            String k = ke.next();
            System.out.println(k+"----"+HsMap.get(k));
        }
        /*for (String key2 : key) {
            Integer value = HsMap.get(key2);
            System.out.println(key2 + "---" + value);
        }*/
        System.out.println("-----------------------");
        Set<Map.Entry<String, Integer>> map = HsMap.entrySet();
        for (Map.Entry<String, Integer> keyvolue : map) {
            System.out.println(keyvolue.getKey()+"---"+keyvolue.getValue());
        }
    }


}

