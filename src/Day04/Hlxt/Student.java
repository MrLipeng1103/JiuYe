package Day04.Hlxt;

import java.util.Objects;

public class Student {
    private String name;
    private String no;
    private double score;

    public Student() {
    }

    public Student(String name, String no, double score) {
        this.name = name;
        this.no = no;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.score, score) == 0 &&
                Objects.equals(name, student.name) &&
                Objects.equals(no, student.no);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, no, score);
    }

    @Override
    public String toString() {
        return "学生(" +
                "姓名:" + name  +
                ", 班号" + no  +
                ", 分数" + score+")";
    }
}
