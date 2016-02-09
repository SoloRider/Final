import java.util.Scanner;


public class GameRunner
	{
		public static void main (String[] args)
			{
			PlayerMaker.greetUser();
			Gameplay.userPlayerMaker();
			Gameplay.comPlayerMaker();
			Gameplay.determiningTheCharacter();
				while(Gameplay.checkWonGame())
					{
						Gameplay.runningTheGame();
						Gameplay.checkWonGame();
					}
			}
	}
