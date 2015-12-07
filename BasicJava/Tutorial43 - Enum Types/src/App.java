
public class App {
	
	public static void main(String[] args) {
		
		Animal animal = Animal.MOUSE;
		
		switch (animal) {
		case CAT:
			System.out.println("Cat");
			break;
		case DOG:
			System.out.println("Dog");
			break;
		case MOUSE:
			System.out.println("Mouse");
			break;
		default:
			break;

		}
	}

}
