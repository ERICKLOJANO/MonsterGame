package gameinterfaces;

public class Room {

	protected int roomIndex;
	protected String description;
	protected Monster monster;
	
	public Room(int roomIndex, String description, Monster monster) {
		roomIndex = 0;
		description = "";
		monster = null; //what is the type of Monster	
	}
	public void enter(Player player) {
		if (monster.isAlive() == true) {
			System.out.println("Player name is " + player.name + " This room is " + this.description + " and has " + this.monster);
			player.attack(monster); 
		}
	}
	public boolean isComplete() {
		if(monster.isAlive() == false) {
			return true;
		}
		return false;
	}
	@Override
	public String toString(){         
	   	return String.format("roomIndex %5d, description %20s, monster %10s", roomIndex, description, monster); 	
	    
	    }

	
}
