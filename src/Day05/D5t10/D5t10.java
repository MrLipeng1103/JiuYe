package Day05.D5t10;

public class D5t10 {
    public static void main(String[] args) {
        Player p1 = new Player("水管工",100);
        int li = p1.getLifenum();
        for (int i = 0; i <= li;) {
            if(li<=0){
                throw new Lifeout();
            }else{
                System.out.println(li);
                li--;
            }
        }
    }
}
