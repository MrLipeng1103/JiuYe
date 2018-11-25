package Day05.D5t10;

public class Lifeout extends RuntimeException {
    public Lifeout() {
        System.out.println("你死了");
    }

    public Lifeout(String message) {
        super(message);
    }
}
