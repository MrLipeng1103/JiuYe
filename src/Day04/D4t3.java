package Day04;

import java.util.HashMap;

public class D4t3 {
    public static void main(String[] args) {
        HashMap<Object, Object> HsMap = new HashMap<>();
        HsMap.put("张三",28);
        HsMap.put("李四",18);
        HsMap.put("王五",38);
        HsMap.put("赵六",48);
        System.out.println(HsMap);
        HsMap.remove("王五");
        System.out.println(HsMap);
        Object ZL = HsMap.get("赵六");
        System.out.println(ZL);
    }
}
