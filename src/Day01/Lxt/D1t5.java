package Day01.Lxt;

import java.text.SimpleDateFormat;
import java.util.Date;

public class D1t5 {
    public static void main(String[] args) {
        Date d1 = new Date();
        System.out.println(d1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(d1));
    }
}
