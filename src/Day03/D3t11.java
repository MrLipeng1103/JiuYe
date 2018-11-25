package Day03;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class D3t11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符:");
        String str = sc.next();
        rlink(str);
    }

    public static void rlink(String str) {
        LinkedHashSet<Object> link = new LinkedHashSet<>();
        char[] cha = str.toCharArray();
        for (char c : cha) {
            link.add(c);
        }
        System.out.println(link);
      /*  LinkedHashSet<Object> listHs = new LinkedHashSet<>();
        char[] cha = str.toCharArray();
        for (int i = 0; i < cha.length; i++) {
            if (!listHs.contains(cha[i])) {
                listHs.add(cha[i]);
            }
        }
        System.out.println(listHs);*/
    }
}
