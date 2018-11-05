public abstract class FloorMap {
	protected int sizeX,sizeY;
	protected int[][] groundLayer;
	protected int[][] wallLayer;
	protected int[][] trapLayer;
	protected int[][] itemLayer;
	protected int[][] enemyLayer;
	
	abstract void createFloor();
}
