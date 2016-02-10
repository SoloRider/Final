import java.sql.DatabaseMetaData;
import java.util.Collections;
import java.util.Scanner;
import javax.xml.crypto.Data;


public class GameRunner
	{
		public static void main (String[] args)
			{
				PlayerMaker.greetUser();
				Fighter.addCharacter();
				Fighter.userPlayerMaker();
				Fighter.comPlayerMaker();
				Fighter.newPlayers();
				Collections.sort(Fighter.arenaPlayers, new InitiativeSorter());
//				System.out.println("The order of players is " + Fighter.arenaPlayers.sort(Fighter.arenaPlayers.getInitiative()) + "");
				Fighter.determiningTheCharacter();
				while(Fighter.checkWonGame())
					{
						Fighter.runningTheGame();
						Fighter.checkWonGame();
					}
			}
	}
