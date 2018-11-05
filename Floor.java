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
	
	// randomly places number 1s on floor representing traps (1 type of trap)
	private void createTraps(int difficulty){
		trapLayer = new int[sizeX=100][sizeY=100];
		Random rand = new Random();

		while (difficulty > 0){
			int n = rand.nextInt(this.sizeX);
			int m = rand.nextInt(this.sizeY);
			trapLayer[n][m] = 1;
		}
		
	}
	// randomly places numbers 2-5 on floor representing items (4 types of item)
	private void createItems(int difficulty){
		itemLayer = new int[sizeX=100][sizeY=100];
		Random rand = new Random();

		while (difficulty > 0){
			int n = rand.nextInt(this.sizeX);
			int m = rand.nextInt(this.sizeY);
			int o = rand.nextInt(5) + 2;
			itemLayer[n][m] = o;
		}
		
	}
	// randomly places numbers 6-9 on floor representing monsters (4 types of random monster)
	private void createMonsters(int difficulty){
		enemyLayer = new int[sizeX=100][sizeY=100];
		Random rand = new Random();

		while (difficulty > 0){
			int n = rand.nextInt(this.sizeX);
			int m = rand.nextInt(this.sizeY);
			int o = rand.nextInt(4) + 6;
			enemyLayer[n][m] = o;
		}

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
