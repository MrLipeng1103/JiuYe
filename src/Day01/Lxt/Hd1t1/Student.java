package Day01.Lxt.Hd1t1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private String gender;
    private int age;
    private double score;
    private Date date;
    private String className;

    public Student() {
    }

    public Student(String name, String gender, int age, double score, Date date, String className) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.score = score;
        this.date = date;
        this.className = className;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年-MM月-dd日");

        return
                "姓名:" + name  +
                "性别:" + gender  +
                "年龄:" + age +
                "考试成绩:" + score +
                "出生日期:" +sdf.format(date)  +
                "班级:" + className +"\n";
    }
}
