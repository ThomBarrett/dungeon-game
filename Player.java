
/**
 * 
 * @author Thomas Barrett
 *
 */

public class Player implements Displayable  {

	/**
	 * posX represents the players position on the X axis
	 * posY represents the players position on the Y axis
	 */
	private int posX,posY;
	
	/**
	 * maxHP represents the max value of players Health points
	 */
	private int maxHP;
	
	/**
	 * currentHP represents the max value of players Health points
	 */
	private int currentHP;
	
	/**
	 * currentEXP represents the current EXP points awarded to the player
	 */
	private int currentEXP;
	
	/**
	 * requiredEXP represents the amount of EXP points to achieve the next level
	 */
	private int requiredEXP;
	
	/**
	 * level represents the how strong the player is a the current moment
	 */
	private int level;
	
	/**
	 * inventory represents a system owned by the player class
	 * It is used to store the players items and can be used to access them
	 */
	private Inventory inventory = new Inventory();
	
	
	public Player(){
		
	}

	/**
	 * The display method attempts to display the player at it's current position
	 * @see Displayable.java
	 */
	@Override
	public void display() {
		System.out.print("Player");
	}

}
