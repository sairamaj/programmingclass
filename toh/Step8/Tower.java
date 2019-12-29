import java.util.ArrayList;

public class Tower {
	ArrayList<Disc> discs = new ArrayList<Disc>();
	private String name;

	Tower(String name) {
		this.name = name;
	}

	void draw() {
		drawTower();
		for (int i = 0; i < discs.size(); i++) {
			Disc d = discs.get(i);
			d.draw();
		}
		System.out.println(name);
	}
	
	void addDisc(Disc d) {
		// System.out.println("adding disc");
		this.discs.add(d);
	}
	
	Disc removeTopDisc() {
		return this.discs.remove(0);
	}
	
	void drawTower() {
		for(int i=0; i<4; i++) {
			System.out.println("    |");
		}
	}
}
