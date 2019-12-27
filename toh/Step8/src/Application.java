import java.util.Scanner;

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
				g.move(from, to);
			}else {
				System.out.println("invalid command(move or quit)");
			}
			
		}while(quit==false);
		
		System.out.println("Quitting...");
	}

}

