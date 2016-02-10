import java.util.ArrayList;
import java.util.Scanner;


public class PlayerMaker
	{
		public static void greetUser()
			{
				Scanner userlnput = new Scanner (System.in);
				System.out.println("What is your name?");
				String name = userlnput.nextLine();
				System.out.println("Nice to meet you, " + name + ".");
				System.out.println("Would you like to play a game of ESO, " + name + "?");
				String choice = userlnput.nextLine();
				if(choice.equals ("no") || choice.equals("No"))
					{
						System.out.println("Okay.... bye");
						System.exit(0);
					}
				if(choice.equals ("yes") || choice.equals("Yes"))
					{
						System.out.println("Let's get it onnn!!!");
					}
				System.out.println("Ok, you will have 2 players to face 2 bad guys. Let the games begin!!!");
				System.out.println("____________________________________");
				System.out.println();
			}
	}
