
public class Gamer {
	void create() {
	
		DiscManager manager = new DiscManager();
		Disc small = manager.getSmallDisc();
		Tower t = new Tower();
	
		t.addDisc(small);
		t.draw();
	}
	
	void move(int from, int to) {
	}
}
