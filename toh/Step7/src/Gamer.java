
public class Gamer {
	void create() {
		System.out.println("Creating tower");
		Tower t1 = new Tower("Tower A");
		DiscManager manager = new DiscManager();
		Disc Large = manager.getLargeDisc();
		Disc Medium = manager.getMediumDisc();
		Disc Small = manager.getSmallDisc();
		t1.addDisc(Small);
		t1.addDisc(Medium);
		t1.addDisc(Large);
		t1.draw();
		Tower t2 = new Tower("Tower B");
		t2.addDisc(Small);
		t2.addDisc(Large);

	}
}
