package gameinterfaces;


//	import java.io.File;
//	import java.io.FileNotFoundException;
//	import java.util.Scanner;

	public class Game {
		private  Player player;
		private Room[] dungeon = new Room[2];
		
		
		
		public Game() {
		super();
		
		Player player = new Player("Erick", "venomous sword", 100 ,100, 100);
		dungeon = new Room[3];

		Monster Monster1 = new Monster("Orc", "covered with green blood", 20, 5, false, 0 );

		dungeon[0] = new Room(0, "a room with an unbearable smell", Monster1);

		Monster Monster2 = new Monster("Skeleton", "funny how it moves", 40, 10, false, 10);

		dungeon[1] = new Room(1, "dark and cold", Monster2); 

		Monster Monster3 = new Monster("Fire Dragon", "spout fire with each breath", 100, 20, false, 40);

		dungeon[2] = new TreasureRoom("a giant hall with something shiny on the other end", Monster3, "a large pile of gold");


		}
	

	public  void play() {


			
			for(int i = 0; i <= 2; i++){
				
			}

	}
		public static void main(String[] args) {



//			Scanner kb = new Scanner(System.in);

			//new Game(). play();

		}
	
}
