package gameinterfaces;

public class TreasureRoom extends Room {

public String Treasure;
	
	public TreasureRoom(String description, Monster monster, String Treasure) {
		super(2, Treasure, monster);
		description = "";
		this.monster = monster;
		Treasure = "";
	}
	
	public void enter(Player player) {
		System.out.println("This room is " + this.description + " and has this " + this.monster);
		if(monster.isAlive() == true) {
			player.room.enter(player);
		}
		else {
			System.out.println("You explored the room and found the hidden treasure!");
		}
	
	}
}