package Day03;

import java.util.HashSet;

public class D3t6 {
    public static void main(String[] args) {
        HashSet<Human> h1 = new HashSet<>();
        h1.add(new Human("张三",18));
        h1.add(new Human("张三",18));
        h1.add(new Human("李四",38));
        h1.add(new Human("王五",28));
        System.out.println(h1);

    }
}
