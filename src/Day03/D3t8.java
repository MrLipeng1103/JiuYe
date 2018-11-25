package Day03;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class D3t8 {
    public static void main(String[] args) {
        LinkedHashSet<Object> link = new LinkedHashSet<>();
        link.add("王昭君");
        link.add("王昭君");
        link.add("西施");
        link.add("杨玉环");
        link.add("貂蝉");
        Iterator<Object> it =link.iterator();
        while(it.hasNext()){
            Object ne = it.next();
            System.out.println(ne);
        }
        System.out.println("--------------");
        for (Object lin : link) {
            System.out.println(lin);
        }

    }
}
