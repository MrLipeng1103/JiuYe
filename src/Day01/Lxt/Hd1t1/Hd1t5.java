package Day01.Lxt.Hd1t1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

//5.计算指定年份2月有多少天
public class Hd1t5 {
    public static void main(String[] args) throws ParseException {
        //键盘录入一个年份
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份:");
        String year = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        Date year1 = sdf.parse(year);
        Calendar cal = Calendar.getInstance();
        cal.setTime(year1);
        cal.set(Calendar.MONTH, 1);
        /*验证是否为输入年份的2月
       SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM");
       System.out.println(sdf1.format(cal.getTime()));*/
        int day = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println(day);
    }
}
