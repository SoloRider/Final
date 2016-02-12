import java.util.ArrayList;
import java.util.Scanner;


public class Fighter
	{
	static Scanner user1nput = new Scanner (System.in);
	static int character1;
	static int character;
	static int characterPlace = 0;
	static int characterPlace1 = 0;
	static int eCharacterPlace = 0;
	static ArrayList<Fighter> comSkills = new ArrayList<Fighter>();
	static ArrayList<Fighter> playerSkills = new ArrayList<Fighter>();
	static ArrayList<Fighter> arenaPlayers = new ArrayList<Fighter>();
	static int dieRoll1 = (int)(Math.random()* 8)+1;
	static int eCharacter;
	private int armorClass;
	private int health;
	private String name;
	private int speed;
	private int initiative;
	static boolean com;
	public Fighter(String n ,int aC, int h, int s, int i)
		{
			name = n;
			armorClass = aC;
			health = h;
			speed = s;
			initiative = i;
		}
	public static void addCharacter()
		{
			playerSkills.add(new Fighter("Arrim", 17, 22, 8, 18));
			playerSkills.add(new Fighter("Bolba", 22, 16, 6, 14));
			playerSkills.add(new Fighter("Amiar", 16, 14, 7, 17));
			playerSkills.add(new Fighter("Ajaxx", 19, 20, 6, 14));
			comSkills.add(new Fighter("Smaug", 17, 52, 7, 18));
			comSkills.add(new Fighter("Ettin", 14, 88, 6, 13));
			comSkills.add(new Fighter("Myrna", 13, 45, 6, 14));
			comSkills.add(new Fighter("Arcam", 18, 78, 3, 19));
		}
	public static void userPlayerMaker()
		{
			System.out.println("Which character do you want? (1) Wood Elf Ranger (2) Dwarven Warrior (3) Dark-Elf Theif (4) Human Knight");
			character = user1nput.nextInt();
			character--;
			character1 = (int)(Math.random()* 3)+1;
			System.out.println("Your players are " + playerSkills.get(character).getName() + ", its defense is " + playerSkills.get(character).getArmorClass() + ", its health is " + playerSkills.get(character).getHealth() + ", and its speed is " + playerSkills.get(character).getSpeed() + ".");
			System.out.println("and " + playerSkills.get(character1).getName() + ", its defense is " + playerSkills.get(character1).getArmorClass() + ", its health is " + playerSkills.get(character1).getHealth() + ", and its speed is " + playerSkills.get(character1).getSpeed() + ".");
		}
	public static void comPlayerMaker()
		{
			System.out.println("Which character do you want for a bad guy? (1) Red Dragon (2) Frost Giant (3) Dragon Witch (4) The Beholder");
			eCharacter = user1nput.nextInt();
			eCharacter--;
			System.out.println("Your enemy player is " + comSkills.get(eCharacter).getName() + ", its defense is " + comSkills.get(eCharacter).getArmorClass() + ", its health is " + comSkills.get(eCharacter).getHealth() + ", and its speed is " + comSkills.get(eCharacter).getSpeed() + ".");
		}
	public static void newPlayers()
		{
			arenaPlayers.add(new Fighter(playerSkills.get(character).getName(), playerSkills.get(character).getArmorClass(), playerSkills.get(character).getHealth(), playerSkills.get(character).getSpeed(), playerSkills.get(character).getInitiative()));
			arenaPlayers.add(new Fighter(playerSkills.get(character1).getName(), playerSkills.get(character1).getArmorClass(), playerSkills.get(character1).getHealth(), playerSkills.get(character1).getSpeed(), playerSkills.get(character1).getInitiative()));
			arenaPlayers.add(new Fighter(comSkills.get(eCharacter).getName(), comSkills.get(eCharacter).getArmorClass(), comSkills.get(eCharacter).getHealth(), comSkills.get(eCharacter).getSpeed(), comSkills.get(eCharacter).getInitiative()));
		}
	public static void displayOnBoard()
		{
			Scanner spot = new Scanner(System.in);
			System.out.println("What column and row would you like to place " + playerSkills.get(character).getName() + " in? (Preferably G)");
			String place = spot.nextLine();
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
			int choice = Integer.parseInt(place.substring(1)) - 1;
			(Board.board[characterPlace][choice % 10]) = playerSkills.get(character).getName();
			Board.display();
			System.out.println("What column and row would you like to place " + playerSkills.get(character1).getName() + " in? (Preferably G)");
			String place1 = spot.nextLine();
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
			int choice1 = Integer.parseInt(place1.substring(1)) - 1;
			(Board.board[characterPlace1][choice1 % 10]) = playerSkills.get(character1).getName();
			Board.display();
			System.out.println("What column and row would you like to place " + comSkills.get(eCharacter).getName() + " in? (Preferably A)");
			String place2 = spot.nextLine();
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
			int choice2 = Integer.parseInt(place2.substring(1)) - 1;
			(Board.board[eCharacterPlace][choice2 % 10]) = comSkills.get(eCharacter).getName();
			Board.display();
		}
	public static void movingECharacters()
		{
			System.out.println("Now the bad guy will move.");
			if(comSkills.get(eCharacter).getInitiative() > playerSkills.get(character).getInitiative() && comSkills.get(eCharacter).getInitiative() > playerSkills.get(character1).getInitiative())
				{
					int colEMove = (int)(Math.random()*6);
					int rowEMove = (int)(Math.random()*6);
					Board.board[colEMove][rowEMove] = comSkills.get(eCharacter).getName();
				}
		}
	public static void runningTheGame()
		{
			System.out.println("Now you will roll a 20 sided die and you have to get above the monster's defense.");
			Scanner userlnput = new Scanner(System.in);
			System.out.println("Hit r enter to roll");
			String r = userlnput.nextLine();
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
					String d = userlnput1.nextLine();
					if(character == 2 || character1 == 2)
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
						}
				else
					{
						dieRoll1 += 1;
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
						System.out.println(comSkills.get(eCharacter).getHealth());
						System.out.println("... is the monster's new health.");
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
								playerSkills.get(character).setHealth(playerSkills.get(character).getHealth() - 1);
							if(dieRoll3 == 2)
								playerSkills.get(character).setHealth(playerSkills.get(character).getHealth() - 2);
							if(dieRoll3 == 3)
								playerSkills.get(character).setHealth(playerSkills.get(character).getHealth() - 3);
							if(dieRoll3 == 4)
								playerSkills.get(character).setHealth(playerSkills.get(character).getHealth() - 4);
							System.out.println(playerSkills.get(character).getHealth());
							int dieRoll4 = (int)(Math.random()*4)+1;
							System.out.println("His die roll is " + dieRoll4 + ".");
							if(dieRoll4 == 1)
								playerSkills.get(character).setHealth(playerSkills.get(character).getHealth() - 1);
							if(dieRoll4 == 2)
								playerSkills.get(character).setHealth(playerSkills.get(character).getHealth() - 2);
							if(dieRoll4 == 3)
								playerSkills.get(character).setHealth(playerSkills.get(character).getHealth() - 3);
							if(dieRoll4 == 4)
								playerSkills.get(character).setHealth(playerSkills.get(character).getHealth() - 4);
							System.out.println(playerSkills.get(character).getHealth());
							int dieRoll5 = (int)(Math.random()*4)+1;
							System.out.println("His die roll is " + dieRoll5 + ".");
							if(dieRoll5 == 1)
								playerSkills.get(character).setHealth(playerSkills.get(character).getHealth() - 1);
							if(dieRoll5 == 2)
								playerSkills.get(character).setHealth(playerSkills.get(character).getHealth() - 2);
							if(dieRoll5 == 3)
								playerSkills.get(character).setHealth(playerSkills.get(character).getHealth() - 3);
							if(dieRoll5 == 4)
								playerSkills.get(character).setHealth(playerSkills.get(character).getHealth() - 4);
							System.out.println(playerSkills.get(character).getHealth());
							int dieRoll6 = (int)(Math.random()*4)+1;
							System.out.println("His die roll is " + dieRoll6 + ".");
							if(dieRoll6 == 1)
								playerSkills.get(character).setHealth(playerSkills.get(character).getHealth() - 1);
							if(dieRoll6 == 2)
								playerSkills.get(character).setHealth(playerSkills.get(character).getHealth() - 2);
							if(dieRoll6 == 3)
								playerSkills.get(character).setHealth(playerSkills.get(character).getHealth() - 3);
							if(dieRoll6 == 4)
								playerSkills.get(character).setHealth(playerSkills.get(character).getHealth() - 4);
							System.out.println(playerSkills.get(character).getHealth());
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
							playerSkills.get(character).setHealth(playerSkills.get(character).getHealth() - 1);
						if(dieRoll2 == 2)
							playerSkills.get(character).setHealth(playerSkills.get(character).getHealth() - 2);
						if(dieRoll2 == 3)
							playerSkills.get(character).setHealth(playerSkills.get(character).getHealth() - 3);
						if(dieRoll == 4)
							playerSkills.get(character).setHealth(playerSkills.get(character).getHealth() - 4);
						System.out.println(playerSkills.get(character).getHealth());
						System.out.println("... is your new health.");
					}
			}
		}
	public static boolean checkWonGame()
		{
			if(comSkills.get(eCharacter).getHealth() <= 0)
				{
					System.out.println("Yay! You have won the game!");
					System.exit(0);
				}
			else
				
			if(playerSkills.get(character).getHealth() <= 0)
				{
					System.out.println("Sorry, you have lost the game.");
					System.exit(0);
				}
			else
				{
					
				}
			return true;
		}
	public int getArmorClass()
		{
			return armorClass;
		}
	public void setArmorClass(int armorClass)
		{
			this.armorClass = armorClass;
		}
	public int getHealth()
		{
			return health;
		}
	public void setHealth(int health)
		{
			this.health = health;
		}
	public String getName()
		{
			return name;
		}
	public void setName(String name)
		{
			this.name = name;
		}
	public int getSpeed()
		{
			return speed;
		}
	public void setSpeed(int speed)
		{
			this.speed = speed;
		}
	public int getInitiative()
		{
			return initiative;
		}
	public void setInitiative(int intiative)
		{
			this.initiative = intiative;
		}
	}