package gameinterfaces;

public class Player extends Creature {
	protected int healAmount;
	
	public Player(String n, String d, int hp, int damage, int healAmount){
		super();
		this.healAmount = 0;
	}
	
	public void heal() {
		this.hitPoints += healAmount; //hitpoints = hitpoints + healamount
	}

	
}