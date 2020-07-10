package Lab_2;

public class studentDatabase {

	public static void main(String[] args) {
		
		
		newStudent stu1 = new newStudent("Nicholas", "Salonen", "9405295097085");
		stu1.enroll();
		stu1.pay(400);
		stu1.pay(200);
		stu1.showCourses();
		stu1.setPhone("082 524 3473");
		stu1.setCity("Cape Town");
		stu1.setState("Western Cape");
		stu1.getCity();
		stu1.getPhone();
		stu1.getState();
		System.out.println(stu1.toString());
		
		newStudent stu2 = new newStudent("Julika", "Pahl", "940328000975");
		stu2.enroll();
		stu2.pay(600);
		stu2.showCourses();
		stu2.setPhone("071 524 3473");
		stu2.setCity("Swakop");
		stu2.setState("Western Cape");
		stu2.getCity();
		stu2.getPhone();
		stu2.getState();
		System.out.println(stu2.toString());
		
	}

}

class newStudent {
	// Information regarding new student
	private String firstName;
	private String lastName;
	private String SSN;
	private static int ID = 0;
	private String studentID; // ID + 1000 < # < 9000 + SSN.substring(8, 12)
	private String studentEmail;
	private double balance = -600;
	private String cell;
	private String city;
	private String state;
	
	// Constructors
	public newStudent(String firstName, String lastName, String SSN) {
		this.SSN = SSN;
		this.firstName = firstName;
		this.lastName = lastName;
		ID++;
		genStudentID();
		genStudentEmail();
	}
	
	private void genStudentID() {
		int random = (int) (Math.random() * 10000);
		studentID = ID + "" + random + SSN.substring(8);
		System.out.println("Your student ID is: " + studentID);
	}
	
	private void genStudentEmail() {
		studentEmail = firstName.substring(0,3) + lastName + "@school.com";
		System.out.println("Your student email adress is: " + studentEmail);
	}
	
	public void enroll() {
		System.out.println("Thank you for enrolling " + firstName + " " + lastName + " at school. Please can you pay the deposit to ensure your spot with us.");
		checkBalance();
	}
	
	public void pay(double amount) {
		String Msg = null;
		balance = balance + amount;
		if (balance < 0) {
			Msg = "Thank you for the deposit. Please pay the remaining amount of $" + (600 - amount) + " before the deadline to guarantee your spot at school.";
			System.out.println(Msg);
		} else {
			Msg = "Thank you for the deposit. We are excited to see you when shcool starts!";
			System.out.println(Msg);
		}

		checkBalance();
	}
	
	public void checkBalance() {
		System.out.println("Your balance is $" + balance);
	}
	
	public void showCourses() {
		System.out.println("The courses we offer are: English, Mathematics, Natural Science, Economics, Life Orientation, Accounting, Physical Education");
	}
	
	public void setPhone(String cell) {
		this.cell = cell;
	}
	
	public String getPhone() {
		return cell;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}	
	
	@Override
	public String toString() {
		return "[Student Name: " + lastName + ", " + firstName + "]\n[Student ID #: " + studentID + "]\n[Student Email: " + studentEmail + "]\n[Student phone #: " + cell + "]\n[Student Location: " + city + ", " + state + "]";
	}
}
