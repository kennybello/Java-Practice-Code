import java.util.Scanner;


public class DoWhile {
	public static void main(String[] args) {
		
		int value;
		
		Scanner scanner = new Scanner(System.in);
		
		/*
		System.out.println("Enter a number: ");
		
		int value = scanner.nextInt();
		
		while (value != 5) {
			System.out.println("Enter a number: ");
			value = scanner.nextInt();
			
		}
		*/
		
		do {
			System.out.println("Eneter a number: ");
			value = scanner.nextInt();
			
		} while (value != 5);
		
		System.out.println("Got 5!");
	}
}
