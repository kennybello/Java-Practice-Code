class Person {
	
	// Instance variables (data or "state)
	String name;
	int age;
	
	// Classes can contain
	
	// 1. Data
	// 2. Subroutine (methods)
}
public class App {

	public static void main(String[] args) {		
		Person person1 = new Person();
		person1.name = "Joe Bloggs";
		person1.age = 27;
		
		Person person2 = new Person();
		person2.name = "Sarah Smith";
		person2.age = 20;
		
		Person person3 = new Person();
		person3.name = "Kevin Luciano";
		person3.age = 21;
		
		System.out.println(person1.name);
		System.out.println(person3.name);
	}

}
