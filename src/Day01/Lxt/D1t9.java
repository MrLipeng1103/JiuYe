package Day01.Lxt;

public class D1t9 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String str = "s";
        for (int i = 0; i < 10000; i++) {
            str += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("总耗时:"+(end-start));
        long start1 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < 100000; j++) {
            sb.append(j);
        }
        long end1 = System.currentTimeMillis();
        System.out.println("总耗时:"+(end1-start1));
    }
}
