package Day01.Lxt.Hd1t1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Hd1t1 {
    public static void main(String[] args) throws ParseException {
        ArrayList<Student> stlist = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String str = sc.next();
            if (str.equals("exit") || str.equals("quit")) {
                break;
            } else {
                String[] s = str.split(",");
                int age = Integer.parseInt(s[2]);
                double score = Double.parseDouble(s[3]);
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                Date bir = sdf.parse(s[4]);
                Student st1 = new Student(s[0], s[1], age, score, bir, s[5]);
                stlist.add(st1);
            }
        }

        for (int i = 0; i < stlist.size(); i++) {
           char[] cha = stlist.get(i).getName().toCharArray();
            if (stlist.get(i).getScore() >= 80 &&cha[0]=='张' && stlist.get(i).getClassName().equals("JavaEE67期"))
                System.out.println(stlist.get(i));
        }
    }
}


