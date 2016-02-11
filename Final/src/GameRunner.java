import java.sql.DatabaseMetaData;
import java.util.Collections;
import java.util.Scanner;
import javax.xml.crypto.Data;


public class GameRunner
	{
		public static void main (String[] args)
			{
				Board.makeTheBoard();
				Board.display();
				PlayerMaker.greetUser();
				Fighter.addCharacter();
				Fighter.userPlayerMaker();
				Fighter.comPlayerMaker();
				Fighter.newPlayers();
				Collections.sort(Fighter.arenaPlayers, new InitiativeSorter());
				for(Fighter f : Fighter.arenaPlayers)
					{
						System.out.println(f.getName());
					}
				System.out.println("Is the new order.");
				Fighter.displayOnBoard();
				Fighter.determiningTheCharacter();
				while(Fighter.checkWonGame())
					{
						Fighter.runningTheGame();
						Fighter.checkWonGame();
					}
				System.exit(0);
			}
	}
