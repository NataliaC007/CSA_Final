public class PlayerCharacter
{
    private String name;
    private int level;
    private int hp;
    private CharClass characterClass;
    private Weapon weaponInUse;
    private int ac = 11;
    private int xpNeeded = 200;
    private int charisma;
    private int wisdom;
    private int intelligence;
    private int constitution;
    private int dexterity;
    private int strength;

    public PlayerCharacter(String n, int l, int h, CharClass cc, Weapon w)
    {
        name = n;
        level = l;
        hp = h;
        characterClass = cc;
        weaponInUse = w;
    }

    public String getName()
    {
        return name;
    }

    public int getLevel()
    {
        return level;
    }

    public int getHP()
    {
        return hp;
    }

    public CharClass getCharacterClass()
    {
        return characterClass;
    }

    public Weapon getCurrentWeapon()
    {
        return weaponInUse;
    }

    public int getAC()
    {
        return ac;
    }

    public void equipWeapon(Weapon w)
    {
        weaponInUse = w;
    }

    public void getHit(int dmg)
    {
        hp-=dmg;
    }

    public boolean levelUp(int xp)
    {
        if(xp >= xpNeeded)
        {
            xpNeeded += 100;
            level++;
            hp+=15;
            return true;
        }
        return false;
    }

   // public void rest
    public String toString()
    {
        return name + " is a level " + level + " " + characterClass.getName() + " with " + hp + "hp and is currently wielding a " + weaponInUse.getName();
    }
}
