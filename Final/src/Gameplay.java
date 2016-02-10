import java.util.ArrayList;
import java.util.Scanner;


public class Gameplay
	{
	static Scanner user1nput = new Scanner (System.in);
	static int character1;
	static int character;
	static ArrayList<Gameplay>comSkills = new ArrayList<Gameplay>();
	static ArrayList<Gameplay>playerSkills = new ArrayList<Gameplay>();
	static ArrayList<Gameplay> arenaPlayers = new ArrayList<Gameplay>();
	static int dieRoll1 = (int)(Math.random()* 6)+1;
	static int eCharacter1;
	static int eCharacter;
	private int defense;
	private int health;
	private String name;
	private int speed;
	static int player;
	static boolean com;
	public Gameplay(String n ,int d, int h, int s)
		{
			name = n;
			defense = d;
			health = h;
			speed = s;
		}
	public static void addCharacter()
		{
			playerSkills.add(new Gameplay("Wood Elf Archer", 16, 14, 40));
			playerSkills.add(new Gameplay("Dwarven Cleric", 16, 16, 30));
			playerSkills.add(new Gameplay("Half-Elf Theif", 14, 14, 35));
			playerSkills.add(new Gameplay("Human Paladin", 18, 20, 30));
			comSkills.add(new Gameplay("Vampire King", 13, 20, 30));
			comSkills.add(new Gameplay("Kobold", 14, 10, 30));
			comSkills.add(new Gameplay("Cultists", 15, 12, 30));
			comSkills.add(new Gameplay("The Beholder", 18, 30, 30));
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
	public static void roleInitiative()
		{
			System.out.println("Now we rold for initiative to see who goes first in the battle.");
			int inti1 = (int)(Math.random()* 20)+1;
			System.out.println(playerSkills.get(character).getName() + " got a " + inti1 + ".");
			int inti2 = (int)(Math.random()* 20)+1;
			System.out.println(playerSkills.get(character1).getName() + " got a " + inti2 + ".");
			int inti3 = (int)(Math.random()* 20)+1;
			System.out.println(comSkills.get(eCharacter).getName() + " got a " + inti3 + ".");
			int inti4 = (int)(Math.random()* 20)+1;
			System.out.println(comSkills.get(eCharacter1).getName() + " got a " + inti4 + ".");
		}
	public static void determiningTheCharacter()
		{
			System.out.println("Now it's time to battle!");
			System.out.println("The Beholder rolls four times, so be prepared...");
		}
	public static void runningTheGame()
		{
			System.out.println("Now the you will roll a 20 sided die and you have to get above the monster's defense.");
			Scanner userlnput = new Scanner(System.in);
			System.out.println("Hit r enter to roll");
			String r = userlnput.nextLine();
			int dieRoll = (int)(Math.random()* 20)+1;
			System.out.println("You rolled a: " + dieRoll + ".");
			if(dieRoll > comSkills.get(player).getDefense())
				System.out.println("You hit :) :) :) :)!!!!");
			else
				System.out.println("You missed :( :( :( :( :(.");
			if(dieRoll > comSkills.get(player).getDefense())
				{
					System.out.println("Now it's time to roll the damage dice.");
					Scanner userlnput1 = new Scanner(System.in);
					System.out.println("Hit d enter for damage roll.");
					String d = userlnput1.nextLine();
					if(dieRoll == 20)
						{
							System.out.println("When you roll a 20 it does double damage, so you did " + dieRoll1*2 + ".");
							comSkills.get(player).setHealth(comSkills.get(player).getHealth() - dieRoll*2);
						}
				else
					{
						System.out.println("The die roll is " + dieRoll1 + ".");
						if(dieRoll1 == 1)
							comSkills.get(player).setHealth(comSkills.get(player).getHealth() - dieRoll1);
						if(dieRoll1 == 2)
							comSkills.get(player).setHealth(comSkills.get(player).getHealth() - dieRoll1);
						if(dieRoll1 == 3)
							comSkills.get(player).setHealth(comSkills.get(player).getHealth() - dieRoll1);
						if(dieRoll1 == 4)
							comSkills.get(player).setHealth(comSkills.get(player).getHealth() - dieRoll1);
						if(dieRoll1 == 5)
							comSkills.get(player).setHealth(comSkills.get(player).getHealth() - dieRoll1);
						if(dieRoll1 == 6)
							comSkills.get(player).setHealth(comSkills.get(player).getHealth() - dieRoll1);
					}
					System.out.println(comSkills.get(player).getHealth());
					System.out.println("... Is the monster's new health.");
				}
			else
				System.out.println("Sorry... it's the computer's turn now.");
			System.out.println();
			System.out.println("Now the monster will roll a 20 sided die to see if he will hit you.");
			int comRoll = (int)(Math.random()* 20)+1;
			System.out.println("Monster rolled a: " + comRoll + ".");
			if(comRoll > playerSkills.get(player).getDefense())
				System.out.println("Monster hit :( :( :( :(.");
			else
				System.out.println("Monster missed :) :) :) :) :)!!!!");
			if(comRoll > playerSkills.get(player).getDefense())
				{
					if(eCharacter1 == 3)
						{
							int dieRoll3 = (int)(Math.random()*4)+1;
							System.out.println("His die roll is " + dieRoll3 + ".");
							if(dieRoll3 == 1)
								playerSkills.get(player).setHealth(playerSkills.get(player).getHealth() - 1);
							if(dieRoll3 == 2)
								playerSkills.get(player).setHealth(playerSkills.get(player).getHealth() - 2);
							if(dieRoll3 == 3)
								playerSkills.get(player).setHealth(playerSkills.get(player).getHealth() - 3);
							if(dieRoll3 == 4)
								playerSkills.get(player).setHealth(playerSkills.get(player).getHealth() - 4);
							System.out.println(playerSkills.get(player).getHealth());
							int dieRoll4 = (int)(Math.random()*4)+1;
							System.out.println("His die roll is " + dieRoll4 + ".");
							if(dieRoll4 == 1)
								playerSkills.get(player).setHealth(playerSkills.get(player).getHealth() - 1);
							if(dieRoll4 == 2)
								playerSkills.get(player).setHealth(playerSkills.get(player).getHealth() - 2);
							if(dieRoll4 == 3)
								playerSkills.get(player).setHealth(playerSkills.get(player).getHealth() - 3);
							if(dieRoll4 == 4)
								playerSkills.get(player).setHealth(playerSkills.get(player).getHealth() - 4);
							System.out.println(playerSkills.get(player).getHealth());
							int dieRoll5 = (int)(Math.random()*4)+1;
							System.out.println("His die roll is " + dieRoll5 + ".");
							if(dieRoll5 == 1)
								playerSkills.get(player).setHealth(playerSkills.get(player).getHealth() - 1);
							if(dieRoll5 == 2)
								playerSkills.get(player).setHealth(playerSkills.get(player).getHealth() - 2);
							if(dieRoll5 == 3)
								playerSkills.get(player).setHealth(playerSkills.get(player).getHealth() - 3);
							if(dieRoll5 == 4)
								playerSkills.get(player).setHealth(playerSkills.get(player).getHealth() - 4);
							System.out.println(playerSkills.get(player).getHealth());
							int dieRoll6 = (int)(Math.random()*4)+1;
							System.out.println("His die roll is " + dieRoll6 + ".");
							if(dieRoll6 == 1)
								playerSkills.get(player).setHealth(playerSkills.get(player).getHealth() - 1);
							if(dieRoll6 == 2)
								playerSkills.get(player).setHealth(playerSkills.get(player).getHealth() - 2);
							if(dieRoll6 == 3)
								playerSkills.get(player).setHealth(playerSkills.get(player).getHealth() - 3);
							if(dieRoll6 == 4)
								playerSkills.get(player).setHealth(playerSkills.get(player).getHealth() - 4);
							System.out.println(playerSkills.get(player).getHealth());
						}
				else
					{
						int dieRoll2 = (int)(Math.random()* 4)+1;
						System.out.println("His die roll is " + dieRoll2 + ".");
						if(dieRoll2 == 1)
							playerSkills.get(player).setHealth(playerSkills.get(player).getHealth() - 1);
						if(dieRoll2 == 2)
							playerSkills.get(player).setHealth(playerSkills.get(player).getHealth() - 2);
						if(dieRoll2 == 3)
							playerSkills.get(player).setHealth(playerSkills.get(player).getHealth() - 3);
						if(dieRoll == 4)
							playerSkills.get(player).setHealth(playerSkills.get(player).getHealth() - 4);
						System.out.println(playerSkills.get(player).getHealth());
						System.out.println("....Is your new health.");
					}
			}
		}
	public static boolean checkWonGame()
		{
			if(comSkills.get(player).getHealth() <= 0)
				{
					System.out.println("Yay! You have won the game!");
					System.exit(0);
				}
			else
				
			if(playerSkills.get(player).getHealth() <= 0)
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
	}