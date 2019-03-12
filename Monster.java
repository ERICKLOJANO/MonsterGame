package gameinterfaces;

public class Monster extends Creature{

	private boolean isEnraged;          
	private int	enrageThreshold;

	public Monster(String name, String description, int hp, int damage, boolean isEnraged, int enrageThreshold){
	super();                          
	isEnraged = false;
	enrageThreshold = 0;	
	}
	
	public boolean canEnrage() {	
	if(this.hitPoints < this.enrageThreshold) {
		isEnraged = true;}
		return isEnraged;                                                    
}
	public void enrage() {
		if (isEnraged == true) {
			this.damage = damage * 2;
		}
	}

	
}
