/*
 * Class: Disc manager
 * Responsibilities: Supplies the dics 
 */
public class DiscManager {
	Disc getSmallDisc() {
		Disc small = new Disc(12);
		return small;
	}

	Disc getMediumDisc() {
		Disc Medium = new Disc(18);
		return Medium;
	}

	Disc getLargeDisc() {
		Disc Large = new Disc(24);
		return Large;
	}
}
