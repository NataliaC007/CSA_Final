public class Monster {
    private String name;
    private int hp;
    private int ac;

    public Monster(String n, int health, int armor) {
        name = n;
        hp = health;
        ac = armor;
    }

    public String getName()
    {
        return name;
    }

    public int getAC()
    {
        return ac;
    }

    public int getHP()
    {
        return hp;
    }
}
