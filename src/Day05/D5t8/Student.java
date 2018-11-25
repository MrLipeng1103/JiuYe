package Day05.D5t8;

import java.util.Objects;

public class Student {
    private String num;
    private String name;
    private double Score;

    public Student() {
    }

    public Student(String num, String name, double score) {
        this.num = num;
        this.name = name;
        Score = score;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.Score, Score) == 0 &&
                Objects.equals(num, student.num) &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(num, name, Score);
    }

    public double getScore() {
        return Score;

    }

    public void setScore(double score) {
        Score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "num='" + num + '\'' +
                ", name='" + name + '\'' +
                ", Score=" + Score +
                '}';
    }
}
