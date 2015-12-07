
public class App {
	public static void main(String[] args) {
		
		Machine mach1 = new Machine();
		mach1.start();
		
		Person person1 = new Person("Bob");
		person1.greet();
		person1.showinfo();
		
		Info info1 = new Machine();
		info1.showinfo();
		
		Info info2 = person1;
		info2.showinfo();
		
		outputInfo(mach1);
		outputInfo(person1);
	}
	
	private static void outputInfo(Info info) {
		info.showinfo();
	}
}
