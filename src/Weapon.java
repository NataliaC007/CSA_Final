public class Weapon
{
    private String name;
    private String damageType;
    private int numDice;
    private String dieType;
    private int modifier;

    public Weapon(String n, String dt, int nd, String dieT, int mod)
    {
        name = n;
        damageType = dt;
        numDice = nd;
        dieType = dieT;
        modifier = mod;
    }

    public Weapon()
    {
        name = null;
        damageType = null;
        numDice = 1;
        dieType = "D4";
        modifier = 0;
    }


    public String getName()
    {
        return name;
    }

    public String getDamageType()
    {
        return damageType;
    }

    public int getNumDice()
    {
        return numDice;
    }

    public String getDieType()
    {
        return dieType;
    }

    public int getModifier()
    {
        return modifier;
    }

    public void setName(String n)
    {
        name = n;
    }

    public void setDamageType(String dt)
    {
        damageType = dt;
    }

    public void setNumDice(int nd)
    {
        numDice = nd;
    }

    public void setModifier(int mod)
    {
        modifier = mod;
    }

    public void setDieType(String dt)
    {
        dieType = dt;
    }

    public int attack(Monster m)
    {
        int ac = m.getAC();
        int roll = DieRoller.rollD20() + modifier;
        int dmg = 0;
        if(roll >= ac)
        {
            if(dieType.equals("D12"))
            {
                dmg = DieRoller.rollD12();
            }
            else if(dieType.equals("D10"))
            {
                dmg = DieRoller.rollD10();
            }
            else if(dieType.equals("D8"))
            {
                dmg = DieRoller.rollD8();
            }
            else if(dieType.equals("D6"))
            {
                dmg = DieRoller.rollD6();
            }
            else
            {
                dmg = DieRoller.rollD4();
            }
        }
        m.getHit(dmg);
        return dmg;
    }
}
