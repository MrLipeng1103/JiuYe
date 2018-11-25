package Day05.D5t8;
/*每一个学生(Student)都有学号,姓名和分数,分数永远不能为负数
        如果老师给学生赋值一个负数,抛出一个自定异常*/

import java.util.Scanner;

public class D5t8Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double dou = sc.nextDouble();
        if(dou<0){
            try {
                throw new ScoreOut("分数输入错误....");
            } catch (ScoreOut scoreOut) {
                scoreOut.printStackTrace();
            }

        }
        Student stu1 = new Student("001","张三",dou);
    }
}
