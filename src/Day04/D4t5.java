package Day04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class D4t5 {
    public static void main(String[] args) {
        HashMap<Car, Integer> map = new HashMap<Car, Integer>();
       map.put(new Car("别克"),20);
       map.put(new Car("别克"),20);
       map.put(new Car("迈凯伦"),2000);
       map.put(new Car("奔驰"),200);
       //keyset遍历
        Set<Car> set = map.keySet();
        for (Car car : set) {
            System.out.println(car+"-"+map.get(car));
        }
        Iterator<Car> car = set.iterator();
        while (car.hasNext()){
            Car c = car.next();
            System.out.println(c+"~~~"+map.get(c));
        }
//entryset遍历
        Set<Map.Entry<Car, Integer>> kMap = map.entrySet();
        for (Map.Entry<Car, Integer> set2 : kMap) {
            System.out.println(set2.getKey()+"...."+set2.getValue());
        }
      /*  Iterator<Map.Entry<Car, Integer>> it = kMap.iterator();
        while (it.hasNext()){
            System.out.println(it.next().getKey()+"..........."+it.next().getValue());
        }
*/
    }
}
