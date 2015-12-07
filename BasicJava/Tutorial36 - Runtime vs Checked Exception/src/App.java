
public class App {
	 public static void main(String[] args) {
		 // This is a checked exception, which must be handled before compiling
		try {
			Thread.sleep(222);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 
		 // This is a runtime exception, which will compile, but we display an error.
		 int value = 7;
		 value = value/0;
		 
		 // This is a child class of runtime, which is a null pointer exception.
		 String text = null;
		 System.out.println(text.length());
		 
		 // This is a child of runtime exception, ArrayIndexOutOfBounds. 
		 String[] texts = {"one", "two", "three"};
		 System.out.println(texts[3]);
		 
	}
}
