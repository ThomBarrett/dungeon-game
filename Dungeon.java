/**
 * 
 */

/**
 * @author Belinda Armstrong
 *
 */
import java.util.Random;
public class Dungeon {
	

	public Dungeon(){
		
	}
	// randomly places number 1s on dungeon floor representing traps
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
	// randomly places numbers 2-5 on dungeon floor representing items
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
	// randomly places numbers 6-9 on dungeon floor representing monsters
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
	
	public void populateDungeon(){
		
		//populate dungeon
		
	}
}
