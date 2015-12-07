class Person {
	
	// Instance variables (data or "state)
	String name;
	int age;
	
	// Classes can contain
	
	// 1. Data
	
	// 2. Subroutine (methods)
	void speak(){
		System.out.println("My name is " + name + " and I am " + age + " years old.");
	}
	
	void sayHello(){
		System.out.println("Hello there!");
	}
}
public class Methods {

	public static void main(String[] args) {
		
		// Create a Person object using the Person class
		Person person1 = new Person();
		person1.name = "Joe Bloggs";
		person1.age = 27;
		person1.speak();
		
		// Create a second Person object
		Person person2 = new Person();
		person2.name = "Sarah Smith";
		person2.age = 20;
		person2.speak();
		person2.sayHello();
		
		Person person3 = new Person();
		person3.name = "Kevin Luciano";
		person3.age = 21;
		
		System.out.println(person1.name);
		System.out.println(person3.name);
	}

}
