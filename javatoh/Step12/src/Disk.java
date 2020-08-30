import java.util.*;

public class Disk {

	private int size;
	
	Disk(int size){
		this.size = size;
		
	}
	
	// it is returning its size.
	public int getSize() {
		return this.size;
	}
	
	public void draw() {
		
		for(int i =0; i<this.size; i++) {
			System.out.print("X");	
		}
		System.out.println("");
		
	}
	
}
