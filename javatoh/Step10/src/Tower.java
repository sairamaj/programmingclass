import java.util.*;

public class Tower {
	private String name;
	private ArrayList<Disk> disks;

	Tower(String name) {
		this.name = name;
		disks = new ArrayList<Disk>();
	}

	
	void addDisk(Disk d) throws Exception {
		
		if( this.disks.size() == 0) {
			this.disks.add(d);	// no disk exists, so any disk allowed.
			return;
		}
		
		// input_disk_size = get the input disk(d) size
		// topDis = get the top disk
		// topDiskSize = get top disk size
		// if input disk size > topDisSize
			// if input_disk_size > topDiskSize
				// we should throw exception
			// else
				// we can add
		int input_disk_size = d.getSize();
		
		int totalDisks = this.disks.size();
		int topDiskIndex = totalDisks-1;
		Disk topDisk = this.disks.get(topDiskIndex);
		int topDiskSize = topDisk.getSize();
		
		if( input_disk_size > topDiskSize) {
			Exception notAllowed;
			notAllowed = new Exception("Tower " + this.name + " does not allow " + input_disk_size + " to come on to " + topDiskSize);
			throw notAllowed;
		}
		
		// now allowed , so add it.
		this.disks.add(d);
	}
	
	void draw() {
		// we drew the pole
		drawPole();
		
		for(int i=this.disks.size()-1; i >=0 ; i--) {
			Disk d = this.disks.get(i);
			d.draw();
		}

		
		// draw base 
		drawBase();
		
		// title
		drawTitle();
	}

	Disk removeDisk() throws Exception{
		if( this.disks.size() == 0) {
			Exception noDisk;
			noDisk = new Exception("Tower: " + this.name + " does not have any disks");
			throw noDisk;
		}
		
		int totalDisks = this.disks.size();
		int topDiskIndex = totalDisks-1;
		Disk topDisk = this.disks.remove(topDiskIndex);
		return topDisk;
	}
	
	void drawPole() {
		for (int i = 0; i < 4; i++) {
			System.out.println("     |");
		}
	}

	private void drawBase() {
		System.out.println("________________");
	}

	private void drawTitle() {
		System.out.println("   " + this.name);
	}
}
