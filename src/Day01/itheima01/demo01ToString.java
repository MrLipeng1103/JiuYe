package Day01.itheima01;

public class demo01ToString {
    public static void main(String[] args) {
        Person p1 = new Person("张三",18);
        Person p2 = new Person("张三",18);
        Person p3 = new Person("李四",28);
        System.out.println(p1.toString());
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
    }
}
