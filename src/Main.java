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
    //Intro to game
    System.out.println("WELCOME ADVENTURER! PLEASE CREATE AN ENJOINED");
    System.out.println("What shall be your name?");
    String name = input.nextLine();
    System.out.println("And what kind of warrior are you? (Paladin, Wizard, Bard, Cleric, Fighter, Rogue)");
    String cc = input.nextLine();
    //creates a new character
    CharClass playerClass = new CharClass(cc);
    PlayerCharacter player = new PlayerCharacter(name, 1, playerClass.getStarterHP(), playerClass, playerClass.getStarterWeapon());

    System.out.println(player);
    System.out.println("You have successfully become enjoined! Welcome to NYCOS " + player.getName() + "!");
    int option = 0;

    while(option != 5)
    {
        //"Meat" of the game, takes in whatever number the user put in
        System.out.println("\n" +
                "What would you like to do? \n" +
                "1. Go on a quest \n" +
                "2. Rest \n" +
                "3. Go Shopping! \n" +
                "4. View my stats \n" +
                "5. Quit (Enter the number of your choice)");
        option = input.nextInt();
        input.nextLine();
        if (option == 1)
        {
            //randomizes a quest
            int find = DieRoller.rollD4();
            if(find == 1)
            {
                System.out.println("A thick unatural fog has been seen in a local village. There is a faint blue lantern flickering somewhere in the heart of it \n" +
                        "Can you recover the lantern and dispel the fog? (Yes or No)");
                String answer = input.nextLine();
                if(answer.equals("Yes"))
                {
                    System.out.println("Great! Now, what would you like to do? \n" +
                            "1. Follow the light deeper into the fog \n" +
                            "2. Try to shout and see if anything responds \n" +
                            "3. Tie a rope to a tree and explore carefully (Enter the number of your choice)");
                    //Monster: Fogling (a small, ghost-like creature that mimics voices) //The lantern holds the fogling
                    Monster fogling = new Monster("Fogling",10, 11, 50, 4);
                    int num = input.nextInt();
                    input.nextLine();

                    if(num == 1)
                    {
                        System.out.println("You follow the light further into the fog, just you and the eerie fog, within 2 minutes you reach the center and lying in the center is a relatively large lantern flickering blue. \n" +
                                "What do you want to do? \n" +
                                "1. Pick up the lantern and observe it \n" +
                                "2. RUN!");
                        int choice = input.nextInt();
                        input.nextLine();
                        if(choice == 1)
                        {
                            System.out.println("As you reach for the lantern, it begins to shake and suddenly you are face to face with a small, ghost-like creature. You let out a shriek and almost instantaneously it mimics it exactly.");
                            int roll = DieRoller.rollD20(); //+wisdom
                            if(roll >= 13)
                            {
                                System.out.println("You recognize this creature as a Fogling, commonly found in, well, fog.");
                            }
                            System.out.println("There's no turning back now, you have been forced to fight");
                            //fight sequence
                            Fight.battle(player, fogling);
                            System.out.println("YOU DID IT! You defeated the Fogling! You return to town with the lantern and are a local hero! You gained " + fogling.getXP() + " XP!");
                            if(player.levelUp(fogling.getXP()))
                            {
                                System.out.print(" AND you leveled up!");
                                System.out.println(player);
                            }
                        }
                        else
                        {
                            boolean runSuccess = run(9);
                            if(!runSuccess)
                            {
                                System.out.println("You're a bit to clumsy to be bailing right now, you tripped on a branch on your way out, there's no turning back now, you have been forced to fight!");
                                //fight sequence
                                Fight.battle(player, fogling);
                                System.out.println("YOU DID IT! You defeated the Fogling!  return to town with the lantern and are a local hero! You gained " + fogling.getXP() + " XP!");
                                if(player.levelUp(fogling.getXP()))
                                {
                                    System.out.print(" AND you leveled up!");
                                    System.out.println(player);
                                }
                            }
                            else
                            {
                                System.out.println("Phew! You got out of there just in time. You dodged the threat, but you don't get any glory. What a coward!");
                            }
                        }
                    }
                    else if(num == 2)
                    {
                        System.out.println("You shout into the distance, 'HELLO!! IS ANYONE THERE!' within seconds you receive a response, but instead of hearing someone else, you hear a mere repeat of your own voice. 'HELLO!! IS ANYONE THERE!' same pitch, everything, but this isn't an echo...");
                        System.out.println("What do you want to do? \n" +
                                "1. Go forth into the fog, what's there to lose? Just your life... \n" +
                                "2. RUN!");
                        int choice = input.nextInt();
                        input.nextLine();
                        if(choice == 1)
                        {
                            System.out.println("You made a smart choice, you go straight into the fog, once you reach the center you see... THE LANTERN \n" +
                                    "What do you want to do? \n" +
                                    "1. Inspect it \n" +
                                    "2. RUN!");
                            int choice2 = input.nextInt();
                            input.nextLine();
                            if(choice2 == 1)
                            {
                                System.out.println("As you reach for the lantern, it begins to shake and suddenly you are face to face with a small, ghost-like creature. You let out a shriek and almost instantaneously it mimics it exactly.");
                                int roll = DieRoller.rollD20(); //+wisdom
                                if(roll >= 13)
                                {
                                    System.out.println("You recognize this creature as a Fogling, commonly found in, well, fog.");
                                }
                                System.out.println("There's no turning back now, you have been forced to fight");
                                //fight sequence
                                Fight.battle(player, fogling);
                                System.out.println("YOU DID IT! You defeated the Fogling! You return to town with the lantern and are a local hero! You gained " + fogling.getXP() + " XP!");
                                if(player.levelUp(fogling.getXP()))
                                {
                                    System.out.print(" AND you leveled up!");
                                    System.out.println(player);
                                }
                            }
                            else
                            {
                               boolean runSuccess = run(9);
                               if(!runSuccess)
                               {
                                   System.out.println("You're a bit to clumsy to be bailing right now, you tripped on a branch on your way out, there's no turning back now, you have been forced to fight!");
                                   //fight sequence
                                   Fight.battle(player, fogling);
                                   System.out.println("YOU DID IT! You defeated the Fogling! You return to town with the lantern and are a local hero! You gained " + fogling.getXP() + " XP!");
                                   if(player.levelUp(fogling.getXP()))
                                   {
                                       System.out.print(" AND you leveled up!");
                                       System.out.println(player);
                                   }
                               }
                               else
                               {
                                   System.out.println("Phew! You got out of there just in time. You dodged the threat, but you don't get any glory. What a coward!");
                               }
                            }
                        }
                    }
                    else
                    {
                        System.out.println("You tie yourself to a tree leaving about 50 feet of wiggle room, off you venture into The Fog");
                        System.out.println("You follow the light further into the fog, just you and the eerie fog, within 2 minutes you reach the center and lying in the center is a relatively large lantern flickering blue. \n" +
                                "What do you want to do? \n" +
                                "1. Pick up the lantern and observe it \n" +
                                "2. RUN!");
                        int choice = input.nextInt();
                        input.nextLine();
                        if(choice == 1)
                        {
                            System.out.println("As you reach for the lantern, it begins to shake and suddenly you are face to face with a small, ghost-like creature. You let out a shriek and almost instantaneously it mimics it exactly.");
                            int roll = DieRoller.rollD20(); //+wisdom
                            if(roll >= 13)
                            {
                                System.out.println("You recognize this creature as a Fogling, commonly found in, well, fog.");
                            }
                            System.out.println("There's no turning back now, you have been forced to fight");
                            //fight sequence
                            Fight.battle(player, fogling);
                            System.out.println("YOU DID IT! You defeated the Fogling! You return to town with the lantern and are a local hero! You gained " + fogling.getXP() + " XP!");
                            if(player.levelUp(fogling.getXP()))
                            {
                                System.out.print(" AND you leveled up!");
                                System.out.println(player);
                            }
                        }
                        else
                        {
                            boolean runSuccess = run(9);
                            if(!runSuccess)
                            {
                                System.out.println("You're a bit to clumsy to be bailing right now, you tripped on a branch on your way out, there's no turning back now, you have been forced to fight!");
                                //fight sequence
                                Fight.battle(player, fogling);
                                System.out.println("YOU DID IT! You defeated the Fogling!  You return to town with the lantern and are a local hero! You gained " + fogling.getXP() + " XP!");
                                if(player.levelUp(fogling.getXP()))
                                {
                                    System.out.print(" AND you leveled up!");
                                    System.out.println(player);
                                }
                            }
                            else
                            {
                                System.out.println("Phew! You got out of there just in time. You dodged the threat, but you don't get any glory. What a coward!");
                            }
                        }
                    }
                }
            }
            else if (find == 2)
            {
                System.out.println("A forest shrine dedicated to an old guardian spirit has fallen to ruin. Animals nearby are becoming aggressive. \n" +
                        "Can you rebuild or cleanse the sign? (Yes or No)");
                String answer = input.nextLine();
                if(answer.equals("Yes"))
                {
                    System.out.println("Great! Now, what would you like to do? \n" +
                            "1. Search the forest for the missing shrine stones \n" +
                            "2. Attempt to speak with the spirit directly \n" +
                            "3. Offer something valuable to appease it (Enter the number of your choice)");
                    //Monster: Briarwolf (a wolf with thorns and roots growing through its fur) The spirit is not hostile-it's trapped repairing the shrine frees it, ignoring its pleas will cause the forest to turn against you
                    Monster briarwolf = new Monster("Briarwolf", 24, 14, 200, 8);
                    int num = input.nextInt();
                    input.nextLine();
                    if(num == 1)
                    {
                        System.out.println("You dive head into the dark forest, as you go deeper in you find the shrine! What would you like to do? \n" +
                                "1. Start Cleaning \n" +
                                "2. RUN!");
                        int choice = input.nextInt();
                        input.nextLine();
                        if(choice == 1)
                        {
                            System.out.println("You pull out the cleaning supplies you've been given, after about " + DieRoller.rollD8() + "0 minutes you finished and exit the forest scuff free. \n You return to town and explain how you cleaned the shrine! Soon the animals are back to normal! You're a local hero!");
                        }
                        else
                        {
                            if(!run(10))
                            {
                                System.out.println("On your way out you tripped on a branch, you hear a howl, is it?? No it can't be, nevermind! ITS COMING RIGHT AT YOU. Suddenly a massive Briarwolf lunges at you, there's no turning back now, you have been forced to fight!");
                                Fight.battle(player, briarwolf);
                                System.out.println("YOU DID IT! You defeated the Briarwolf! You return to town explaining how you cleaned the shrine and fought off the wolf and are a local hero! You gained " + briarwolf.getXP() + " XP!");
                                if(player.levelUp(briarwolf.getXP()))
                                {
                                    System.out.print(" AND you leveled up!");
                                    System.out.println(player);
                                }
                            }
                            else
                            {
                                System.out.println("What a coward, you get out of there but now you're the laughing stock of the town, great job.");
                            }
                        }
                    }
                    else if(num == 2)
                    {
                        System.out.println("You begin to attempt to tap into your inner self and communicate with the spirit");
                        if(player.getCharacterClass().getName().equals("Wizard") || player.getCharacterClass().getName().equals("Paladin") || player.getCharacterClass().getName().equals("Cleric"))
                        {
                            System.out.print(" and it was successful, you are now speaking with the spirit. \n" +
                                    "What would you like to ask? \n" +
                                    "1. Why are the animals becoming agressive? \n" +
                                    "2. Where is your shrine so I can clean it?");
                            int choice = input.nextInt();
                            input.nextLine();
                            if(choice == 1)
                            {
                                System.out.println("The spirit responds in a whispy voice, 'They are angry because my shrine has been disgraced, please clean it and they will return back to normal' Do you want to clean the shrine? (Yes or No)");
                                String yesNo = input.nextLine();
                                if(yesNo.equals("Yes"))
                                {
                                    System.out.println("'Great, it's in the center of the forest just walk in and clean it please!' \n" +
                                            "You wander into the center of the woods and there it is, the shrine. \n" +
                                            "You pull out the cleaning supplies you've been given, after about " + DieRoller.rollD8() + "0 minutes you finish up and exit the forest scuff free. \n" +
                                            "You return to town and explain how you cleaned the shrine! Soon the animals are back to normal and you're a local hero!");
                                }
                                else
                                {
                                    System.out.println("'Well, you've left me with no choice' You hear a howl, is it?? No it can't be, nevermind! ITS COMING RIGHT AT YOU. Suddenly a massive Briarwolf lunges at you, there's no turning back now, you have been forced to fight!");
                                    Fight.battle(player, briarwolf);
                                    System.out.println("YOU DID IT! You defeated the Briarwolf! You return to town explaining how you cleaned the shrine and fought off the wolf and are a local hero! You gained " + briarwolf.getXP() + " XP!");
                                    if(player.levelUp(briarwolf.getXP()))
                                    {
                                        System.out.print(" AND you leveled up!");
                                        System.out.println(player);
                                    }
                                }
                            }
                        }
                        else
                        {
                            System.out.print(" and it was unsuccessful, the only thing your talking to is yourself and not even you're answering. The only other option now is to, well go in there. Do you want to? (Yes or No)");
                            String yesNo = input.nextLine();
                            if(yesNo.equals("Yes"))
                            {
                                System.out.println("You wander into the center of the woods and there it is, the shrine. \n" +
                                        "You pull out the cleaning supplies you've been given, after about " + DieRoller.rollD8() + "0 minutes you finish up and exit the forest scuff free. \n" +
                                        "You return to town and explain how you cleaned the shrine! Soon the animals are back to normal and you're a local hero!");
                            }
                            else
                            {
                                System.out.println("'Well, you've left me with no choice' You hear a howl, is it?? No it can't be, nevermind! ITS COMING RIGHT AT YOU. Suddenly a massive Briarwolf lunges at you, there's no turning back now, you have been forced to fight!");
                                Fight.battle(player, briarwolf);
                                System.out.println("YOU DID IT! You defeated the Briarwolf! You return to town explaining how you cleaned the shrine and fought off the wolf and are a local hero! You gained " + briarwolf.getXP() + " XP!");
                                if(player.levelUp(briarwolf.getXP()))
                                {
                                    System.out.print(" AND you leveled up!");
                                    System.out.println(player);
                                }
                            }
                        }
                    }
                    else
                    {
                        System.out.println("You dig in your pocket and you find");
                        if(DieRoller.rollD20() >= 5)
                        {
                            System.out.print(" a few pieces of gold, 'Umm, hey here's some umm gold will this be enough?'");
                        }
                        else
                        {
                            System.out.print(" nothing, well this is great! What would you like to do next? \n1. Begin to wander into the woods looking for the shrine \n2.Just leave");
                            int choice = input.nextInt();
                            input.nextLine();
                            if(choice == 1)
                            {
                                System.out.println("You dive head into the dark forest, as you go deeper in you find the shrine! What would you like to do? \n" +
                                        "1. Start Cleaning \n" +
                                        "2. RUN!");
                                int option1 = input.nextInt();
                                input.nextLine();
                                if(option1 == 1)
                                {
                                    System.out.println("You pull out the cleaning supplies you've been given, after about " + DieRoller.rollD8() + "0 minutes you finished and exit the forest scuff free. \n You return to town and explain how you cleaned the shrine! Soon the animals are back to normal! You're a local hero!");
                                }
                                else
                                {
                                    if(!run(10))
                                    {
                                        System.out.println("On your way out you tripped on a branch, you hear a howl, is it?? No it can't be, nevermind! ITS COMING RIGHT AT YOU. Suddenly a massive Briarwolf lunges at you, there's no turning back now, you have been forced to fight!");
                                        Fight.battle(player, briarwolf);
                                        System.out.println("YOU DID IT! You defeated the Briarwolf! You return to town explaining how you cleaned the shrine and fought off the wolf and are a local hero! You gained " + briarwolf.getXP() + " XP!");
                                        if(player.levelUp(briarwolf.getXP()))
                                        {
                                            System.out.print(" AND you leveled up!");
                                            System.out.println(player);
                                        }
                                    }
                                    else
                                    {
                                        System.out.println("What a coward, you get out of there but now you're the laughing stock of the town, great job.");
                                    }
                                }
                            }
                            else
                            {
                                if(!run(10))
                                {
                                    System.out.println("On your way out you tripped on a branch, you hear a howl, is it?? No it can't be, nevermind! ITS COMING RIGHT AT YOU. Suddenly a massive Briarwolf lunges at you, there's no turning back now, you have been forced to fight!");
                                    Fight.battle(player, briarwolf);
                                    System.out.println("YOU DID IT! You defeated the Briarwolf! You return to town explaining how you cleaned the shrine and fought off the wolf and are a local hero! You gained " + briarwolf.getXP() + " XP!");
                                    if(player.levelUp(briarwolf.getXP()))
                                    {
                                        System.out.print(" AND you leveled up!");
                                        System.out.println(player);
                                    }
                                }
                                else
                                {
                                    System.out.println("What a coward, you get out of there but now you're the laughing stock of the town, great job.");
                                }
                            }
                        }
                    }
                }
            }
            else if(find == 3)
            {
                System.out.println("A drought has revealed a rusted iron gate once hidden below the lake's surface. A cold whisper calls, '" + player.getName() + "!!!'\n" +
                        "Can you open the gate and retrieve whatever has been locked away for years? (Yes or No)");
                String answer = input.nextLine();
                if(answer.equals("Yes"))
                {
                    System.out.println("Great! Now, what would you like to do? \n" +
                                    "1. Swim into the remaining water-filled tunnels \n" +
                                    "2. Use tools to break open the gate  \n" +
                                    "3. Investigate the ancient symbol carved around it (Enter the number of your choice)");

                    // Monster: Drowned Shade (a skeletal spirit bound to the gate)
                    // The prisoner behind the gate is a trapped memory offering knowledge and power
                    Monster drownedShade = new Monster("Drowned Shade", 35, 16, 450, 10);

                    int num = input.nextInt();
                    input.nextLine();

                    if(num == 1)
                    {
                        System.out.println("You plunge into the dark tunnels. The water is freezing, and something brushes past your leg...\n" +
                                        "What do you do?\n" +
                                        "1. Push deeper into the tunnels\n" +
                                        "2. Turn back and RUN!");

                        int choice = input.nextInt();
                        input.nextLine();

                        if(choice == 1)
                        {
                            System.out.println("The water suddenly stills. A skeletal figure drifts toward you, eyes glowing blue.");
                            int roll = DieRoller.rollD20();
                            if(roll >= 14)
                            {
                                System.out.println(
                                        "You recognize this as a Drowned Shade, bound to guard the gate."
                                );
                            }

                            System.out.println("There's no turning back now, you have been forced to fight!");
                            Fight.battle(player, drownedShade);
                            System.out.println("YOU DID IT! You defeated the Drowned Shade! You gained " + drownedShade.getXP() + " XP!");

                            if(player.levelUp(drownedShade.getXP()))
                            {
                                System.out.print(" AND you leveled up!");
                                System.out.println(player);
                            }
                        }
                        else
                        {
                            boolean runSuccess = run(11);
                            if(!runSuccess)
                            {
                                System.out.println("The freezing water slows you down — the Shade rises before you can escape!");
                                Fight.battle(player, drownedShade);
                                System.out.println("YOU DID IT! You defeated the Drowned Shade! You gained " + drownedShade.getXP() + " XP!");

                                if(player.levelUp(drownedShade.getXP()))
                                {
                                    System.out.print(" AND you leveled up!");
                                    System.out.println(player);
                                }
                            }
                            else
                            {
                                System.out.println("You burst from the water, gasping for air. You escaped, but the gate remains sealed.");
                            }
                        }
                    }
                    else if(num == 2)
                    {
                        System.out.println("You jam your tools into the rusted gate. The metal SCREAMS as it bends...\n" +
                                        "What do you do?\n" +
                                        "1. Force it open\n" +
                                        "2. Stop and RUN!");

                        int choice = input.nextInt();
                        input.nextLine();

                        if(choice == 1)
                        {
                            System.out.println("The gate snaps open violently, releasing a surge of icy water.");
                            System.out.println("A skeletal spirit claws its way free — the Drowned Shade!");

                            System.out.println("There's no turning back now, you have been forced to fight!");
                            Fight.battle(player, drownedShade);
                            System.out.println("YOU DID IT! You defeated the Drowned Shade! You gained " + drownedShade.getXP() + " XP!");

                            if(player.levelUp(drownedShade.getXP()))
                            {
                                System.out.print(" AND you leveled up!");
                                System.out.println(player);
                            }
                        }
                        else
                        {
                            boolean runSuccess = run(10);
                            if(!runSuccess)
                            {
                                System.out.println("The gate bursts open behind you — the Shade drags you back!");
                                Fight.battle(player, drownedShade);
                                System.out.println("YOU DID IT! You defeated the Drowned Shade! You gained " + drownedShade.getXP() + " XP!");

                                if(player.levelUp(drownedShade.getXP()))
                                {
                                    System.out.print(" AND you leveled up!");
                                    System.out.println(player);
                                }
                            }
                            else
                            {
                                System.out.println("You retreat safely, but the whispers linger in your mind.");
                            }
                        }
                    }
                    else
                    {
                        System.out.println(
                                "You study the ancient symbols carved into the stone. They pulse faintly...\n" +
                                        "What do you do?\n" +
                                        "1. Attempt to decipher the symbols\n" +
                                        "2. Ignore them and force the gate open\n" +
                                        "3. Leave quietly"
                        );

                        int choice = input.nextInt();
                        input.nextLine();

                        if(choice == 1)
                        {
                            int roll = DieRoller.rollD20();
                            if(roll >= 15)
                            {
                                System.out.println("You realize the gate seals a memory, not a monster.\n" + "You carefully release it, gaining forgotten knowledge.");
                            }
                            else
                            {
                                System.out.println("The symbols flare violently — something has been awakened!");
                                Fight.battle(player, drownedShade);
                                System.out.println("YOU DID IT! You defeated the Drowned Shade! You gained " + drownedShade.getXP() + " XP!");

                                if(player.levelUp(drownedShade.getXP()))
                                {
                                    System.out.print(" AND you leveled up!");
                                    System.out.println(player);
                                }
                            }
                        }
                        else if(choice == 2)
                        {
                            System.out.println("You ignore the warning signs and force the gate open.");
                            Fight.battle(player, drownedShade);
                            System.out.println("YOU DID IT! You defeated the Drowned Shade! You gained " + drownedShade.getXP() + " XP!");

                            if(player.levelUp(drownedShade.getXP()))
                            {
                                System.out.print(" AND you leveled up!");
                                System.out.println(player);
                            }
                        }
                        else
                        {
                            System.out.println("You step away from the gate. Some things are better left forgotten.");
                        }
                    }
                }

            }
            else
            {
                System.out.println("A tyrant warlord keeps a magical crown that burns eternally with shifting orange flames. " +
                                "Many fear it grants him an unnatural strength.\n" +
                                "Can you steal the Ember Crown without being incinerated? (Yes or No)");
                String answer = input.nextLine();
                if(answer.equals("Yes"))
                {
                    System.out.println("Great! Now, what would you like to do? \n" +
                                    "1. Sneak through the fortress catacombs \n" +
                                    "2. Challenge the warlord openly \n" +
                                    "3. Forge a replica crown to trick him (Enter the number of your choice)");

                    // Monster: Ashborn Golem (guardian of the Ember Crown)
                    Monster ashbornGolem = new Monster("Ashborn Golem", 60, 18, 1100, 12);

                    int num = input.nextInt();
                    input.nextLine();

                    if(num == 1)
                    {
                        System.out.println("You slip into the catacombs beneath the fortress. The air grows hotter with every step...\n" +
                                        "What do you do?\n" +
                                        "1. Move carefully through the shadows\n" +
                                        "2. RUN before you're noticed!");

                        int choice = input.nextInt();
                        input.nextLine();

                        if(choice == 1)
                        {
                            int roll = DieRoller.rollD20();
                            if(roll >= 15)
                            {
                                System.out.println("You avoid the patrols and reach the chamber of the Ember Crown.");
                                System.out.println("As you lift the crown, molten stone assembles behind you...");
                            }
                            else
                            {
                                System.out.println("You knock loose a stone — alarms echo through the catacombs!");
                            }

                            System.out.println("The Ashborn Golem rises to stop you!");
                            Fight.battle(player, ashbornGolem);
                            System.out.println("YOU DID IT! You defeated the Ashborn Golem! You gained " + ashbornGolem.getXP() + " XP!");

                            if(player.levelUp(ashbornGolem.getXP()))
                            {
                                System.out.print(" AND you leveled up!");
                                System.out.println(player);
                            }
                        }
                        else
                        {
                            boolean runSuccess = run(12);
                            if(!runSuccess)
                            {
                                System.out.println("You stumble into a wall of heat — something blocks your escape!");
                                Fight.battle(player, ashbornGolem);
                                System.out.println("YOU DID IT! You defeated the Ashborn Golem! You gained " + ashbornGolem.getXP() + " XP!");

                                if(player.levelUp(ashbornGolem.getXP()))
                                {
                                    System.out.print(" AND you leveled up!");
                                    System.out.println(player);
                                }
                            }
                            else
                            {
                                System.out.println("You barely escape the fortress, the crown still burning behind you.");
                            }
                        }
                    }
                    else if(num == 2)
                    {
                        System.out.println("You stride into the warlord's hall and issue a challenge. Flames flare brighter...");

                        System.out.println("The Ember Crown reacts violently, tearing itself free!");

                        Fight.battle(player, ashbornGolem);
                        System.out.println("YOU DID IT! You defeated the Ashborn Golem! You gained " + ashbornGolem.getXP() + " XP!");

                        if(player.levelUp(ashbornGolem.getXP()))
                        {
                            System.out.print(" AND you leveled up!");
                            System.out.println(player);
                        }
                    }
                    else
                    {
                        System.out.println("You spend days forging a replica crown, carefully matching every detail...\n" +
                                        "What do you do?\n" +
                                        "1. Attempt the swap during a ceremony\n" +
                                        "2. Abort the plan and RUN!");

                        int choice = input.nextInt();
                        input.nextLine();

                        if(choice == 1)
                        {
                            int roll = DieRoller.rollD20();
                            if(roll >= 16)
                            {
                                System.out.println("The swap is flawless. The real Ember Crown is now in your hands.");
                                System.out.println("You feel the flames accept you — the crown bows to your will.");
                            }
                            else
                            {
                                System.out.println("The replica cracks in your hands — the deception is revealed!");
                                Fight.battle(player, ashbornGolem);
                                System.out.println("YOU DID IT! You defeated the Ashborn Golem! You gained " + ashbornGolem.getXP() + " XP!");

                                if(player.levelUp(ashbornGolem.getXP()))
                                {
                                    System.out.print(" AND you leveled up!");
                                    System.out.println(player);
                                }
                            }
                        }
                        else
                        {
                            System.out.println("You abandon the plan. Some flames are not meant to be stolen.");
                        }
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
            input.nextLine();
            if (choice == 1)
            {
                System.out.println("Welcome to the Forge! Here is our stock! \n1. Longsword \n2. Shortsword \n3. Mace \n4. Greataxe \n5. Greatclub (Enter the number of your choice)");
                int weaponOption = input.nextInt();
                input.nextLine();
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
                System.out.println("Sorry we're currently out of stock");
            }
            else if (choice == 3)
            {
                System.out.println("Sorry we're currently out of stock");
            }
            else if(choice == 4)
            {
                System.out.println("Sorry we're currently out of stock");
            }
        }
        else if(option == 4)
        {
            System.out.println(player);
        }
    }
    endgame(player);
    System.exit(0);
}

//method to check if the player can "run" or escape from a quest
static boolean run(int dc)
{
    int run = DieRoller.rollD20(); //+dex
    if(run >= dc)
    {
        return true;
    }
    else
    {
        return false;
    }
}

static String endgame(PlayerCharacter p)
{
    return p + "\n" + p.getName() + " rolled a total of " + DieRoller.getTotalRolls() + " times!";
}