import java.util.Scanner;
public class Fight
{
    public static void battle(PlayerCharacter p, Monster m)
    {
        Scanner input = new Scanner(System.in);
        while(m.getHP() > 0)
        {
            int damage1 = p.getCurrentWeapon().attack(m);
            if(damage1 > 0)
            {
                System.out.println(m.getName() + " has been hit for " + damage1 + " damage! Keep it up!");
                input.nextLine();
            }
            else
            {
                System.out.println("As you go in for the swing, you miss. It's okay get 'em next time!");
                input.nextLine();
            }
            int damage2 = m.attack(p);
            if(damage2 > 0)
            {
                System.out.println("You have been hit for " + damage2 + " damage, get back up at it!");
                input.nextLine();
            }
            else
            {
                System.out.println("The " + m.getName() + " missed! Get in there!");
                input.nextLine();
            }
            if(p.getHP() <= 0)
            {
                System.out.println("You tried but it was just too much! You did good on your adventure!");
                System.out.println(p + "\n" + p.getName() + " rolled a total of " + DieRoller.getTotalRolls() + " times!");
                System.exit(0);
            }
        }
    }
}
