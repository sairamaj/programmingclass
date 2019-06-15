import java.util.ArrayList;

public class Tower {
	ArrayList<Disc> discs = new ArrayList<Disc>();
	private String name;

	Tower(String name) {
		this.name = name;
	}

	void draw() {
		// System.out.println("Drawing a tower");
		System.out.println(name);
		for (int i = 0; i < discs.size(); i++) {
			Disc d = discs.get(i);
			d.draw();
		}
	}

	void addDisc(Disc d) {
		// System.out.println("adding disc");
		this.discs.add(d);
	}
}
