package Day03;

import java.util.Iterator;
import java.util.LinkedList;

public class D3t10 {
    public static void main(String[] args) {
        LinkedList<Object> link = new LinkedList<>();
        String[] strs = {"12345","67891","12347809933","98765432102","67891","12347809933"};
        for (String str : strs) {
            if(!link.contains(str)){
                link.add(str);
            }
        }
        for (Object o : link) {
            System.out.println(o);
        }
        System.out.println("-------------");
        Iterator<Object> it = link.iterator();
        while(it.hasNext()){
            Object ne = it.next();
            System.out.println(ne);

        }
    }
}
