package Day04;

public class DayTest {
    public static void main(String[] args) {
        try {
            String s = "hello";
            String sub = s.substring(0);
            System.out.println(sub);
            s = null;
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        }
       /* public static void main(String[] args) throw ParseException {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
            String s1 = "1989-12-11";
            Date date = format.parse(s1);*/
    }
}


