public class DieRoller
{
    public static int totalRolls = 0;
    public static int rollD20()
    {
        int roll = (int)(Math.random() * 20 + 1);
        totalRolls++;
        return roll;
    }

    public static int rollD12()
    {
        int roll = (int)(Math.random() * 12 + 1);
        totalRolls++;
        return roll;
    }

    public static int rollD10()
    {
        int roll = (int)(Math.random() * 10 + 1);
        totalRolls++;
        return roll;
    }

    public static int rollD100()
    {
        int roll = (int)(Math.random() * 100 + 1);
        totalRolls++;
        return roll;
    }

    public static int rollD8()
    {
        int roll = (int)(Math.random() * 8 + 1);
        totalRolls++;
        return roll;
    }

    public static int rollD6()
    {
        int roll = (int)(Math.random() * 6 + 1);
        totalRolls++;
        return roll;
    }

    public static int rollD4()
    {
        int roll = (int)(Math.random() * 4 + 1);
        totalRolls++;
        return roll;
    }

    public static int rollD2()
    {
        int roll = (int)(Math.random() * 2 + 1);
        totalRolls++;
        return roll;
    }

    public static int getTotalRolls()
    {
        return totalRolls;
    }
}
