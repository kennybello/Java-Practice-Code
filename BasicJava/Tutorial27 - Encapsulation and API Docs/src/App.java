/*
 * Try to keep things private if possible 
 * but if it needs to be accessed by a child class then make it protected
 * lastly make it public if it is something that the end user might need to use.
 *  like a constant variable that is final.
 */
class Plant {
	
	public static final int ID = 7;
	private String name;
	
	public String getData() {
		String data = "some stuff" + calculateGrowthForecast();
		
		return data;
	}
	
	private int calculateGrowthForecast() {
		return 9;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

public class App {
	public static void main(String[] args) {
		
	}
}
