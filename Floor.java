
public class Floor extends FloorMap {

	@Override
	void createFloor() {
		createGround();
		createWalls();
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
