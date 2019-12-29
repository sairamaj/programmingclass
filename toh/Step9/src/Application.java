import java.util.Scanner;

/*
 *	Class:
 *			Application
 *	Responsibilities
 *			User interaction
 *			Quit application upon user request
 *			Quits if game is over.
 *  Collaborations
 *  		Gamer
 */
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gamer g = new Gamer();
		g.create();

		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		do {
			System.out.print("command:");
			String command = scanner.next();
			if( command.equalsIgnoreCase("quit")) {
				quit = true;
			}else if( command.equalsIgnoreCase("move")) {
				System.out.print("from:");
				int from  = scanner.nextInt();
				System.out.print("to:");
				int to = scanner.nextInt();
				try{
					g.move(from, to);
					if(g.isGameOver()) {
						System.out.println("Congratulations, game over.");
						quit = true;
					}
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}else {
				System.out.println("invalid command(move or quit)");
			}
			
		}while(quit==false);
		
		System.out.println("Quitting...");
	}
}

