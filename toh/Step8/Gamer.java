
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

		towers[0].addDisc(Small);
		towers[0].addDisc(Medium);
		towers[0].addDisc(Large);
		
		towers[1] = new Tower("Tower B");
		towers[2] = new Tower("Tower C");
		
		this.draw();
	}
	
	void move(int from, int to) {
		System.out.printf("moving: %d to:%d\n", from, to);
		Disc disc = towers[from].removeTopDisc();
		towers[to].addDisc(disc);
		draw();
	}
	
	void draw() {
		for(int i=0; i<towers.length; i++) {
			towers[i].draw();
		}
	}
}
