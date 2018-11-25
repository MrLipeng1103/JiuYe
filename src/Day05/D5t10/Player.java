package Day05.D5t10;

public class Player {
    private String name;
    private int lifenum;

    public Player() {
    }

    public Player(String name, int lifenum) {
        this.name = name;
        this.lifenum = lifenum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifenum() {
        return lifenum;
    }

    public void setLifenum(int lifenum) {
        this.lifenum = lifenum;
    }

}
