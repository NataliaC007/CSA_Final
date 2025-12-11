//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
//add shield type things
//spells
//attributes
//races
//exhausted feature
//make an inventory class connected to the character class and a separate class called things with everything in the inventory, it will just create new things and inventory will essentially be a giant array

//NYCOS Brand used with permission from creator Johnathan Albin
public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);

    System.out.println("WELCOME ADVENTURER! PLEASE CREATE AN ENJOINED");
    System.out.println("What shall be your name?");
    String name = input.nextLine();
    System.out.println("And what kind of warrior are you? (Paladin, Wizard, Bard, Cleric, Fighter, Rouge)");
    String cc = input.nextLine();

    CharClass playerClass = new CharClass(cc);
    Character player = new Character(name, 1, playerClass.getStarterHP(), playerClass, playerClass.getStarterWeapon());

    System.out.println(player);
    System.out.println("You have successfully become enjoined! Welcome to NYCOS " + player.getName() + "!");
    int option = 0;

    while(option != 5)
    {
        System.out.println("\nWhat would you like to do? \n1. Go on a quest \n2. Rest \n3. Go Shopping! \n4. View my stats \n5. Quit (Enter the number of your choice)");
        option = input.nextInt();
        if (option == 1)
        {
            int find = DieRoller.rollD4();
            if(find == 1)
            {
                System.out.println("A thick unatural fog has been seen in a local village. There is a faint blue lantern flickering somewhere in the heart of it \nCan you recover the lantern and dispel the fog? (Yes or No)");
                String answer = input.nextLine();
                if(answer.equals("Yes"))
                {
                    System.out.println("Great! Now, what would you like to do? \n1. Follow the light deeper into the fog \n2. Try to shout and see if anything responds \n3. Tie a rope to a tree and explore carefully (Enter the number of your choice)");
                    //Monster: Fogling (a small, ghost-like creature that mimics voices) //The lantern holds the fogling
                    int num = input.nextInt();
                    if(num == 1)
                    {
                        System.out.println("You follow the light further into the fog, just you and the eerie fog, within 2 minutes you reach the center and lying in the center is a relatively large lantern flickering blue. \nWhat do you want to do? \n1. Pick up the lantern and observe it \n2. RUN!");
                        int choice = input.nextInt();
                        if(choice == 1)
                        {
                            System.out.println("As you reach for the lantern, it begins to shake and suddenly you are face to face with a small, ghost-like creature. You let out a shriek and almost instantaneously it mimics it exactly.");
                            int roll = DieRoller.rollD20(); //+wisdom
                            if(roll >= 13)
                            {
                                System.out.println("You recognize this creature as a Fogling, commonly found in, well, fog.");
                            }
                            System.out.println("There's no turning back now you have been forced to fight");
                        }
                        else
                        {

                        }
                    }
                    else if(num == 2)
                    {

                    }
                    else
                    {

                    }
                }
            }
            else if (find == 2)
            {
                System.out.println("A forest shrine dedicated to an old guardian spirit has fallen to ruin. Animals nearby are becoming aggressive. \nCan you rebuild or cleanse the sign? (Yes or No)");
                String answer = input.nextLine();
                if(answer.equals("Yes"))
                {
                    System.out.println("Great! Now, what would you like to do? \n1. Search the forest for the missing shrine stones \n2. Attempt to speak with the spirit directly \n3. Offer something valuable to appease it (Enter the number of your choice)");
                    //Monster: Briarwolf (a wolf with thorns and roots growing through its fur) The spirit is not hostile-it's trapped repairing the shrine frees it, ignoring its pleas will cause the forest to turn against you
                    int num = input.nextInt();
                    if(num == 1)
                    {

                    }
                    else if(num == 2)
                    {

                    }
                    else
                    {

                    }
                }
            }
            else if(find == 3)
            {
                System.out.println("A drought has revealed a rusted iron gate once hidden below the lake's surface. A cold whisper calls, '" + player.getName() + "!!!'\nCan you open the gate and retrieve whatever has been locked away for years? (Yes or No)");
                String answer = input.nextLine();
                if(answer.equals("Yes"))
                {
                    System.out.println("Great! Now, what would you like to do? \n1. Swim into the remaining water-filled tunnels \n2. Use tools to break open the gate  \n3. Investigate the ancient symbol carved around it (Enter the number of your choice)");
                    //Monster: Drowned Shade (a skeletal spirit bound to the gate) The prisoner behind the gate isn't evil -it's a trapped memory, a fragment of someone's past offering knowledge and power if you release it
                    int num = input.nextInt();
                    if(num == 1)
                    {

                    }
                    else if(num == 2)
                    {

                    }
                    else
                    {

                    }
                }
            }
            else
            {
                System.out.println("A tyrant warlord keeps a magical crown that burns eternally with shifting orange flames. Many fear it grants him an unnatural strength.\nCan you steal the Ember Crown without being incinerated? (Yes or No)");
                String answer = input.nextLine();
                if(answer.equals("Yes"))
                {
                    System.out.println("Great! Now, what would you like to do? \n1. Sneak through the fortress catacombs \n2. Challenge the warlord openly \n3. Forge a replica crown to trick him (Enter the number of your choice)");
                    //Monster: Ashborn Golem (a towering guardian made from cooled volcanic rock) If you place the crown on your head, it becomes a powerful ally; fail, and the flames consume your identity
                    int num = input.nextInt();
                    if(num == 1)
                    {

                    }
                    else if(num == 2)
                    {

                    }
                    else
                    {

                    }

                }
            }
        }
        else if (option == 2)
        {
            int find = DieRoller.rollD20(); //+ player.getWisdom();
            if(find >= 10)
            {
                System.out.println("You found a cozy inn! \n-----------8 Hours Later------------ \nYou got a full night's sleep!");
            }
            else
            {
                System.out.println("No more rooms were available, try again later.");
            }
        }
        else if(option == 3)
        {
            System.out.println("\nWelcome to the shop! What would you like to buy? \n1. WEAPONS \n2. ARMOR \n3. HEALTH \n4. SPELLS (Enter the number of your choice)");
            int choice = input.nextInt();
            if (choice == 1)
            {
                System.out.println("Welcome to the Forge! Here is our stock! \n1. Longsword \n2. Shortsword \n3. Mace \n4. Greataxe \n5. Greatclub (Enter the number of your choice)");
                int weaponOption = input.nextInt();
                String equip;
                if(weaponOption == 1)
                {
                    Weapon longsword = new Weapon("Longsword", "Slashing", 1, "D8", 2);
                    player.equipWeapon(longsword);
                    System.out.println("Weapon Equipped!");
                    }
                else if(weaponOption == 2)
                {
                    Weapon shortsword = new Weapon("Shortsword", "Piercing", 1, "D6", 2);
                    player.equipWeapon(shortsword);
                    System.out.println("Weapon Equipped!");
                }
                else if(weaponOption == 3)
                {
                    Weapon mace = new Weapon("Mace", "Bludgeoning", 1, "D8", 2);
                    player.equipWeapon(mace);
                    System.out.println("Weapon Equipped!");
                }
                else if(weaponOption == 4)
                {
                    Weapon greataxe = new Weapon("Greataxe", "Slashing", 1, "D12", 2);
                    player.equipWeapon(greataxe);
                    System.out.println("Weapon Equipped!");
                }
                else if(weaponOption == 5)
                {
                        Weapon greatclub = new Weapon("Greatclub", "Bludgeoning", 1, "D8", 2);
                        player.equipWeapon(greatclub);
                        System.out.println("Weapon Equipped!");
                }
            }
            else if (choice == 2)
            {

            }
            else if (choice == 3)
            {

            }
            else if(choice == 4)
            {

            }
        }
        else if(option == 4)
        {
            System.out.println(player);
        }
    }
    System.exit(0);
}
//token: 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