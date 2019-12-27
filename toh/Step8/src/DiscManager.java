
public class DiscManager {
	Disc getSmallDisc() {
		System.out.println("Got small disc");
		Disc small = new Disc(12);
		return small;
	}

	Disc getMediumDisc() {
		System.out.println("Got Medium disc");
		Disc Medium = new Disc(18);
		return Medium;
	}

	Disc getLargeDisc() {
		System.out.println("Got large disc");
		Disc Large = new Disc(24);
		return Large;
	}
}
