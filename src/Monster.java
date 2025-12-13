import java.lang.Character;

public class Monster {
    private String name;
    private int hp;
    private int ac;
    private int exp;
    private int dieType;

    public Monster(String n, int health, int armor, int xp, int dt)
    {
        name = n;
        hp = health;
        ac = armor;
        exp = xp;
        dieType = dt;
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

    public int getXP()
    {
        return exp;
    }

    public int getDieType()
    {
        return dieType;
    }

    public void getHit(int dmg)
    {
        hp-=dmg;
    }

    public int attack(PlayerCharacter p)
    {
        int damage = 0;
        if(DieRoller.rollD20() >= p.getAC())
        {
            if(dieType == 4)
            {
                damage = DieRoller.rollD4();
            }
            else if (dieType == 6)
            {
                damage = DieRoller.rollD6();
            }
            else if (dieType == 8)
            {
                damage = DieRoller.rollD8();
            }
            else if (dieType == 10)
            {
                damage = DieRoller.rollD10();
            }
            else
            {
                damage = DieRoller.rollD12();
            }
            p.getHit(damage);
        }
        return damage;
    }
}
