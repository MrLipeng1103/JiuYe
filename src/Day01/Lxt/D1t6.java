package Day01.Lxt;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class D1t6 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
       Date d1=sdf1.parse("2018-03-04");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        System.out.println(sdf2.format(d1));
    }
}
