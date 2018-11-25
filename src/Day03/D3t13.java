package Day03;

import java.util.ArrayList;

public class D3t13 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("wangwu", 20, 99.0F));
        list.add(new Student("liusan", 20, 90.0F));
        list.add(new Student("lisi", 22, 90.0F));
        list.add(new Student("sunliu", 22, 100.0F));
       // compareScore(list);
        for (Student student : list) {
            System.out.println(student);
        }
    }

   /* public static void compareScore(ArrayList<Student> list) {
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (!(o1.getScore() == o2.getScore())) {
                    return ((int) (o1.getScore() - o2.getScore()));
                } else if (o1.getScore() == o2.getScore()) {
                    return ((int) (o1.getAge() - o2.getAge()));
                }
            }
        });
    }*/
}

