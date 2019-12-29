/*
 * Class: 
 * 			Disc
 * Responsibilities:
 * 			Draws the disc
 * Collaborations:
 * 			None
 */
public class Disc {
	int size;

	Disc(int size) {
		this.size = size;
	}

	void draw() {
		for (int i = 0; i < size; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}
