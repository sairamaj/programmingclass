
public class Gamer {
	Tower[] towers;
	void create() {
		System.out.println("Creating tower");
		towers = new Tower[3];
		towers[0] = new Tower("Tower A");
		DiscManager manager = new DiscManager();
		Disc Large = manager.getLargeDisc();
		Disc Medium = manager.getMediumDisc();
		Disc Small = manager.getSmallDisc();

		towers[0].addDisc(Large);
		towers[0].addDisc(Medium);
		towers[0].addDisc(Small);
		
		towers[1] = new Tower("Tower B");
		towers[2] = new Tower("Tower C");
		
		this.draw();
	}
	
	void move(int from, int to) throws Exception {
		System.out.printf("moving: %d to:%d\n", from, to);
		validate(from, to);
		
		int fromTower = from-1;
		int toTower = to-1;
		
		// Check whether disc exists on from tower.
		Disc discToMove = towers[fromTower].getTopDisc();
		if( discToMove == null) {
			throw new Exception("No disc to remove from tower:" + from);
		}
		
		boolean canBeMoved = towers[toTower].canDiscBeAdded(discToMove);
		if( canBeMoved == false) {
			throw new Exception("Larger disc cannot moved on smaller disc.");
		}
		
		Disc disc = towers[fromTower].removeTopDisc();
		towers[toTower].addDisc(disc);
		draw();
	}
	
	boolean isGameOver() {
		if( this.towers[1].getDiscCount() == 3) {
			return true;	// If second disc has 3 dics, then game is over.
		}
		
		return false;
	}
	
	void draw() {
		for(int i=0; i<towers.length; i++) {
			towers[i].draw();
		}
	}
	
	void validate(int from, int to) throws Exception {
		if( from < 1 || from >3) {
			throw new Exception("invalid from");
		}
		
		if( to < 1 || to >3) {
			throw new Exception("invalid to");
		}
	}
}
