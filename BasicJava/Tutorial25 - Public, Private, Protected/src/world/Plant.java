package world;

public class Plant {
	
	// Bad practice to make instance variable public
	public String name;
	// Capital name for constant. Acceptable practice
	public final static int ID = 8;
	
	private String type;
	
	protected String size;
	
	int height;
	
	public Plant() {
		this.name = "Freddy";
		this.type = "plant";
		this.size = "medium";
		this.height = 8;
		
	}
}
