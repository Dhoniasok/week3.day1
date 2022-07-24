package week3.day1;

public class Student1 {
	public void getStudentInfo() {
		System.out.println("Student Info");
	}
	
	public void getStudentInfo(String studentID) {
		System.out.println("Student Id is AS123DE" );
	}
	
	public void getStudentInfo(String studentID, String name) {
		System.out.println("Student ID & Name is AS123DE and Dhoni " );
	}
	public void getStudentInfo(String email, int phoneNumber ) {
		System.out.println("Student E-mail & Phone Number is Dhoni123@gmail.com and 8940892341" );
	}
	
	public static void main(String[] args) {
		Student1 str = new Student1();
		str.getStudentInfo();
		str.getStudentInfo(null);
		str.getStudentInfo(null, null);
		str.getStudentInfo(null, null);
		
	}
}


