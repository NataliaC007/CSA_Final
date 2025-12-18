/**
 * Represents a weapon that can be used by a PlayerCharacter to attack a Monster.
 *
 * A weapon has a name, damage type, damage dice configuration, and an attack
 * modifier. When used to attack, the weapon performs a d20 roll against the
 * target monster's armor class (AC). If the attack roll is successful, damage
 * is rolled based on the weapon's die type.
 *
 * Supported die types include {@code D4}, {@code D6}, {@code D8}, {@code D10},
 * and {@code D12}. If an unsupported die type is provided, {@code D4} damage
 * is used by default.
 */
public class Weapon
{
    /**
     * The name of the weapon.
     */
    private String name;

    /**
     * The type of damage dealt by the weapon (e.g., slashing, piercing, fire).
     */
    private String damageType;

    /**
     * The number of damage dice rolled when the weapon hits.
     */
    private int numDice;

    /**
     * The type of die used to calculate damage (e.g., "D4", "D6", "D8").
     */
    private String dieType;

    /**
     * A modifier added to the attack roll.
     */
    private int modifier;

    /**
     * Constructs a weapon with fully specified attributes.
     *
     * @param n    the name of the weapon
     * @param dt   the damage type of the weapon
     * @param nd   the number of damage dice rolled
     * @param dieT the type of die used for damage
     * @param mod  the attack roll modifier
     */
    public Weapon(String n, String dt, int nd, String dieT, int mod)
    {
        name = n;
        damageType = dt;
        numDice = nd;
        dieType = dieT;
        modifier = mod;
    }

    /**
     * Constructs a default weapon.
     * The weapon has no name or damage type, rolls one D4 for damage,
     * and has no attack modifier.
     */
    public Weapon()
    {
        name = null;
        damageType = null;
        numDice = 1;
        dieType = "D4";
        modifier = 0;
    }

    /**
     * Constructs a weapon with the specified name and default combat values.
     * The weapon rolls one D4 for damage and has no attack modifier.
     * @param n the name of the weapon
     */
    public Weapon(String n)
    {
        name = n;
        damageType = null;
        numDice = 1;
        dieType = "D4";
        modifier = 0;
    }

    /**
     * Returns the name of the weapon.
     *
     * @return the weapon name
     */
    public String getName()
    {
        return name;
    }

    /**
     * Returns the type of damage dealt by the weapon.
     *
     * @return the damage type
     */
    public String getDamageType()
    {
        return damageType;
    }

    /**
     * Returns the number of damage dice rolled.
     *
     * @return the number of dice
     */
    public int getNumDice()
    {
        return numDice;
    }

    /**
     * Returns the type of die used for damage calculation.
     *
     * @return the die type
     */
    public String getDieType()
    {
        return dieType;
    }

    /**
     * Returns the attack modifier applied to attack rolls.
     *
     * @return the attack modifier
     */
    public int getModifier()
    {
        return modifier;
    }

    /**
     * Sets the name of the weapon.
     *
     * @param n the new weapon name
     */
    public void setName(String n)
    {
        name = n;
    }

    /**
     * Sets the damage type of the weapon.
     *
     * @param dt the new damage type
     */
    public void setDamageType(String dt)
    {
        damageType = dt;
    }

    /**
     * Sets the number of damage dice rolled on a successful hit.
     *
     * @param nd the number of dice
     */
    public void setNumDice(int nd)
    {
        numDice = nd;
    }

    /**
     * Sets the attack roll modifier.
     *
     * @param mod the new modifier value
     */
    public void setModifier(int mod)
    {
        modifier = mod;
    }

    /**
     * Sets the type of die used for damage calculation.
     *
     * @param dt the die type (e.g., "D6", "D8")
     */
    public void setDieType(String dt)
    {
        dieType = dt;
    }

    /**
     * Performs an attack against a specified Monster.
     * A d20 is rolled and the weapon's modifier is added. If the result is
     * greater than or equal to the monster's armor class (AC), the attack hits
     * and damage is rolled based on the weapon's die type. The monster is then
     * dealt the resulting damage.
     * @param m the monster being attacked
     * @return the amount of damage dealt (0 if the attack misses)
     */
    public int attack(Monster m)
    {
        int ac = m.getAC();
        int roll = DieRoller.rollD20() + modifier;
        int dmg = 0;

        if (roll >= ac)
        {
            if (dieType.equals("D12"))
            {
                dmg = DieRoller.rollD12();
            }
            else if (dieType.equals("D10"))
            {
                dmg = DieRoller.rollD10();
            }
            else if (dieType.equals("D8"))
            {
                dmg = DieRoller.rollD8();
            }
            else if (dieType.equals("D6"))
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

    /**
     * Returns a string representation of the weapon, including its damage
     * characteristics.
     *
     * @return a formatted description of the weapon
     */
    @Override
    public String toString()
    {
        return name + " does " + numDice + " " + dieType + " " + damageType + " damage.";
    }
}
