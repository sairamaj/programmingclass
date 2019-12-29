
/*
 * Class: 
 * 			Gamer
 * Responsibilities: 
 * 			Creating the towers
 * 			Moving the discs from one tower to another
 * 			Checking whether game is over or not.
 * Collaborations
 * 			DiscManager
 * 			Disc
 * 			Tower
 */
public class Gamer {
	// Towers array.
	private Tower[] towers;
	
	/*
	 * Creates the towers and draws them.
	 */
	void create() {
		
		// Create tower.
		towers = new Tower[3];
		towers[0] = new Tower("Tower A");
		towers[1] = new Tower("Tower B");
		towers[2] = new Tower("Tower C");
		
		// gets different discs
		DiscManager manager = new DiscManager();
		Disc Large = manager.getLargeDisc();
		Disc Medium = manager.getMediumDisc();
		Disc Small = manager.getSmallDisc();

		// Add to the first tower to start with
		towers[0].addDisc(Large);
		towers[0].addDisc(Medium);
		towers[0].addDisc(Small);
		
		// Draw which draws all the towers.
		this.draw();
	}
	
	/*
	 * Move disc
	 * 		from	- tower number to be moved from
	 * 		to		- tower number to be moved to
	 * 
	 * Throws exception if cannot be moved.
	 */
	void move(int from, int to) throws Exception {
		System.out.printf("moving: %d to:%d\n", from, to);
		validate(from, to);
		
		// Tower index starts with 0 but user towers starts ith 1
		int fromTower = from-1;
		int toTower = to-1;
		
		// Check whether disc exists on from tower.
		Disc discToMove = towers[fromTower].getTopDisc();
		if( discToMove == null) {
			throw new Exception("No disc to remove from tower:" + from);
		}
		
		// Check disc can be added to the to tower. 
		boolean canBeMoved = towers[toTower].canDiscBeAdded(discToMove);
		if( canBeMoved == false) {
			throw new Exception("Larger disc cannot moved on smaller disc.");
		}
		
		// Remove from 'from' tower and add it to 'to' tower.
		Disc disc = towers[fromTower].removeTopDisc();
		towers[toTower].addDisc(disc);
		draw();
	}
	
	/*
	 * Checks whether game is over or not.
	 */
	boolean isGameOver() {
		if( this.towers[1].getDiscCount() == 3) {
			return true;	// If second disc has 3 disc, then game is over.
		}
		
		return false;
	}
	
	/*
	 * Draws the towers.
	 */
	private void draw() {
		for(int i=0; i<towers.length; i++) {
			towers[i].draw();
		}
	}
	
	/*
	 * Validates the from and to values.
	 */
	private void validate(int from, int to) throws Exception {
		if( from < 1 || from >3) {
			throw new Exception("invalid from");
		}
		
		if( to < 1 || to >3) {
			throw new Exception("invalid to");
		}
	}
}
