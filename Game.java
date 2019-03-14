package gameinterfaces;

public class Game {

	private  Player player;
	private Room[] dungeon = new Room[2];
	
	public Game() {
	super();
	//player = null;
	Player player = new Player("Erick", "lol", 100, 30, 50);
	
	dungeon = new Room[2];
	Monster Monster1 = new Monster("Orc", "covered with green blood", 20, 5, false, 0 );
	dungeon[0] = new Room(0, "a room with an unbearable smell", Monster1);
	Monster Monster2 = new Monster("Skeleton", "funny how it moves", 40, 10, false, 10);
	dungeon[1] = new Room(1, "dark and cold", Monster2); //Room room2
	Monster Monster3 = new Monster("Fire Dragon", "spout fire with each breath", 100, 20, false, 40);
	dungeon[2] = new TreasureRoom("a giant hall with something shiny on the other end", Monster3, "a large pile of gold");
	//Room[] dungeon =  {room1, room2, room3};
	}
 
//	public String readFile(String PlayerInfo) {
//		String fileContents = "";
//		Scanner inputStream = null;
//		try {
//			File theFile = new File(PlayerInfo);//create a File object using the String fileName and the File constructor
//			inputStream = new Scanner(theFile);//connect my input stream to the FILE
//			while(inputStream.hasNextLine()){
//				fileContents += inputStream.nextLine() +"\n";//read in 1 line from the file 
//			}
//		} catch (FileNotFoundException e) {
//			System.err.println("Inside readFile could not read from " + PlayerInfo + 
//					"\nthe message was: " + e.getMessage());
//			e.printStackTrace();
//		}
//		
//		finally{
//			if(inputStream != null){
//				inputStream.close();
//			}
//		}
//		return fileContents;
//	}
	
	 
		
public  void play() {
	//iterate through dungeon array or rooms using for loop
	for(int i = 0; i<= dungeon.length; i++) {
		//while() {
			
		}
	}

	public static void main(String[] args) {

		//Scanner kb = new Scanner(System.in);
		
	}


	
	
		
}
	

