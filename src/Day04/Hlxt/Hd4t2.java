package Day04.Hlxt;

import java.util.ArrayList;
import java.util.HashMap;

/*分拣的思想
        1.要求:定义一个Student类
        属性:
        String name  姓名
        String no 	 班号
        double score 成绩
        2.现在将若干Student对象放入List中,请统计出每个班级的总分和平均分

        3.功能实现要求
        (1)随便自己想怎么写,就怎么写(只要实现功能就可以)
        (2)按照以下指定思路实现:
        --不推荐使用 Map<String,List<Student>> 操作不方便(按照这种思路如何实现)
        String : 班号
        List<Student> : 该班级中的学生


        --推荐使用 Map<String,ClassRoom>
				ClassRoom类参照以下代码:
public class ClassRoom {
    private String no;//班号
    private List<Student> stus;//班级有多个学生
    private double total;//班级总分
    //...*/
public class Hd4t2 {
    public static void main(String[] args) {
        ArrayList<Student> stulist = new ArrayList<>();
        stulist.add(new Student("张三","JavaEE339",88.4));
        stulist.add(new Student("李四","JavaEE339",90.4));
        stulist.add(new Student("王五","JavaEE339",82.4));
        stulist.add(new Student("小白","Python339",88.4));
        stulist.add(new Student("小红","Python339",82.4));
        stulist.add(new Student("小蓝","Python339",90.4));
        pick(stulist);
    }
    public static void pick(ArrayList<Student> list){
        HashMap map = new HashMap<String,ClassRoom>();
        for (Student st : list) {
           map.put(st.getNo(),new ClassRoom());
        }

    }
}
