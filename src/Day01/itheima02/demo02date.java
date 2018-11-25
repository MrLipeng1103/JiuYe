package Day01.itheima02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class demo02date {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(new Date());
        System.out.println(new Date(0L));
        System.out.println(d1.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
        String d2 = sdf.format(d1);
        System.out.println(d2);
    }
}
