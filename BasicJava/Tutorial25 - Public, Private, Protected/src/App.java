import world.Plant;

/*
 * private --- only within same class
 * public --- from everywhere
 * protected --- subclass and same package
 * no modifier --- same package only
 */

public class App {
	public static void main(String[] args) {
		Plant plant = new Plant();
		
		System.out.println(plant.name);
		
		System.out.println(plant.ID);
		
		// size is protected: App is not in the same package as Plant
		// Won't work
		//System.out.println(plant.size);
		
		// Won't work; App and plant not in same package, height has package-level visibility.
		//System.out.println(plant.height);
	}
}
