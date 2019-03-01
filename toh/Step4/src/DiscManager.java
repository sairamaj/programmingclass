
public class DiscManager {
	Disc getSmallDisc() {
		System.out.println("returns small disc.");
		Disc d = new Disc();
		return d;
	}

	Disc getMediumDisc() {
		System.out.println("returns medium disc.");
		return null;
	}

	Disc getLargeDisc() {
		System.out.println("returns large disc.");
		return null;
	}
}
