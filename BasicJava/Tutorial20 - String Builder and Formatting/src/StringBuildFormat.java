
public class StringBuildFormat {
	
	public static void main(String[] args) {
		
		// Inefficient
		String info = "";
		
		info += "My name is Bob.";
		info += " ";
		info += "I am a builder.";
		
		System.out.println(info);
		
		// More efficient
		StringBuilder sb = new StringBuilder("");
		
		sb.append("My name is Sue.");
		sb.append(" ");
		sb.append("I am a lion tamer.");
		
		System.out.println(sb.toString());
		
		StringBuilder s = new StringBuilder();
		
		// Method chaining
		s.append("My name is Roger.")
		.append(" ")
		.append("I am a skydiver");
		
		System.out.println(s.toString());
		
		////// Formatting //////////////////////////////////
		
		System.out.println("Here is some text.\tThat was a tab.\nThat was a new line");
		
		// Formatting integers
		System.out.printf("Total cost %10d; quantity is %d\n", 5, 120);
		
		for(int i=0; i<20; i++) {
			System.out.printf("%2d: %s\n", i, "here is some text");
		}
		
		// Formatting floating point value
		System.out.printf("Total value: %.2f\n", 5.699);
		System.out.printf("Total value: %7.1f\n", 342.3245789 );
	}
}
