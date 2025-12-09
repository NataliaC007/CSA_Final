//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
//add shield type things
//spells
//attributes
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
    System.out.println();

}
//token: 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