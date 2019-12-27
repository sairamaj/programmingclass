
public class Gamer {
	Tower t1;
	Tower t2;
	Tower t3;
	void create() {
		System.out.println("Creating tower");
		this.t1 = new Tower("Tower A");
		DiscManager manager = new DiscManager();
		Disc Large = manager.getLargeDisc();
		Disc Medium = manager.getMediumDisc();
		Disc Small = manager.getSmallDisc();

		this.t1.addDisc(Small);
		this.t1.addDisc(Medium);
		this.t1.addDisc(Large);
		
		this.t2 = new Tower("Tower B");
		this.t3 = new Tower("Tower C");
		
		this.draw();
	}
	
	void draw() {
		this.t1.draw();
		this.t2.draw();
		this.t3.draw();
	}
}
