class Machine {
	public void start() {
		System.out.println("Machine started.");
	}
}

class Camera extends Machine{
	public void start() {
		System.out.println("Camera started.");
	}
	
	public void snap() {
		System.out.println("Photo taken.");
	}
}
public class App {
	public static void main(String[] args) {
		
		Machine machine1 = new Machine();
		Camera camera1 = new Camera();
		
		machine1.start();
		camera1.start();
		camera1.snap();
		
		// Upcasting -- from Camera child class to Machine
		Machine machine2 = camera1;
		machine2.start();
		// The type of the variable determines what methods you can call, 
		// but the it is the type of the object that the variable refers to
		// that determines which actual implementations will be called when you call that method.
		// error: machine2.snap();
		
		// Downcasting
		Machine machine3 = new Camera();
		Camera camera2 = (Camera)machine3;
		camera2.snap();
		camera2.start();
		
		// Doesn't work --- runtime error
		Machine machine4 = new Machine();
		//Camera camera3 = (Camera)machine4;
		//camera3.snap();
		//camera3.start();
		
	}
}
