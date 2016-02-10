import java.util.ArrayList;
import java.util.Scanner;


public class Fighter
	{
	static Scanner user1nput = new Scanner (System.in);
	static int character1;
	static int character;
	static ArrayList<Fighter> comSkills = new ArrayList<Fighter>();
	static ArrayList<Fighter> playerSkills = new ArrayList<Fighter>();
	static ArrayList<Fighter> arenaPlayers = new ArrayList<Fighter>();
	static int dieRoll1 = (int)(Math.random()* 6)+1;
	static int eCharacter1;
	static int eCharacter;
	private int defense;
	private int health;
	private String name;
	private int speed;
	private int intiative;
	static boolean com;
	public Fighter(String n ,int d, int h, int s, int i)
		{
			name = n;
			defense = d;
			health = h;
			speed = s;
			intiative = i;
		}
	public static void addCharacter()
		{
			playerSkills.add(new Fighter("Wood Elf Archer", 16, 14, 40, 18));
			playerSkills.add(new Fighter("Dwarven Cleric", 16, 16, 30, 14));
			playerSkills.add(new Fighter("Half-Elf Theif", 14, 14, 35, 17));
			playerSkills.add(new Fighter("Human Paladin", 18, 20, 30, 14));
			comSkills.add(new Fighter("Vampire King", 13, 20, 30, 15));
			comSkills.add(new Fighter("Kobold", 14, 10, 30, 13));
			comSkills.add(new Fighter("Cultists", 15, 12, 30, 14));
			comSkills.add(new Fighter("The Beholder", 18, 30, 30, 19));
		}
	public static void userPlayerMaker()
		{
			System.out.println("Which character do you want? (1) Wood Elf Ranger (2) Dwarven Cleric (3) Half-Elf Theif (4) Human Paladin");
			character = user1nput.nextInt();
			character--;
			character1 = (int)(Math.random()* 4)+1;
			System.out.println("Your players are a " + playerSkills.get(character).getName() + ", its defense is " + playerSkills.get(character).getDefense() + ", its health is " + playerSkills.get(character).getHealth() + ", and its speed is " + playerSkills.get(character).getSpeed() + ".");
			System.out.println("and a " + playerSkills.get(character1).getName() + ", its defense is " + playerSkills.get(character1).getDefense() + ", its health is " + playerSkills.get(character1).getHealth() + ", and its speed is " + playerSkills.get(character1).getSpeed() + ".");
		}
	public static void comPlayerMaker()
		{
			System.out.println("Which character do you want for a bad guy? (1) Vampire King (2) Kobold (3) Cultist (4) The Beholder");
			eCharacter = user1nput.nextInt();
			eCharacter--;
			System.out.println("Your enemy players are a " + comSkills.get(eCharacter).getName() + ", its defense is " + comSkills.get(eCharacter).getDefense() + ", its health is " + comSkills.get(eCharacter).getHealth() + ", and its speed is " + comSkills.get(eCharacter).getSpeed() + ".");
			System.out.println("and a " + comSkills.get(eCharacter1).getName() + ", its defense is " + comSkills.get(eCharacter1).getDefense() + ", its health is " + comSkills.get(eCharacter1).getHealth() + ", and its speed is " + comSkills.get(eCharacter1).getSpeed() + ".");
		}
	public static void newPlayers()
		{
			arenaPlayers.add(new Fighter(playerSkills.get(character).getName(), playerSkills.get(character).getDefense(), playerSkills.get(character).getHealth(), playerSkills.get(character).getSpeed(), playerSkills.get(character).getIntiative()));
			arenaPlayers.add(new Fighter(playerSkills.get(character1).getName(), playerSkills.get(character1).getDefense(), playerSkills.get(character1).getHealth(), playerSkills.get(character1).getSpeed(), playerSkills.get(character1).getIntiative()));
			arenaPlayers.add(new Fighter(comSkills.get(eCharacter).getName(), comSkills.get(eCharacter).getDefense(), comSkills.get(eCharacter).getHealth(), comSkills.get(eCharacter).getSpeed(), comSkills.get(eCharacter).getIntiative()));
			arenaPlayers.add(new Fighter(comSkills.get(eCharacter1).getName(), comSkills.get(eCharacter1).getDefense(), comSkills.get(eCharacter1).getHealth(), comSkills.get(eCharacter1).getSpeed(), comSkills.get(eCharacter1).getIntiative()));
		}
	public static void determiningTheCharacter()
		{
			System.out.println("Now it's time to battle!");
			System.out.println("The Beholder rolls four times, so be prepared...");
		}
	public static void runningTheGame()
		{
			System.out.println("Now you will roll a 20 sided die and you have to get above the monster's defense.");
			Scanner userlnput = new Scanner(System.in);
			System.out.println("Hit r enter to roll");
			String r = userlnput.nextLine();
			int dieRoll = (int)(Math.random()* 20)+1;
			System.out.println("You rolled a: " + dieRoll + ".");
			if(dieRoll > comSkills.get(eCharacter).getDefense())
				System.out.println("You hit :) :) :) :)!!!!");
			else
				System.out.println("You missed :( :( :( :( :(.");
			if(dieRoll > comSkills.get(eCharacter).getDefense())
				{
					System.out.println("Now it's time to roll the damage dice.");
					Scanner userlnput1 = new Scanner(System.in);
					System.out.println("Hit d enter for damage roll.");
					String d = userlnput1.nextLine();
					if(dieRoll == 20)
						{
							System.out.println("When you roll a 20 it does double damage, so you did " + dieRoll1*2 + ".");
							comSkills.get(eCharacter).setHealth(comSkills.get(eCharacter).getHealth() - dieRoll);
						}
				else
					{
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
					}
					System.out.println(comSkills.get(eCharacter).getHealth());
					System.out.println("... Is the monster's new health.");
				}
			else
				System.out.println("Sorry... it's the computer's turn now.");
			System.out.println();
			System.out.println("Now the monster will roll a 20 sided die to see if he will hit you.");
			int comRoll = (int)(Math.random()* 20)+1;
			System.out.println("Monster rolled a: " + comRoll + ".");
			if(comRoll > playerSkills.get(character).getDefense())
				System.out.println("Monster hit :( :( :( :(.");
			else
				System.out.println("Monster missed :) :) :) :) :)!!!!");
			if(comRoll > playerSkills.get(character).getDefense())
				{
					if(eCharacter == 3 || eCharacter1 == 3)
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
						System.out.println("....Is your new health.");
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
	public int getDefense()
		{
			return defense;
		}
	public void setDefense(int defense)
		{
			this.defense = defense;
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
	public int getIntiative()
		{
			return intiative;
		}
	public void setIntiative(int intiative)
		{
			this.intiative = intiative;
		}
	}