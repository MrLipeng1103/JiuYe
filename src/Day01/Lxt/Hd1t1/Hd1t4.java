package Day01.Lxt.Hd1t1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*4.分析以下需求，并用代码实现：
	用日期时间相关的知识，计算出一个人已经出生了多少天。

	思路：
	1.获取当前时间对应的毫秒值
	2.获取自己出生日期对应的毫秒值
	3.两个时间相减（当前时间– 出生日期*/
public class Hd1t4 {
    public static void main(String[] args) throws ParseException {
        long now = System.currentTimeMillis();
        System.out.println("请输入出生年月:");
        Scanner sc = new Scanner(System.in);
        String birth = sc.next();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthday = sdf.parse(birth);
        long birthdayTime = birthday.getTime();
        long num=now-birthdayTime;
        long day=num/1000/60/60/24;
        System.out.println("出生了"+day+"天");

    }
}
