package Day03;

import java.util.LinkedList;

public class D3t5 {
    public static void main(String[] args) {
        //(1）基本方法：add, set, get, remove, clear, size等方法；
        //1.add
        LinkedList<String> link = new LinkedList<>();
        link.add("aaa");
        link.add("bbb");
        link.add("ccc");
        link.add("ddd");
        System.out.println(link);
        System.out.println("---------------");
        //2.set
        String str = link.set(0, "aaaa");
        System.out.println(str);
        System.out.println(link);
        System.out.println("-----------------");
        //3.get
        String str1 = link.get(0);
        System.out.println(str1);
        System.out.println("-------------");
        //4.remove
        String str2 = link.remove(0);
        System.out.println(str2);
        System.out.println(link);
        System.out.println("--------------");
        //5.clear
        link.clear();
        System.out.println(link);
        System.out.println("----------");
        int num = link.size();
        System.out.println(num);
        //6.addFirst
        link.addFirst("aaa");
        System.out.println(link);
        link.push("bbb");
        String str4=link.pop();//pop是从列表中弹出一个元素
        System.out.println(str4);
        System.out.println(link);

    }
}
