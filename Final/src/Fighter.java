import java.util.ArrayList;
import java.util.Scanner;


public class Fighter
	{
	static Scanner spot = new Scanner(System.in);
	static Scanner user1nput = new Scanner (System.in);
	static int character1;
	static int character;
	static ArrayList<Fighter> comSkills = new ArrayList<Fighter>();
	static ArrayList<Fighter> playerSkills = new ArrayList<Fighter>();
	static ArrayList<Fighter> arenaPlayers = new ArrayList<Fighter>();
	static int eCharacter;
	private int armorClass;
	private int health;
	private String name;
	private int speed;
	private int initiative;
	private int location;
	private int currentColPos;
	private int currentRowPos;
	public Fighter(String n ,int aC, int h, int s, int i, int l, int cCP, int cRP)
		{
			name = n;
			armorClass = aC;
			health = h;
			speed = s;
			initiative = i;
			location = l;
			currentColPos = cCP;
			currentRowPos = cRP;
		}
	public static void addCharacter()
		{
			playerSkills.add(new Fighter("Arrim", 17, 28, 8, 18, -1, -1, -1));
			playerSkills.add(new Fighter("Bolba", 20, 22, 6, 14, -1, -1, -1));
			playerSkills.add(new Fighter("Amiar", 16, 20, 7, 17, -1, -1, -1));
			playerSkills.add(new Fighter("Ajaxx", 19, 26, 6, 14, -1, -1, -1));
			comSkills.add(new Fighter("Smaug", 17, 52, 7, 18, -1, -1, -1));
			comSkills.add(new Fighter("Ettin", 14, 88, 6, 13, -1, -1, -1));
			comSkills.add(new Fighter("Myrna", 13, 45, 6, 14, -1, -1, -1));
			comSkills.add(new Fighter("Arcam", 18, 78, 3, 19, -1, -1, -1));
		}
	public static void userPlayerMaker()
		{
			System.out.println("Which character do you want? (1) Wood Elf Ranger (Arrim) (2) Dwarven Warrior (Bolba) (3) Dark-Elf Theif (Amiar) (4) Human Knight (Ajaxx)");
			character = user1nput.nextInt();
			character--;
			character1 = (int)(Math.random()* 3)+1;
			if(playerSkills.get(character).getName().equals(playerSkills.get(character1).getName()))
				{
					System.out.println("You had two of the same characters, so it randomly generated a new one.");
					int newRoll = (int)(Math.random() * 4) -2;
					character1 += newRoll;
				}
			System.out.println("Your players are " + playerSkills.get(character).getName() + ", its defense is " + playerSkills.get(character).getArmorClass() + ", its health is " + playerSkills.get(character).getHealth() + ", and its speed is " + playerSkills.get(character).getSpeed() + ".");
			System.out.println("and " + playerSkills.get(character1).getName() + ", its defense is " + playerSkills.get(character1).getArmorClass() + ", its health is " + playerSkills.get(character1).getHealth() + ", and its speed is " + playerSkills.get(character1).getSpeed() + ".");
		}
	public static void comPlayerMaker()
		{
			System.out.println("Which character do you want for a bad guy? (1) Red Dragon (Smaug) (2) Frost Giant (Ettin) (3) Dragon Witch (Myrna) (4) The Beholder (Arcam)");
			eCharacter = user1nput.nextInt();
			eCharacter--;
			System.out.println("Your enemy player is " + comSkills.get(eCharacter).getName() + ", its defense is " + comSkills.get(eCharacter).getArmorClass() + ", its health is " + comSkills.get(eCharacter).getHealth() + ", and its speed is " + comSkills.get(eCharacter).getSpeed() + ".");
		}
	public static void arenaPlayers()
		{
			arenaPlayers.add(new Fighter(playerSkills.get(character).getName(), playerSkills.get(character).getArmorClass(), playerSkills.get(character).getHealth(), playerSkills.get(character).getSpeed(), playerSkills.get(character).getInitiative(), playerSkills.get(character).getLocation(), playerSkills.get(character).getCurrentColPos(), playerSkills.get(character).getCurrentRowPos()));
			arenaPlayers.add(new Fighter(playerSkills.get(character1).getName(), playerSkills.get(character1).getArmorClass(), playerSkills.get(character1).getHealth(), playerSkills.get(character1).getSpeed(), playerSkills.get(character1).getInitiative(), playerSkills.get(character1).getLocation(), playerSkills.get(character1).getCurrentColPos(), playerSkills.get(character1).getCurrentRowPos()));
			arenaPlayers.add(new Fighter(comSkills.get(eCharacter).getName(), comSkills.get(eCharacter).getArmorClass(), comSkills.get(eCharacter).getHealth(), comSkills.get(eCharacter).getSpeed(), comSkills.get(eCharacter).getInitiative(), comSkills.get(eCharacter).getLocation(), comSkills.get(eCharacter).getCurrentColPos(), comSkills.get(eCharacter).getCurrentRowPos()));
		}
	public static void displayOnBoard()
		{
			System.out.println("What row and column would you like to place " + playerSkills.get(character).getName() + " in? (Preferably G)");
			String place = spot.nextLine();
			int characterPlace = 0;
			switch(place.substring(0, 1))
			{
				case "A":
				case "a":
					characterPlace = 0;
					break;
				case "B":
				case "b":
					characterPlace = 1;
					break;
				case "C":
				case "c":
					characterPlace = 2;
					break;
				case "D":
				case "d":
					characterPlace = 3;
					break;
				case "E":
				case "e":
					characterPlace = 4;
					break;
				case "F":
				case "f":
					characterPlace = 5;
					break;
				case "G":
				case "g":
					characterPlace = 6;
					break;
			}
			playerSkills.get(character).setCurrentRowPos(characterPlace);
			int choice = Integer.parseInt(place.substring(1)) - 1;
			playerSkills.get(character).setCurrentColPos(choice);
			Board.board[playerSkills.get(character).getCurrentRowPos()][playerSkills.get(character).getCurrentColPos()] = playerSkills.get(character).getName();
			Board.display();
			System.out.println("What row and column would you like to place " + playerSkills.get(character1).getName() + " in? (Preferably G)");
			String place1 = spot.nextLine();
			int characterPlace1 = 0;
			switch(place1.substring(0, 1))
			{
				case "A":
				case "a":
					characterPlace1 = 0;
					break;
				case "B":
				case "b":
					characterPlace1 = 1;
					break;
				case "C":
				case "c":
					characterPlace1 = 2;
					break;
				case "D":
				case "d":
					characterPlace1 = 3;
					break;
				case "E":
				case "e":
					characterPlace1 = 4;
					break;
				case "F":
				case "f":
					characterPlace1 = 5;
					break;
				case "G":
				case "g":
					characterPlace1 = 6;
					break;
			}
			playerSkills.get(character1).setCurrentRowPos(characterPlace1);
			int choice1 = Integer.parseInt(place1.substring(1)) - 1;
			playerSkills.get(character1).setCurrentColPos(choice1);
			Board.board[characterPlace1][playerSkills.get(character1).getCurrentColPos()] = playerSkills.get(character1).getName();
			Board.display();
			System.out.println("What row and column would you like to place " + comSkills.get(eCharacter).getName() + " in? (Preferably A)");
			String place2 = spot.nextLine();
			int eCharacterPlace = 0;
			switch(place2.substring(0, 1))
			{
				case "A":
				case "a":
					eCharacterPlace = 0;
					break;
				case "B":
				case "b":
					eCharacterPlace = 1;
					break;
				case "C":
				case "c":
					eCharacterPlace = 2;
					break;
				case "D":
				case "d":
					eCharacterPlace = 3;
					break;
				case "E":
				case "e":
					eCharacterPlace = 4;
					break;
				case "F":
				case "f":
					eCharacterPlace = 5;
					break;
				case "G":
				case "g":
					eCharacterPlace = 6;
					break;
			}
			comSkills.get(eCharacter).setCurrentRowPos(eCharacterPlace);
			int choice2 = Integer.parseInt(place2.substring(1)) - 1;
			comSkills.get(eCharacter).setCurrentColPos(choice2);
			Board.board[comSkills.get(eCharacter).getCurrentRowPos()][comSkills.get(eCharacter).getCurrentColPos()] = comSkills.get(eCharacter).getName();
			Board.display();
		}
	public static void movingECharacter() throws InterruptedException
		{
			System.out.println("Now the bad guy will move.");
			int rowEMove = (int)(Math.random()*7);
			int colEMove = (int)(Math.random()*7);
			int rowDifference2 = Math.abs(rowEMove) - Math.abs(comSkills.get(eCharacter).getCurrentRowPos());
			int colDifference2 = Math.abs(colEMove) - Math.abs(comSkills.get(eCharacter).getCurrentColPos());
			int totalMovement = Math.abs(rowDifference2) + Math.abs(colDifference2);
			if(totalMovement > comSkills.get(eCharacter).getSpeed())
				{
					System.out.println("That is not a valid move. Move again.");
					Thread.sleep(1000);
					Fighter.movingECharacter();
					return;
				}
			else
				{
					(Board.board[comSkills.get(eCharacter).getCurrentRowPos()][comSkills.get(eCharacter).getCurrentColPos()]) = "     ";
					comSkills.get(eCharacter).setCurrentRowPos(rowEMove);
					comSkills.get(eCharacter).setCurrentColPos(colEMove);
					Board.board[rowEMove][colEMove] = comSkills.get(eCharacter).getName();
				}
			Thread.sleep(1000);
			Board.display();
		}
	public static void movingCharacter() throws InterruptedException
		{
				int newRow = playerSkills.get(character).getCurrentRowPos();
				int newCol = playerSkills.get(character).getCurrentColPos();
				System.out.println("Now " + playerSkills.get(character).getName() + " will move.");
				System.out.println("What row and column would you like to place " + playerSkills.get(character).getName() + " in?");
				String place = spot.nextLine();
				switch(place.substring(0, 1))
				{
					case "A":
					case "a":
						newRow = 0;
						break;
					case "B":
					case "b":
						newRow = 1;
						break;
					case "C":
					case "c":
						newRow = 2;
						break;
					case "D":
					case "d":
						newRow = 3;
						break;
					case "E":
					case "e":
						newRow = 4;
						break;
					case "F":
					case "f":
						newRow = 5;
						break;
					case "G":
					case "g":
						newRow = 6;
						break;
				}
				newCol = Integer.parseInt(place.substring(1)) - 1;
				int rowDifference = Math.abs(newRow) - Math.abs(playerSkills.get(character).getCurrentRowPos());
				int colDifference = Math.abs(newCol) - Math.abs(playerSkills.get(character).getCurrentColPos());
				int totalMovement = Math.abs(rowDifference) + Math.abs(colDifference);
				if(totalMovement > playerSkills.get(character).getSpeed())
					{
						System.out.println("That is not a valid move. Move again.");
						Thread.sleep(1000);
						Fighter.movingCharacter();
						return;
					}
				else
					{
						(Board.board[playerSkills.get(character).getCurrentRowPos()][playerSkills.get(character).getCurrentColPos()]) = "     ";
						playerSkills.get(character).setCurrentRowPos(newRow);
						playerSkills.get(character).setCurrentColPos(newCol);
						Board.board[playerSkills.get(character).getCurrentRowPos()][playerSkills.get(character).getCurrentColPos()] = playerSkills.get(character).getName();
					}
				Thread.sleep(1000);
				Board.display();
		}
	public static void movingCharacter1() throws InterruptedException
		{
				int newRow1 = playerSkills.get(character1).getCurrentRowPos();
				int newCol1 = playerSkills.get(character1).getCurrentColPos();
				System.out.println("Now " + playerSkills.get(character1).getName() + " will move.");
				System.out.println("What row and column would you like to place " + playerSkills.get(character1).getName() + " in?");
				String place1 = spot.nextLine();
				switch(place1.substring(0, 1))
					{
						case "A":
						case "a":
							newRow1 = 0;
							break;
						case "B":
						case "b":
							newRow1 = 1;
							break;
						case "C":
						case "c":
							newRow1 = 2;
							break;
						case "D":
						case "d":
							newRow1 = 3;
							break;
						case "E":
						case "e":
							newRow1 = 4;
							break;
						case "F":
						case "f":
							newRow1 = 5;
							break;
						case "G":
						case "g":
							newRow1 = 6;
							break;
					}
				newCol1 = Integer.parseInt(place1.substring(1)) - 1;
				int rowDifference1 = Math.abs(newRow1) - Math.abs(playerSkills.get(character1).getCurrentRowPos());
				int colDifference1 = Math.abs(newCol1) - Math.abs(playerSkills.get(character1).getCurrentColPos());
				int totalMovement = Math.abs(rowDifference1) + Math.abs(colDifference1);
				if(totalMovement > playerSkills.get(character1).getSpeed())
					{
						System.out.println("That is not a valid move. Move again.");
						Thread.sleep(1000);
						Fighter.movingCharacter1();
						return;
					}
				else
					{
						Board.board[playerSkills.get(character1).getCurrentRowPos()][playerSkills.get(character1).getCurrentColPos()] = "     ";
						playerSkills.get(character1).setCurrentRowPos(newRow1);
						playerSkills.get(character1).setCurrentColPos(newCol1);
						Board.board[playerSkills.get(character1).getCurrentRowPos()][playerSkills.get(character1).getCurrentColPos()] = playerSkills.get(character1).getName();
					}
				Thread.sleep(1000);
				Board.display();
		}
	public static void runningTheGame(int activeCharacter)
		{
			System.out.println("Now you will roll a 20 sided die and you have to get above the monster's defense.");
			Scanner userlnput = new Scanner(System.in);
			System.out.println("Hit r enter to roll");
			userlnput.nextLine();
			int dieRoll = (int)(Math.random()* 20)+1;
			dieRoll += 5;
			System.out.println("You rolled a " + dieRoll + ".");
			if(dieRoll > comSkills.get(eCharacter).getArmorClass())
				System.out.println("You hit :) :) :) :)!!!!");
			else
				System.out.println("You missed :( :( :( :( :(.");
			if(dieRoll > comSkills.get(eCharacter).getArmorClass())
				{
					System.out.println("Now it's time to roll the damage dice.");
					Scanner userlnput1 = new Scanner(System.in);
					System.out.println("Hit d enter for damage roll.");
					userlnput1.nextLine();
					if(activeCharacter == 2)
						{
							int darkElfRoll = (int)(Math.random()* 6)+1;
							darkElfRoll += 2;
							System.out.println("You did " + darkElfRoll + " damage on the first attack.");
							System.out.println("Now you attack with your off-hand weapon...");
							int darkElfRoll1 = (int)(Math.random()* 6)+1;
							darkElfRoll1 += 2;
							System.out.println("You did " + darkElfRoll1 + " on the off-hand attack.");
							System.out.println("You did " + darkElfRoll + " + " + darkElfRoll1 + " damage.");
							int totalRoll = darkElfRoll + darkElfRoll1;
							System.out.println("You did a total of " + totalRoll + " damage.");
							comSkills.get(eCharacter).setHealth(comSkills.get(eCharacter).getHealth() - totalRoll);
							System.out.println(comSkills.get(eCharacter).getHealth());
							System.out.println("... is the monster's new health.");
							if(comSkills.get(eCharacter).getHealth() <= 0)
							{
								System.out.println("Yay! You have won the game!");
								System.exit(0);
							}
						}
				else
					{
						int dieRoll1 = (int)(Math.random() * 8) + 1;
						System.out.println("The die roll is " + dieRoll1 + ".");
						if(dieRoll1 == 1)
							comSkills.get(eCharacter).setHealth(comSkills.get(eCharacter).getHealth() - dieRoll1);
						if(dieRoll1 == 2)
							comSkills.get(eCharacter).setHealth(comSkills.get(eCharacter).getHealth() - dieRoll1);
						if(dieRoll1 == 3)
							comSkills.get(eCharacter).setHealth(comSkills.get(eCharacter).getHealth() - dieRoll1);
						if(dieRoll1 == 4)
							comSkills.get(eCharacter).setHealth(comSkills.get(eCharacter).getHealth() - dieRoll1);
						if(dieRoll1 == 5)
							comSkills.get(eCharacter).setHealth(comSkills.get(eCharacter).getHealth() - dieRoll1);
						if(dieRoll1 == 6)
							comSkills.get(eCharacter).setHealth(comSkills.get(eCharacter).getHealth() - dieRoll1);
						if(dieRoll1 == 7)
							comSkills.get(eCharacter).setHealth(comSkills.get(eCharacter).getHealth() - dieRoll1);
						if(dieRoll1 == 8)
							comSkills.get(eCharacter).setHealth(comSkills.get(eCharacter).getHealth() - dieRoll1);
						dieRoll1 += 1;
						System.out.println(comSkills.get(eCharacter).getHealth());
						System.out.println("... is the monster's new health.");
						if(comSkills.get(eCharacter).getHealth() <= 0)
							{
								System.out.println("Yay! You have won the game!");
								System.exit(0);
							}
					}
				}
			else
				System.out.println("Sorry... it's the computer's turn now.");
			System.out.println();
			System.out.println("Now the monster will roll a 20 sided die to see if he will hit you.");
			int comRoll = (int)(Math.random()* 20)+1;
			comRoll += 3;
			System.out.println("Monster rolled a " + comRoll + ".");
			if(comRoll > playerSkills.get(character).getArmorClass())
				System.out.println("Monster hit :( :( :( :(.");
			else
				System.out.println("Monster missed :) :) :) :) :)!!!!");
			if(comRoll > playerSkills.get(character).getArmorClass())
				{
					if(eCharacter == 3)
						{
							int dieRoll3 = (int)(Math.random()*4)+1;
							System.out.println("His die roll is " + dieRoll3 + ".");
							if(dieRoll3 == 1)
								playerSkills.get(activeCharacter).setHealth(playerSkills.get(activeCharacter).getHealth() - 1);
							if(dieRoll3 == 2)
								playerSkills.get(activeCharacter).setHealth(playerSkills.get(activeCharacter).getHealth() - 2);
							if(dieRoll3 == 3)
								playerSkills.get(activeCharacter).setHealth(playerSkills.get(activeCharacter).getHealth() - 3);
							if(dieRoll3 == 4)
								playerSkills.get(activeCharacter).setHealth(playerSkills.get(activeCharacter).getHealth() - 4);
							System.out.println(playerSkills.get(activeCharacter).getHealth());
							int dieRoll4 = (int)(Math.random()*4)+1;
							System.out.println("His die roll is " + dieRoll4 + ".");
							if(dieRoll4 == 1)
								playerSkills.get(activeCharacter).setHealth(playerSkills.get(activeCharacter).getHealth() - 1);
							if(dieRoll4 == 2)
								playerSkills.get(activeCharacter).setHealth(playerSkills.get(activeCharacter).getHealth() - 2);
							if(dieRoll4 == 3)
								playerSkills.get(activeCharacter).setHealth(playerSkills.get(activeCharacter).getHealth() - 3);
							if(dieRoll4 == 4)
								playerSkills.get(activeCharacter).setHealth(playerSkills.get(activeCharacter).getHealth() - 4);
							System.out.println(playerSkills.get(activeCharacter).getHealth());
							int dieRoll5 = (int)(Math.random()*4)+1;
							System.out.println("His die roll is " + dieRoll5 + ".");
							if(dieRoll5 == 1)
								playerSkills.get(activeCharacter).setHealth(playerSkills.get(activeCharacter).getHealth() - 1);
							if(dieRoll5 == 2)
								playerSkills.get(activeCharacter).setHealth(playerSkills.get(activeCharacter).getHealth() - 2);
							if(dieRoll5 == 3)
								playerSkills.get(activeCharacter).setHealth(playerSkills.get(activeCharacter).getHealth() - 3);
							if(dieRoll5 == 4)
								playerSkills.get(activeCharacter).setHealth(playerSkills.get(activeCharacter).getHealth() - 4);
							System.out.println(playerSkills.get(activeCharacter).getHealth());
						}
					if(eCharacter == 0)
						{
							int redRoll = (int)(Math.random()*10) + 1;
							redRoll += 1;
							if(redRoll == 1)
								playerSkills.get(character).setHealth(playerSkills.get(character).getHealth() - 1);
							if(redRoll == 2)
								playerSkills.get(character).setHealth(playerSkills.get(character).getHealth() - 2);
							if(redRoll == 3)
								playerSkills.get(character).setHealth(playerSkills.get(character).getHealth() - 3);
							if(redRoll == 4)
								playerSkills.get(character).setHealth(playerSkills.get(character).getHealth() - 4);
							if(redRoll == 5)
								playerSkills.get(character).setHealth(playerSkills.get(character).getHealth() - 5);
							if(redRoll == 6)
								playerSkills.get(character).setHealth(playerSkills.get(character).getHealth() - 6);
							if(redRoll == 7)
								playerSkills.get(character).setHealth(playerSkills.get(character).getHealth() - 7);
							if(redRoll == 8)
								playerSkills.get(character).setHealth(playerSkills.get(character).getHealth() - 8);
							if(redRoll == 9)
								playerSkills.get(character).setHealth(playerSkills.get(character).getHealth() - 9);
							if(redRoll == 10)
								playerSkills.get(character).setHealth(playerSkills.get(character).getHealth() - 10);
							System.out.println(playerSkills.get(character).getHealth());
							System.out.println(".... is " + playerSkills.get(character).getName() + "'s new health.");
							int redRoll1 = (int)(Math.random()*10) + 1;
							redRoll1 += 1;
							if(redRoll1 == 1)
								playerSkills.get(character1).setHealth(playerSkills.get(character1).getHealth() - 1);
							if(redRoll1 == 2)
								playerSkills.get(character1).setHealth(playerSkills.get(character1).getHealth() - 2);
							if(redRoll1 == 3)
								playerSkills.get(character1).setHealth(playerSkills.get(character1).getHealth() - 3);
							if(redRoll1 == 4)
								playerSkills.get(character1).setHealth(playerSkills.get(character1).getHealth() - 4);
							if(redRoll1 == 5)
								playerSkills.get(character1).setHealth(playerSkills.get(character1).getHealth() - 5);
							if(redRoll1 == 6)
								playerSkills.get(character1).setHealth(playerSkills.get(character1).getHealth() - 6);
							if(redRoll1 == 7)
								playerSkills.get(character1).setHealth(playerSkills.get(character1).getHealth() - 7);
							if(redRoll1 == 8)
								playerSkills.get(character1).setHealth(playerSkills.get(character1).getHealth() - 8);
							if(redRoll1 == 9)
								playerSkills.get(character1).setHealth(playerSkills.get(character1).getHealth() - 9);
							if(redRoll1 == 10)
								playerSkills.get(character1).setHealth(playerSkills.get(character1).getHealth() - 10);
							System.out.println(playerSkills.get(character1).getHealth());
							System.out.println("... is " + playerSkills.get(character1).getName() + "'s new health.");
						}
				else
					{
						int dieRoll2 = (int)(Math.random()* 4)+1;
						System.out.println("His die roll is " + dieRoll2 + ".");
						if(dieRoll2 == 1)
							playerSkills.get(activeCharacter).setHealth(playerSkills.get(activeCharacter).getHealth() - 1);
						if(dieRoll2 == 2)
							playerSkills.get(activeCharacter).setHealth(playerSkills.get(activeCharacter).getHealth() - 2);
						if(dieRoll2 == 3)
							playerSkills.get(activeCharacter).setHealth(playerSkills.get(activeCharacter).getHealth() - 3);
						if(dieRoll == 4)
							playerSkills.get(activeCharacter).setHealth(playerSkills.get(activeCharacter).getHealth() - 4);
						System.out.println(playerSkills.get(activeCharacter).getHealth());
						System.out.println("... is your new health.");
					}
			}
		}
	public static boolean checkWonGame() throws InterruptedException
		{
			if(playerSkills.get(character).getHealth() <= 0 || playerSkills.get(character1).getHealth() <= 0)
				{
					System.out.println("Sorry, one of your guys is dead.");
					if(playerSkills.get(character).getHealth() <= 0)
						{
							playerSkills.remove(character);
							(Board.board[Fighter.playerSkills.get(Fighter.character).getCurrentRowPos()][Fighter.playerSkills.get(Fighter.character).getCurrentColPos()]) = "     ";
						}
					if(playerSkills.get(character1).getHealth() <= 0)
						{
							playerSkills.remove(character1);
							(Board.board[Fighter.playerSkills.get(Fighter.character1).getCurrentRowPos()][Fighter.playerSkills.get(Fighter.character1).getCurrentColPos()]) = "     ";
						}
					Fighter.movingECharacter();
				}
			else
				{
					
				}
			return true;
		}
	public int getArmorClass() {
		return armorClass;
	}
	public void setArmorClass(int armorClass) {
		this.armorClass = armorClass;
	}
	public int getHealth() {
		return health;
	}
	public void setHealth(int health) {
		this.health = health;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getInitiative() {
		return initiative;
	}
	public void setInitiative(int initiative) {
		this.initiative = initiative;
	}
	public int getLocation() {
		return location;
	}
	public void setLocation(int location) {
		this.location = location;
	}
	public int getCurrentColPos() {
		return currentColPos;
	}
	public void setCurrentColPos(int currentColPos) {
		this.currentColPos = currentColPos;
	}
	public int getCurrentRowPos() {
		return currentRowPos;
	}
	public void setCurrentRowPos(int currentRowPos) {
		this.currentRowPos = currentRowPos;
	}
	}