package Day01.Lxt;

import java.util.Calendar;
import java.util.Scanner;

public class D1t7 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年,月,日:");
        int year=sc.nextInt();
        int month=sc.nextInt();
        int day=sc.nextInt();

        cal.set(year, month-1, day);
        int y = cal.get(Calendar.YEAR);
        int m = cal.get(Calendar.MONTH) + 1;
        int d = cal.get(Calendar.DAY_OF_MONTH);
        char c = getweek(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(y + "年" + m + "月" + d + "日是星期" + c);
    }

    public static char getweek(int a) {
        char[] cha = { '日', '一', '二', '三', '四', '五', '六'};
        return cha[a-1];
    }
}

