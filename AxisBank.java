package week3.day1;

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("This is deposit account");
	}
	
	public static void main(String[] args) {
		
		AxisBank str= new AxisBank();
		str.deposit();
	}
}
