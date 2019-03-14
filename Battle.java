package gameinterfaces;

import java.util.Scanner;

public class Battle {

	Scanner kb = new Scanner(System.in);
	private Player player;
	private Monster monster;

	public Battle(Player player, Monster monster){
		this.player = null;
		this.monster = null;
	}
	
	
	public void run() {
		System.out.println("Battle begins" + this.player + " vs " + this.monster);
		System.out.println("Monster hitpoints " + monster.getHitPoints() + "Players hitpoints " + player.getHitPoints());
		if(player.isAlive() == true) {
			System.out.println("want to attack (a) or heal (h).");
			char key = kb.next().charAt(0);
			if(key == 'a')
				player.attack(monster);
				player.heal();
		}
		
		if(monster.isAlive() == true){
			if(monster.canEnrage() == true)
			{
				if(monster.hitPoints < 45) {
					monster.enrage();
				}
				monster.attack(player);
			}
			else
				monster.attack(player);
		}
		if(player.isAlive() == false){
			System.out.println("The player has been killed by the monster. Game over");
		}
	}
	
	
}
