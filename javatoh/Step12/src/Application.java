import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Gamer g = new Gamer();

		try {
			g.setup();
		} catch (Exception e1) {
			e1.printStackTrace();
			return;
		}

		GameUser user = new GameUser(g);
		user.start();
		
		// for

		System.out.println("bye");
	}

}
