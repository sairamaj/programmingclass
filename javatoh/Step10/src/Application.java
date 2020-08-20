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

		// for
		boolean quit=false;
		
		do {
			System.out.println("Please enter command(quit or move):");
			
			Scanner scanner = new Scanner(System.in);
			String command = scanner.next();
			
			if(command.equals("move")) {
				System.out.print("Please enter from which tower, you want to move:");
				int from = scanner.nextInt();
				System.out.print("Please enter to which tower, you want to move:");
				int to = scanner.nextInt();
				
				System.out.println("we are going to move:" + from + " to:" + to);
				try
				{
					g.move(from, to);
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}else if(command.equals("quit")) {
				quit = true;
			}else {
				System.out.println("wrong command(please enter move/quit");
			}
			
		}while(quit==false);
		
		System.out.println("bye");
	}

}
