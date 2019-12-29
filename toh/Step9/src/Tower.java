import java.util.ArrayList;

public class Tower {
	ArrayList<Disc> discs = new ArrayList<Disc>();
	private String name;

	Tower(String name) {
		this.name = name;
	}

	void draw() {
		drawTower();
		for (int i = discs.size()-1; i >=0 ; i--) {
			Disc d = discs.get(i);
			d.draw();
		}
		System.out.println(name);
	}
	
	void addDisc(Disc d) {
		// System.out.println("adding disc");
		this.discs.add(d);
	}
	
	Disc getTopDisc() {
		if( this.discs.size() == 0) {
			return null;	// no discs.
		}
		
		int topDiscIndex = this.discs.size()-1;
		return this.discs.get(topDiscIndex);
	}
	
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
	
	Disc removeTopDisc() {
		int topDiscIndex = this.discs.size()-1;
		return this.discs.remove(topDiscIndex);
	}
	
	void drawTower() {
		for(int i=0; i<4; i++) {
			System.out.println("    |");
		}
	}
	
	int getDiscCount() {
		return this.discs.size();
	}
}
