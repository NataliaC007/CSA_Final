//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
//add shield type things
//spells
//attributes
//races
//exausted feature

//figure out equip thingy
//work on quests

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

        }
        else if (option == 2)
        {
            int find = DieRoller.rollD20(); //+ player.getWisdom(); happy birthday
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
                    System.out.println("Equip weapon? (Yes or No)");
                    equip = input.nextLine();
                    if(equip.equals("Yes"))
                    {
                        Weapon longsword = new Weapon("Longsword", "Slashing", 1, "D8", 2);
                        player.equipWeapon(longsword);
                        System.out.println("Weapon Equipped!");
                    }
                }
                else if(weaponOption == 2)
                {
                    System.out.println("Equip weapon? (Yes or No)");
                    equip = input.nextLine();
                    if(equip.equals("Yes"))
                    {
                        Weapon shortsword = new Weapon("Shortsword", "Piercing", 1, "D6", 2);
                        player.equipWeapon(shortsword);
                        System.out.println("Weapon Equipped!");
                    }
                }
                else if(weaponOption == 3)
                {
                    System.out.println("Equip weapon? (Yes or No)");
                    equip = input.nextLine();
                    if(equip.equals("Yes"))
                    {
                        Weapon mace = new Weapon("Mace", "Bludgeoning", 1, "D8", 2);
                        player.equipWeapon(mace);
                        System.out.println("Weapon Equipped!");
                    }
                }
                else if(weaponOption == 4)
                {
                    System.out.println("Equip weapon? (Yes or No)");
                    equip = input.nextLine();

                    if(equip.equals("Yes"))
                    {
                        Weapon greataxe = new Weapon("Greataxe", "Slashing", 1, "D12", 2);
                        player.equipWeapon(greataxe);
                        System.out.println("Weapon Equipped!");
                    }
                }
                else if(weaponOption == 5)
                {
                    System.out.println("Equip weapon? (Yes or No)");
                    equip = input.nextLine();

                    if(equip.equals("Yes"))
                    {
                        Weapon greatclub = new Weapon("Greatclub", "Bludgeoning", 1, "D8", 2);
                        player.equipWeapon(greatclub);
                        System.out.println("Weapon Equipped!");
                    }
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