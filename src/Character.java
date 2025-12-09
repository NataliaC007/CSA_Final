public class Character
{
    private String name;
    private int level;
    private int hp;
    private CharClass characterClass;
    private Weapon weaponInUse;
    private int charisma;
    private int wisdom;
    private int intelligence;
    private int constitution;
    private int dexterity;
    private int strength;

    public Character(String n, int l, int h, CharClass cc, Weapon w)
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

    public String toString()
    {
        return name + " is a level " + level + " " + characterClass.getName() + " with " + hp + "hp and is currently wielding a " + weaponInUse.getName();
    }
}
