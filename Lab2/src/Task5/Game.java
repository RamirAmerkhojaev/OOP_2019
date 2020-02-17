package Task5;
import java.util.*; 

enum AllPick{
	
	Earthshaker,
	Tidehunter,
	Sniper,
	Dazzle,
	NaturesProphet,
	
}

public class Game {

	AllPick pick;
	private String select;
	
	public Game(AllPick pick) 
	{
		this.pick = pick;
	}
	
	public String getSelect() {
		return select;
	}
	public void setSelect(String select){
		this.select = select;
	}
	
	public void ChooseYourHero() {
		switch(pick) {
		case Earthshaker:
			System.out.println("One of the best disablers in Dota 2.");
		    System.out.println("He's good against quantitative heroes(Phantom Lancer, Broodmother etc).");
     		System.out.println("Use his ultimation for antipushing of during big fightings.");
		break;
		case Tidehunter:
			System.out.println("Best initiator in Dota 2. It's useful pick him if you're solo hardliner.");
			System.out.println("It's easy to control this hero, so he'll be suitable for beginners.");
			System.out.println("His ultimation disable all characters around him, use this ability during fightings.");
		break;
		case Sniper:
			System.out.println("Hero with the biggest range in Dota 2. He's good against melee characters.");
		    System.out.println("Generally he inflict damage by physical attacks, so it'll bew useful to buy");
			System.out.println("those artifacts for him, which increase the damage and allow escape from battlefield.");
		break;
		case Dazzle:
			System.out.println("One of the most popular supports and healers in Dota 2. His abilities increase survival.");
			System.out.println("of teammates during fightings. His second ability SHALLOW GRAVE Imposes sacred protection");
			System.out.println("on an ally that prevents him from dying. Don't pick him against AXE or ANCIENT APPARITION!!!");
		break;
		case NaturesProphet:
			System.out.println("This hero is agressive pusher. It's useful to pick him if you're going to end.");
			System.out.println("the game as fast as it possible. NaturesProphet is one of the best farmers in Dota 2,");
			System.out.println("also he feels good in the forest, but you should have a good skill for playing this hero.");
		break;
		}
		
		
	}
	
}

class Welcome{
	
	private String nickName = "remXinq";
	private int hours = 300;
	
	Welcome(){}
	
	Welcome(String nickName, int hours)
	{
		this.nickName = nickName;
		this.hours = hours;
	}
	
	public String getNickName() {
		return nickName;
	}
	public int getHours() {
		return hours;
	}
	
}

class Played{
	
	private int gamesPlayed;
	private int won;
	private int lost;
	
	{
		gamesPlayed = 189;
		won = 105;
		lost = 84;
		System.out.printf("Games played: %d", gamesPlayed);
		  System.out.println();
		System.out.printf("Games won: %d", won);
		  System.out.println();
		System.out.printf("Games lost: %d", lost);
		  System.out.println();
	}
	
	
	
}

class InfoHero{
	
	final int earthShakerSpeed = 310; 
	final int tideHunterSpeed =  300;
	final int sniperSpeed =  285;
	final int dazzleSpeed = 305;
	final int naturesProphetSpeed = 290; 
	
	public void hero(String quote) {
		System.out.println(quote);
	}
	public void hero(int health) {
		System.out.println(health);
	}
	
	static void esAbilities() 
	{
		System.out.println("Abilities: ");
		System.out.println("1.Fissure - slams the ground with a mighty totem");
		System.out.println("2.Enchant Totem - empowers Earthshaker's totem, causing it to deal extra damage on the next attack.");
		System.out.println("3.Aftershock - causes the earth to shake underfoot");
		System.out.println("4.Echo Slam - shockwaves travel through the ground, damaging enemy units.");
	}
	static void tideAbilities() 
	{
		System.out.println("Abilities: ");
		System.out.println("1.Gush - summons a gush of water to damage an enemy unit, reducing their movement speed and armor.");
		System.out.println("2.Kracken Shell - Thickens Tidehunter's hide to passively block a portion of any incoming physical attack damage.");
		System.out.println("3.Anchor Smash - Tidehunter swings his mighty anchor to attack.");
		System.out.println("4.Ravage - Slams the ground, causing tentacles to erupt in all directions.");
	}
	static void snipAbilities() {
		System.out.println("Abilities: ");
		System.out.println("1.Shrapnel - Consumes a charge to launch a ball of shrapnel that showers the target area in explosive pellets.");
		System.out.println("2.Headshot - Sniper increases his accuracy, giving him a chance to deal extra damage and briefly knocks back his enemies.");
		System.out.println("3.Take Aim - Extends the attack range of Sniper's rifle.");
		System.out.println("4.Assassinate - Sniper locks onto a target enemy unit and, after a short aiming duration, fires a devastating shot.");
	}
	static void dazzAbilities() {
		System.out.println("Abilities: ");
		System.out.println("1.Poison Touch - Releases a cone of poison that strikes multiple enemy units.");
		System.out.println("2.Shallow Grave - An ally blessed with Shallow Grave, no matter how close to death, cannot die while under its protection.");
		System.out.println("3.Shadow Wave - Sends out a bolt of power that arcs between allies, healing them.");
		System.out.println("4.Bad Juju - Passively reduces cooldowns on your abilities and items.");
	}
	static void natAbilities() {
		System.out.println("Abilities: ");
		System.out.println("1.Sprout - Sprouts a ring of trees around a unit, trapping it in place, and providing vision in a 500 radius.");
		System.out.println("2.Teleportation - Teleports to any point on the map.");
		System.out.println("3.Nature's Call - Converts an area of trees into Treants under the command of Nature's Prophet.");
		System.out.println("4.Wrath of Nature - Damaging energy bounces around the map, striking enemies close to the cast point that are in vision.");
	}
}


class Main{
	
	public static void main(String args[]) 
	{
		Welcome welcome = new Welcome();
		
		System.out.println("Hello user, welcome to the Dota 2 assistant");
		 System.out.println();
		System.out.printf("Your login is: ");
		System.out.println(welcome.getNickName());
		System.out.printf("Your number of played hours: ");
		System.out.println(welcome.getHours());
		Played p = new Played();
	    System.out.println();
		System.out.println("Choose your hero: ");
		System.out.println("   Earthshaker");
		System.out.println("   TideHunter");
		System.out.println("   Sniper");
		System.out.println("   Dazzle");
		System.out.println("   NaturesProphet");
		
		InfoHero info = new InfoHero();
		
		Scanner input = new Scanner(System.in);
		String select = input.nextLine();
		System.out.println();
		
		Game game = new Game(AllPick.valueOf(select));
		game.ChooseYourHero();
		System.out.println();
			
		if(select.contentEquals("Earthshaker")) {
			 info.hero("\"There may be many earths, but there's only one Earthshaker\"");
			 System.out.println();
			 System.out.printf("Movespeed : %d", info.earthShakerSpeed);
			 System.out.println();
			 System.out.printf("Base health reserve: ");
			 info.hero(200);
			 System.out.println();
			 InfoHero.esAbilities();
		}else if(select.contentEquals("Tidehunter")) {
			info.hero("\"You can't hide from the tide\"");
			System.out.println();
			 System.out.printf("Movespeed : %d", info.tideHunterSpeed);
			 System.out.println();
			 System.out.printf("Base health reserve: ");
			 info.hero(200);
			 System.out.println();
			 InfoHero.tideAbilities();
		}else if(select.contentEquals("Dazzle")) {
			info.hero("\"Where my shadow falls, there falls my foe\"");
			System.out.println();
			 System.out.printf("Movespeed : %d", info.dazzleSpeed);	
			 System.out.println();
			 System.out.printf("Base health reserve: ");
			 info.hero(200);
			 System.out.println();
			InfoHero.dazzAbilities();
		}else if(select.contentEquals("Sniper")) {
			info.hero("\"Now that's what I call stopping power\"");
			System.out.println();
			 System.out.printf("Movespeed : %d", info.sniperSpeed);
			 System.out.println();
			 System.out.printf("Base health reserve: ");
			 info.hero(200);
			 System.out.println();
			 InfoHero.snipAbilities();
		}else if(select.contentEquals("NaturesProphet")) {
			info.hero("\"I woke within the seed and saw my destiny, and many were its branches\"");
			 System.out.println();
			 System.out.printf("Movespeed : %d", info.naturesProphetSpeed);
			 System.out.println();
			 System.out.printf("Base health reserve: ");
			 info.hero(200);
			 System.out.println();
			 
		}
		
	}
}
