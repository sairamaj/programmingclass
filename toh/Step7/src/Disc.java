
public class Disc {
	int size;

	Disc(int size) {
		this.size = size;
	}

	void draw() {
		for (int i = 0; i < size; i++) {
			System.out.println("-");
		}
		System.out.println();
	}
}
