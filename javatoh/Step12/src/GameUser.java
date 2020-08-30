import java.util.Scanner;

public class GameUser {
	
	private Gamer gamer;
	private int fromTower;
	private int toTower;
	
	GameUser(Gamer gamer){
		this.gamer = gamer;
	}
	
	public void start() {
		boolean quit = false;

		do {
			System.out.println("Please enter command(quit or move):");

			Scanner scanner = new Scanner(System.in);
			String command = scanner.next();

			if (command.equals("move")) {
				boolean isvalid = this.askForTowerNumbers();

				if(isvalid == false) {
					continue;		// it will go back to top
				}
				
				boolean isDone = this.moveDisks();
				if( isDone) {
					quit = true;
				}
				
			} else if (command.equals("quit")) {
				quit = true;
			} else {
				System.out.println("wrong command(please enter move/quit");
			}

		} while (quit == false);
		
	}
	
	private boolean askForTowerNumbers() {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter from which tower, you want to move:");
		try {
			this.fromTower = scanner.nextInt();
			System.out.print("Please enter to which tower, you want to move:");
			this.toTower = scanner.nextInt();
		} catch (java.util.InputMismatchException e) {
			System.out.println("Please enter a number.");
			return false;
		}

		return true;
	}
	
	private boolean moveDisks() {
		
		boolean isGameDone = false;
		System.out.println("we are going to move:" + this.fromTower+ " to:" + this.toTower);
		try {
			isGameDone = this.gamer.move(this.fromTower, this.toTower);
			if (isGameDone) {
				System.out.println("---------------------");
				int moveCount = this.gamer.getNumberOfMoves();
				System.out.println("congratulations! :" + moveCount);
				System.out.println("---------------------");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		return isGameDone;

	}
}
