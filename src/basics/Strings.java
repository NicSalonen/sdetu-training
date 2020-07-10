package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of the Rings";
		
		if (bookTitle.contains(wordChoice)) {
			System.out.println("The book conatains the word " + wordChoice);
		}
		
		String browser = "Chrome";
		// if (browser == "chrome")
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println("The browser is Chrome");
		}
		
		String firstName = "Nic";
		String lastName = "Salonen";
		String ID = "9405295097085";
		
		System.out.println("There are " + ID.length() + " digits in your ID number.");
		
		// Print initials and last 4 digits of ID
		
		System.out.print(firstName.substring(0, 1));
		System.out.print(lastName.substring(0, 3)); //starts at 0, excludes end index
		System.out.print(ID.substring(9)); //start at index takes rest
	}

}