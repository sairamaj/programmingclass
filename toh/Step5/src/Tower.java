
public class Tower {
	Disc disc;
	void draw() {
		this.disc.draw();		// we got this added in addDisc method.
	}
	
	void addDisc(Disc d) {
		this.disc = d;		// save this in object field
	}
}
