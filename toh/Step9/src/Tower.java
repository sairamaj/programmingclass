import java.util.ArrayList;

/*
 * Class: 	
 * 				Tower
 * Responsibilities: 
 * 				Draw the Tower
 * 				Draw discs
 * 				Can tell whether a given disc can be added or not
 * 				Removes the top the disc
 * 				Adds a new disc
 * Collaborations:
 * 				Disc
 */
public class Tower {
	
	// Holds the disc in the list.
	private ArrayList<Disc> discs = new ArrayList<Disc>();
	// Tower name.
	private String name;

	/*
	 * Constructor.
	 */
	Tower(String name) {
		this.name = name;
	}

	/*
	 * Draws the tower and discs
	 */
	void draw() {
		
		// Draw tower.
		this.drawTower();
		
		// Draws the discs in reverse list
		// The discs ares stored from large->medium->small
		// While drawing we need to draw in reverse order.
		for (int i = discs.size()-1; i >=0 ; i--) {
			Disc d = discs.get(i);
			d.draw();
		}
		
		System.out.println(name);
	}

	/*
	 * Adds disc to the list.
	 */
	void addDisc(Disc d) {
		this.discs.add(d);
	}
	
	/*
	 * Gets top disc.
	 * Returns null if no disc are available.
	 */
	Disc getTopDisc() {
		if( this.discs.size() == 0) {
			return null;	// no discs.
		}
		
		int topDiscIndex = this.discs.size()-1;
		return this.discs.get(topDiscIndex);
	}
	
	/*
	 * Checks whether a given disc cannot be added.
	 * returns 
	 * 		true:  	if no discs on this tower as disc can be added
	 * 				if coming disc is smaller than top of the disc.
	 * 		false:
	 * 				If coming disc is larger than the top of the disc.
	 * 
	 */
	boolean canDiscBeAdded(Disc discToAdd) {
		if( this.discs.size() == 0) {
			return true;		// no discs , can be added
		}
		
		Disc topDisc = this.getTopDisc();
		if( discToAdd.size < topDisc.size) {
			return true;		// yes, smaller disc can go on big disc.
		}
		
		return false;	// No larger disc , cannot go to smaller disc.
	}
	
	/*
	 * Removes the top of the disc.
	 */
	Disc removeTopDisc() {
		int topDiscIndex = this.discs.size()-1;
		return this.discs.remove(topDiscIndex);
	}
	
	/*
	 * Gets total disc count.
	 */
	int getDiscCount() {
		return this.discs.size();
	}

	/*
	 * Draws the tower.
	 */
	private void drawTower() {
		
		// Draw 4 vertical lines.
		for(int i=0; i<4; i++) {
			System.out.println("    |");
		}
	}
	
}
