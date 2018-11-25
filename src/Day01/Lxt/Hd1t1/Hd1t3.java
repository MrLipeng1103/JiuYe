package Day01.Lxt.Hd1t1;
/*3.分析以下需求，并用代码实现：
	(1)通过键盘录入日期字符串，格式(2015-10-20)
	(2)定义方法获取该日期的前一天
	(3)定义方法获取该日期的上个月份
	(4)定义方法获取该日期的所在月份的第一天
	(5)定义方法获取该日期的所在月份的最后一天
	*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Hd1t3 {
    public static void main(String[] args) throws ParseException {
        //(1)通过键盘录入日期字符串，格式(2015-10-20)
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个日期:");
        String str = sc.next();
        getdate(str);
        getlastmonth(str);
        getmonthfirst(str);
        getmonthlast(str);
    }

    //(2)定义方法获取该日期的前一天
    public static void getdate(String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = sdf.parse(str);
        Calendar cal = Calendar.getInstance();
        cal.setTime(d1);
        cal.add(Calendar.DAY_OF_MONTH, -1);
        Date d2 = cal.getTime();
        System.out.println(sdf.format(d2));
    }

    //(3)定义方法获取该日期的上个月份
    public static void getlastmonth(String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = sdf.parse(str);
        Calendar cal = Calendar.getInstance();
        cal.setTime(d1);
        cal.add(Calendar.MONTH, -1);
        Date d3 = cal.getTime();
        System.out.println(sdf.format(d3));
    }

    //(4)定义方法获取该日期的所在月份的第一天
    public static void getmonthfirst(String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = sdf.parse(str);
        Calendar cal = Calendar.getInstance();
        cal.setTime(d1);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        Date d4 = cal.getTime();
        System.out.println(sdf.format(d4));
    }

    //(5)定义方法获取该日期的所在月份的最后一天
    public static void getmonthlast(String str) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = sdf.parse(str);
        Calendar cal = Calendar.getInstance();
        cal.setTime(d1);
        cal.set(Calendar.DAY_OF_MONTH,1);
        cal.add(Calendar.MONTH, +1);
        cal.add(Calendar.DAY_OF_MONTH, -1);
        Date d5 = cal.getTime();
        System.out.println(sdf.format(d5));
    }
}
