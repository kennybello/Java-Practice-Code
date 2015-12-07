import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;


public class App {
	
	public static void main(String[] args) {
		Test test = new Test();
		
		/*try {
			test.run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			System.out.println("Couldn't parse command file.");
		}*/
		
		/*try {
			test.run();
		} catch (IOException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		try {
			test.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			test.input();
		// FileNotFound is first because it is a child class of IOException. If IO was first then it would catch it 
		// even if it was a FileNotFound.
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
