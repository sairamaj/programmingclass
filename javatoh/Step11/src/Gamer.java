import java.util.ArrayList;

public class Gamer {

	ArrayList<Tower> towers;
	int numberOfMoves;		// required to count the number of moves taken

	public void setup() throws Exception {
		// Created Tower-A
		
		this.towers = new ArrayList<Tower>();
		
		Tower towerA = new Tower("Tower-A");

		// larger disk
		Disk large = new Disk(8);
		towerA.addDisk(large);

		Disk medium = new Disk(6);
		towerA.addDisk(medium);

		// smaller disk
		Disk small = new Disk(4);
		towerA.addDisk(small);

		
		towers.add(towerA);		// add it our bag

		Tower towerB = new Tower("Tower-B");
		towers.add(towerB);		// add it our bag
		
		Tower towerC = new Tower("Tower-C");
		towers.add(towerC);	// add it our bag
		
		// go through bag , pick a tower, draw
		for(Tower t : towers) {
			t.draw();
		}
	}
	
	int getNumberOfMoves() {
		return this.numberOfMoves;
	}
	
	// Move a disk from given tower to tower.
	boolean move(int from, int to) throws Exception {

		// increment the number of moves
		numberOfMoves++;

		if( from <0 || from >3 )
		{
			throw new Exception("FromTower:" + from + " should be between 1 and 3");
		}
		
		if( to < 0 || to >3) {
			// not allowed
			Exception toNotAllowed;
			toNotAllowed = new Exception("Totower:" + to + " is should be between 1 and 3");
			throw toNotAllowed;
		}
		
		// pick a tower
		from = from-1;
		to = to-1;
		
		
		Tower fromTower = this.towers.get(from);
		Tower toTower = this.towers.get(to);
		
		Disk topDisk = fromTower.removeDisk();
		
		try {
			toTower.addDisk(topDisk);
		}catch(Exception e) {
			fromTower.addDisk(topDisk);
			throw e;
		}
	
		
		// drawing all the towers
		for(Tower t : towers) {
			t.draw();
		}	
		
		// we need to skip first tower 
		// we need to see whether tower-b or tower-c has 3 disks
		for(int i=1; i< this.towers.size(); i++) {
			Tower t = this.towers.get(i);
			int diskCountOnTower = t.getDiskCount();
			if( diskCountOnTower == 3) {
				return true;		// all the disks are moved.
			}
		}
		
		return false;		// game is not done yet.
	}
}
