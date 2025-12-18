public class PlayerCharacter
{
    private String name;
    private int level;
    private int hp;
    private CharClass characterClass;
    private Weapon weaponInUse;
    private int ac = 11;
    private int xpNeeded = 200;
    private int currentHP;
//    private int charisma;
//    private int wisdom;
//    private int intelligence;
//    private int constitution;
//    private int dexterity;
//    private int strength;

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
        return currentHP;
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
        currentHP-=dmg;
    }

    public boolean levelUp(int xp)
    {
        if(xp >= xpNeeded)
        {
            xpNeeded += 100;
            level++;
            hp+=15;
            currentHP = hp;
            return true;
        }
        return false;
    }

   // public void rest
    public String toString()
    {
        return name + " is a level " + level + " " + characterClass.getName() + " with " + currentHP + "hp and is currently wielding a " + weaponInUse.getName();
    }
}
