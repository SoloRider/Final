import java.util.Collections;
import java.util.Scanner;

public class GameRunner
	{
		static boolean move = true;
		public static void main (String[] args) throws InterruptedException
			{
				Board.makeTheBoard();
				Board.display();
				PlayerMaker.greetUser();
				Fighter.addCharacter();
				Fighter.userPlayerMaker();
				Fighter.comPlayerMaker();
				Fighter.arenaPlayers();
				Collections.sort(Fighter.arenaPlayers, new InitiativeSorter());
				for(Fighter f : Fighter.arenaPlayers)
					{
						System.out.println(f.getName());
					}
				System.out.println("Is the new order.");
				Fighter.displayOnBoard();
				while(Fighter.checkWonGame())
					{
						int monsterRow = Fighter.comSkills.get(Fighter.eCharacter).getCurrentRowPos();
						int monsterCol = Fighter.comSkills.get(Fighter.eCharacter).getCurrentColPos();
						int characterRow = Fighter.playerSkills.get(Fighter.character).getCurrentRowPos();
						int characterCol = Fighter.playerSkills.get(Fighter.character).getCurrentColPos();
						int characterRow1 = Fighter.playerSkills.get(Fighter.character1).getCurrentRowPos();
						int characterCol1 = Fighter.playerSkills.get(Fighter.character1).getCurrentColPos();
						int differenceR = monsterRow - characterRow;
						int differenceC = monsterCol - characterCol;
						int differenceR1 = monsterRow - characterRow1;
						int differenceC1 = monsterCol - characterCol1;
						int positiveDifferenceR = Math.abs(differenceR);
						int positiveDifferenceC = Math.abs(differenceC);
						int positiveDifferenceR1 = Math.abs(differenceR1);
						int positiveDifferenceC1 = Math.abs(differenceC1);
						if(positiveDifferenceR <= 1 && positiveDifferenceC <= 1)
							{
								move = false;
								while(move == false)
									{
										Fighter.runningTheGame(Fighter.character);
										Fighter.checkWonGame();
										if(Fighter.playerSkills.get(Fighter.character).getHealth() <= 0)
											{	
												move = true;
												Fighter.movingCharacter1();
											}
									}
							}
						else if (positiveDifferenceR1 <= 1 && positiveDifferenceC1 <= 1)
		            		{
								move = false;
								while(move == false)
									{
										Fighter.runningTheGame(Fighter.character1);
										Fighter.checkWonGame();
										if(Fighter.playerSkills.get(Fighter.character1).getHealth() <= 0)
											{
												move = true;
												Fighter.movingCharacter();
											}
									}
		            		}
						if(Fighter.comSkills.get(Fighter.eCharacter).getInitiative() > Fighter.playerSkills.get(Fighter.character).getInitiative() && Fighter.comSkills.get(Fighter.eCharacter).getInitiative() > Fighter.playerSkills.get(Fighter.character1).getInitiative())
							{
								Fighter.movingECharacter();
								monsterRow = Fighter.comSkills.get(Fighter.eCharacter).getCurrentRowPos();
								monsterCol = Fighter.comSkills.get(Fighter.eCharacter).getCurrentColPos();
								characterRow = Fighter.playerSkills.get(Fighter.character).getCurrentRowPos();
								characterCol = Fighter.playerSkills.get(Fighter.character).getCurrentColPos();
								differenceR = monsterRow - characterRow;
								differenceC = monsterCol - characterCol;
								positiveDifferenceR = Math.abs(differenceR);
								positiveDifferenceC = Math.abs(differenceC);
								if(positiveDifferenceR <= 1 && positiveDifferenceC <= 1)
								{
									move = false;
									while(move == false)
										{
											Fighter.runningTheGame(Fighter.character);
											Fighter.checkWonGame();
											if(Fighter.playerSkills.get(Fighter.character).getHealth() <= 0)
												{	
													move = true;
												}
										}
								}
								monsterRow = Fighter.comSkills.get(Fighter.eCharacter).getCurrentRowPos();
								monsterCol = Fighter.comSkills.get(Fighter.eCharacter).getCurrentColPos();
								characterRow1 = Fighter.playerSkills.get(Fighter.character1).getCurrentRowPos();
								characterCol1 = Fighter.playerSkills.get(Fighter.character1).getCurrentColPos();
								differenceR1 = monsterRow - characterRow1;
								differenceC1 = monsterRow - characterCol1;
								positiveDifferenceR1 = Math.abs(differenceR1);
								positiveDifferenceC1 = Math.abs(differenceC1);
								if (positiveDifferenceR1 <= 1 && positiveDifferenceC1 <= 1)
			            		{
									move = false;
									while(move == false)
										{
											Fighter.runningTheGame(Fighter.character1);
											Fighter.checkWonGame();
											if(Fighter.playerSkills.get(Fighter.character1).getHealth() <= 0)
												{
													move = true;
												}
										}
			            		}
							}
						else if (Fighter.playerSkills.get(Fighter.character).getInitiative() < Fighter.playerSkills.get(Fighter.character1).getInitiative())
							{
								Fighter.movingCharacter1();
								characterRow1 = Fighter.playerSkills.get(Fighter.character1).getCurrentRowPos();
								characterCol1 = Fighter.playerSkills.get(Fighter.character1).getCurrentColPos();
								differenceR1 = monsterRow - characterRow1;
								differenceC1 = monsterCol - characterCol1;
								positiveDifferenceR1 = Math.abs(differenceR1);
								positiveDifferenceC1 = Math.abs(differenceC1);
								if (positiveDifferenceR1 <= 1 && positiveDifferenceC1 <= 1)
			            		{
									move = false;
									while(move == false)
										{
											Fighter.runningTheGame(Fighter.character1);
											Fighter.checkWonGame();
											if(Fighter.playerSkills.get(Fighter.character1).getHealth() <= 0)
												{
													move = true;
												}
										}
			            		}
								Fighter.movingCharacter();
								characterRow = Fighter.playerSkills.get(Fighter.character).getCurrentRowPos();
								characterCol = Fighter.playerSkills.get(Fighter.character).getCurrentColPos();
								differenceR = monsterRow - characterRow;
								differenceC = monsterCol - characterCol;
								positiveDifferenceR = Math.abs(differenceR);
								positiveDifferenceC = Math.abs(differenceC);
								if(positiveDifferenceR <= 1 && positiveDifferenceC <= 1)
								{
									move = false;
									while(move == false)
										{
											Fighter.runningTheGame(Fighter.character);
											Fighter.checkWonGame();
											if(Fighter.playerSkills.get(Fighter.character).getHealth() <= 0)
												{	
													move = true;
												}
										}
								}
								Fighter.movingECharacter();
							}
						else
							{
								Fighter.movingCharacter();
								monsterRow = Fighter.comSkills.get(Fighter.eCharacter).getCurrentRowPos();
								monsterCol = Fighter.comSkills.get(Fighter.eCharacter).getCurrentColPos();
								characterRow = Fighter.playerSkills.get(Fighter.character).getCurrentRowPos();
								characterCol = Fighter.playerSkills.get(Fighter.character).getCurrentColPos();
								differenceR = monsterRow - characterRow;
								differenceC = monsterCol - characterCol;
								positiveDifferenceR = Math.abs(differenceR);
								positiveDifferenceC = Math.abs(differenceC);
								if(positiveDifferenceR <= 1 && positiveDifferenceC <= 1)
								{
									move = false;
									while(move == false)
										{
											Fighter.runningTheGame(Fighter.character);
											Fighter.checkWonGame();
											if(Fighter.playerSkills.get(Fighter.character).getHealth() <= 0)
												{	
													move = true;
												}
										}
								}
								Fighter.movingCharacter1();
								monsterRow = Fighter.comSkills.get(Fighter.eCharacter).getCurrentRowPos();
								monsterCol = Fighter.comSkills.get(Fighter.eCharacter).getCurrentColPos();
								characterRow1 = Fighter.playerSkills.get(Fighter.character1).getCurrentRowPos();
								characterCol1 = Fighter.playerSkills.get(Fighter.character1).getCurrentColPos();
								differenceR1 = monsterRow - characterRow1;
								differenceC1 = monsterCol - characterCol1;
								positiveDifferenceR1 = Math.abs(differenceR1);
								positiveDifferenceC1 = Math.abs(differenceC1);
								if (positiveDifferenceR1 <= 1 && positiveDifferenceC1 <= 1)
			            		{
									move = false;
									while(move == false)
										{
											Fighter.runningTheGame(Fighter.character1);
											Fighter.checkWonGame();
											if(Fighter.playerSkills.get(Fighter.character1).getHealth() <= 0)
												{
													move = true;
												}
										}
			            		}
								Fighter.movingECharacter();
							}
						Fighter.movingCharacter();
						monsterRow = Fighter.comSkills.get(Fighter.eCharacter).getCurrentRowPos();
						monsterCol = Fighter.comSkills.get(Fighter.eCharacter).getCurrentColPos();
						characterRow = Fighter.playerSkills.get(Fighter.character).getCurrentRowPos();
						characterCol = Fighter.playerSkills.get(Fighter.character).getCurrentColPos();
						differenceR = monsterRow - characterRow;
						differenceC = monsterCol - characterCol;
						positiveDifferenceR = Math.abs(differenceR);
						positiveDifferenceC = Math.abs(differenceC);
						if(positiveDifferenceR <= 1 && positiveDifferenceC <= 1)
						{
							move = false;
							while(move == false)
								{
									Fighter.runningTheGame(Fighter.character);
									Fighter.checkWonGame();
									if(Fighter.playerSkills.get(Fighter.character).getHealth() <= 0)
										{	
											move = true;
										}
								}
						}
						Fighter.movingCharacter1();
						monsterRow = Fighter.comSkills.get(Fighter.eCharacter).getCurrentRowPos();
						monsterCol = Fighter.comSkills.get(Fighter.eCharacter).getCurrentColPos();
						characterRow1 = Fighter.playerSkills.get(Fighter.character1).getCurrentRowPos();
						characterCol1 = Fighter.playerSkills.get(Fighter.character1).getCurrentColPos();
						differenceR1 = monsterRow - characterRow1;
						differenceC1 = monsterRow - characterCol1;
						positiveDifferenceR1 = Math.abs(differenceR1);
						positiveDifferenceC1 = Math.abs(differenceC1);
						if (positiveDifferenceR1 <= 1 && positiveDifferenceC1 <= 1)
	            		{
							move = false;
							while(move == false)
								{
									Fighter.runningTheGame(Fighter.character1);
									Fighter.checkWonGame();
									if(Fighter.playerSkills.get(Fighter.character1).getHealth() <= 0)
										{
											move = true;
										}
								}
	            		}
					}
				System.exit(0);
			}

	}