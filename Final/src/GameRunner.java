import java.util.Scanner;


public class GameRunner
	{
		public static void main (String[] args)
			{
				PlayerMaker.greetUser();
				Gameplay.addCharacter();
				Gameplay.userPlayerMaker();
				Gameplay.comPlayerMaker();
				Gameplay.roleInitiative();
				Gameplay.determiningTheCharacter();
				while(Gameplay.checkWonGame())
					{
						Gameplay.runningTheGame();
						Gameplay.checkWonGame();
					}
			}
	}
