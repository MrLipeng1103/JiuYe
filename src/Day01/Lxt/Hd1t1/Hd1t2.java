package Day01.Lxt.Hd1t1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/*
2.分析以下需求，并用代码实现：
	(1)通过键盘录入日期字符串，格式(2015-10-20)
	(2)输出该日期是星期几及这一年的第几天
	(3)如输入：2015-10-20，输出"2015年-10月-20日 是 星期二，是  2015年的第 293 天"
*/
public class Hd1t2 {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入日期:");
        String str = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date d1 = sdf.parse(str);
        Calendar cal = Calendar.getInstance();
        cal.setTime(d1);
        int y = cal.get(Calendar.YEAR);
        int m = cal.get(Calendar.MONTH);
        int d = cal.get(Calendar.DAY_OF_MONTH);
        int t=cal.get(Calendar.DAY_OF_YEAR);
        char c=getweek(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(y+"年-"+m+"月-"+d+"日"+"是星期"+c+",是"+y+"年的第"+t+"天");


    }
    public static char getweek(int a) {
        char[] cha = { '日', '一', '二', '三', '四', '五', '六'};
        return cha[a-1];
    }
}
