public class CharClass
{
    private String name;
    private Weapon starterWeapon = new Weapon();
    private int hp;

    public CharClass(String n)
    {
        name = n;
    }

    public Weapon getStarterWeapon()
    {
        if (name.equals("Paladin"))
        {
            starterWeapon.setName("Longsword");
            starterWeapon.setNumDice(1);
            starterWeapon.setDamageType("Slashing");
            starterWeapon.setModifier(2);
            starterWeapon.setDieType("D8");
        }
        else if (name.equals("Wizard"))
        {
            starterWeapon.setName("Longsword");
            starterWeapon.setNumDice(1);
            starterWeapon.setDamageType("Slashing");
            starterWeapon.setModifier(2);
            starterWeapon.setDieType("D8");
        }
        else if (name.equals("Bard"))
        {
            starterWeapon.setName("Longsword");
            starterWeapon.setNumDice(1);
            starterWeapon.setDamageType("Slashing");
            starterWeapon.setModifier(2);
            starterWeapon.setDieType("D8");
        }
        else if (name.equals("Cleric"))
        {
            starterWeapon.setName("Longsword");
            starterWeapon.setNumDice(1);
            starterWeapon.setDamageType("Slashing");
            starterWeapon.setModifier(2);
            starterWeapon.setDieType("D8");
        }
        else if (name.equals("Fighter"))
        {
            starterWeapon.setName("Longsword");
            starterWeapon.setNumDice(1);
            starterWeapon.setDamageType("Slashing");
            starterWeapon.setModifier(2);
            starterWeapon.setDieType("D8");
        }
        else
        {
            starterWeapon.setName("Longsword");
            starterWeapon.setNumDice(1);
            starterWeapon.setDamageType("Slashing");
            starterWeapon.setModifier(2);
            starterWeapon.setDieType("D8");
        }
        return starterWeapon;
    }

    public String getName()
    {
        return name;
    }
    public int getStarterHP()
    {
        if (name.equals("Paladin"))
        {
            hp = 10;
        }
        else if (name.equals("Wizard"))
        {
            hp = 6;
        }
        else if (name.equals("Bard"))
        {
            hp = 8;
        }
        else if (name.equals("Cleric"))
        {
            hp = 8;
        }
        else if (name.equals("Fighter"))
        {
            hp = 10;
        }
        else
        {
            hp = 8;
        }
        return hp;
    }
}
