import java.util.Random;
public class Floor extends FloorMap {

	@Override
	void createFloor() {
		createGround();
		createWalls();
		createTraps(difficulty);
		createItems(difficulty);
		createMonsters(difficulty);
	}
	
	private void createGround(){
		groundLayer = new int[sizeX=100][sizeY=100];
		
		for(int i = 0; i < this.sizeX; i++){
			for(int j = 0; j < this.sizeY; j++){
				groundLayer[i][j] = 1;
			}
		}
	}
	
	private void createWalls(){
		wallLayer = new int[sizeX=100][sizeY=100];
		for(int i = 0; i < this.sizeX; i++){
			for(int j = 0; j < this.sizeY; j++){
				wallLayer[i][j] = 0;
			}
		}
		wallLayer[2][2] = 5;
	}
	
	// randomly places number 1s on floor representing traps
	private int[][] createTraps(int difficulty){
		int[][] traps = new int[100][100];
		Random rand = new Random();

		while (difficulty > 0){
			int n = rand.nextInt(100);
			int m = rand.nextInt(100);
			traps[n][m] = 1;
		}
		
		return traps;
	}
	// randomly places numbers 2-5 on floor representing items
	private int[][] createItems(int difficulty){
		int[][] items = new int[100][100];
		Random rand = new Random();

		while (difficulty > 0){
			int n = rand.nextInt(100);
			int m = rand.nextInt(100);
			int o = rand.nextInt(5) + 2;
			items[n][m] = o;
		}
		
		return items;
	}
	// randomly places numbers 6-9 on floor representing monsters
	private int[][] createMonsters(int difficulty){
		int[][] monsters = new int[100][100];
		Random rand = new Random();

		while (difficulty > 0){
			int n = rand.nextInt(100);
			int m = rand.nextInt(100);
			int o = rand.nextInt(4) + 6;
			monsters[n][m] = o;
		}
		return monsters;
	}
	
	public void displayGround(){
		for(int i = 0; i < this.sizeX; i++){
			for(int j = 0; j < this.sizeY; j++){
				if(wallLayer[i][j] == 0){
					System.out.print(groundLayer[i][j]);
				}else{
					System.out.print(wallLayer[i][j]);
				}
			}
			System.out.println();
		}
	}
}
