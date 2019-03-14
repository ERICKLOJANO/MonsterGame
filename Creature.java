package gameinterfaces;

public class Creature {

	public String name;
	public String description;
	public int hitPoints;
	public int damage;
	public Room room;

	
	public Creature(){
		name = "";
		description = "";
		hitPoints = 0;
		damage = 0;
		room = null;
	}
	public Creature(String creatureName, String creatureDescription, int creatureHitPoints, int creatureDamage, Room room){
		name = creatureName;
		description = creatureDescription;
		hitPoints = creatureHitPoints;
		damage = creatureDamage;
		this.room = null;
	}
	
	//G E T T E R S
	
	public String getName(){
		return name;
	}
	
	public String getDescription(){
		return description;
	}
	
	public int getHitPoints(){
		return hitPoints;
	}
	
	public int getDamage(){
		return damage;
	}
	
	public Room getRoom(){
		return room;
	}
	
	
	@Override
		public String toString() {
			return String.format("name %15s, description %20s, hitPoints %03d, damage %02d", name, description, hitPoints, damage);
		}
	
	
	
	//S E T T E R S
	
	public void setHitPoints(int hp){
		hitPoints = hp;
	}
	
	public void setDamage(int cd){
		damage = cd;
	}
	
	public void setRoom(Room r){
		room = r; 
	}
	
	// M E T H O D S
	
		public void attack(Creature creature){
			System.out.println(this.name + " attacks target " + creature.name + " dealing " + damage + " damage");
			//use takedamage
		}
		
		public boolean isAlive(){
			if(hitPoints > 0 ){
				return true;
			}
			else{
			return false;
			}
		}
		
		public void takeDamage(int damage){
			hitPoints = hitPoints - damage;
	   		if(hitPoints < 0) {
	   			hitPoints = 0;
		}
	   		
	   	
	   		
	   		
	}
	
	
}
