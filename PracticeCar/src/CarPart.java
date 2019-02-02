
public abstract class CarPart implements Functional {
	
	public static int engineStatus = 100;
	public static int transmissionStatus = 100;
	public static int fuelTankStatus = 100;
	public static int interiorStatus = 100;
	public static int wheelStatus = 100;
	
	public abstract void function();
	
	public abstract void carPartInMotion();
	
	//method that prints the condition of the part to the console
	public abstract void status();	
}
