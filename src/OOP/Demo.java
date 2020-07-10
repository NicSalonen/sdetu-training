package OOP;

class Person {
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking");
	}
	
	void eat(){
		System.out.println(email);

	}
	
	void sleep() {
		System.out.println(name + " is sleeping");

	}
}

public class Demo {

	public static void main(String[] args) {
		
		// Instantiating an object
		Person person1 = new Person();
		person1.name = "Joe";
		person1.email = "joe@gmail.com";
		person1.phone = "0825243473";
		
		// Abstraction - only want necessary elements, i.e. maybe don't want sleep or eat
		person1.walk();
		person1.sleep();
		person1.eat();
		
		// New person
		
		Person person2 = new Person();
		person2.name = "Sarah";
		person2.email = "sarah@email.com";
		person2.sleep();
		person2.eat();
		
		/*
		// Person 1:
		// Attributes, variables, adjectives, descriptors
		String name = "Joe";
		String email = "joe@gmail.com";
		String phone = "0825243473";
		
		// Action, activity, behaviour
		//System.out.println(name + " is walking");
		walking(name);
		System.out.println(name + " is eating");
		
		// Person 2:
		// Attributes, variables, adjectives, descriptors
		String name2 = "Sarah";
		String email2 = "sarah@gmai.com";
		String phone2 = "0825243474";
		
		// Action, activity, behaviour
		//System.out.println(name2 + " is walking");
		walking(name2);
		System.out.println(name2 + " is eating");
		
		// What about binding attributes and properties together?
		

	}
	
	// Make it quicker by creating a function
	static void walking(String name) {
		System.out.println(name + " is walking");
		*/
	} 

}


