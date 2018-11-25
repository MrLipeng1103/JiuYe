package Day01.Lxt;

public class D1t8 {
    public static void main(String[] args) {
        char[] cha = {'i', 't', 'c', 'a', 's', 'a'};
        System.arraycopy(cha, 1, cha, 5, 1);
        System.out.println(cha);
    }
}
