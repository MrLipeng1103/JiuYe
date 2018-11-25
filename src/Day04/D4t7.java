package Day04;


import java.util.HashMap;

public class D4t7 {
    public static void main(String[] args) {
        HashMap<String[], String[]> map = new HashMap<>();
        String[] list = {"黑龙江省", "浙江省", "江西省", "广东省", "福建省"};
        String[] list1 = {"哈尔滨", "杭州", "南昌", "广州", "福州"};
        for (int i = 0; i < list.length; i++) {
            map.put(list,list1);
         }
        System.out.println(map);
    }
}
