
public class Tower {
	Disc disc;
	void draw() {
		System.out.println("Drawing tower");
		this.disc.draw();		// we got this added in addDisc method.
	}
	
	void addDisc(Disc d) {
		System.out.println("adding disc in tower");
		this.disc = d;		// save this in object field
	}
}
