package org.system;

public class Desktop extends Computer {

	// create method
	public void desktopSize() {
		System.out.println("The size of desktop is 24inches");
	}
	public static void main(String[] args) {
		
		Computer str = new Computer();
		str.computerModel();
		
		Desktop md= new Desktop();
		md.desktopSize();
		md.computerModel();
	}
	
	
}
