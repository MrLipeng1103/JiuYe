package Day01.Lxt;


public class D1t10 {
    public static void main(String[] args) {
        String[] str = {"010", "3223", "666", "7890987", "123123"};
        testsb( str);
    }
    public static void testsb(String[] str) {
        int count=0;
        for (String string : str) {
            StringBuilder sb = new StringBuilder(string);
          if ( sb.reverse().toString().equals(string)){
              count++;
              System.out.println("字符串:"+string+"是对称的");
          }
        }
        System.out.println("对称的字符串个数是:"+count);
    }
}
