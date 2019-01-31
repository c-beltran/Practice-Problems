
public class CarPart {
	
	public static int engineStatus = 100;
	public static int transmissionStatus = 100;
	public static int fuelTankStatus = 100;
	public static int interiorStatus = 100;
	
	//method that prints the condition of the part to the console
	public void status(){
		if(engineStatus == 100 && transmissionStatus == 100 && fuelTankStatus == 100 && interiorStatus == 100){
			System.out.println("All car parts are new, there is nothing to worry about.");
		}
		else if(engineStatus <= 75){
			System.out.println("Engine has about 75% of life remaining.");
		}
		else if(transmissionStatus <= 75){
			System.out.println("Transmission has about 75% of life remaining.");
		}
		else if(fuelTankStatus <= 75){
			System.out.println("Fuel tank has about 75% of life remaining.");
		}
		else if(interiorStatus <= 75){
			System.out.println("The interior has about 75% of life remaining.");
		}
		else if(engineStatus <= 50){
			System.out.println("Engine has about 50% of life remaining.");
		}
		else if(transmissionStatus <= 50){
			System.out.println("Transmission has about 50% of life remaining.");
		}
		else if(fuelTankStatus <= 50){
			System.out.println("Fuel tank has about 50% of life remaining.");
		}
		else if(interiorStatus <= 50){
			System.out.println("The interior has about 50% of life remaining.");
		}
		else if(engineStatus <= 25){
			System.out.println("Engine has about 25% of life remaining.");
		}
		else if(transmissionStatus <= 25){
			System.out.println("Transmission has about 25% of life remaining.");
		}
		else if(fuelTankStatus <= 25){
			System.out.println("Fuel tank has about 25% of life remaining.");
		}
		else if(interiorStatus <= 25){
			System.out.println("The interior has about 25% of life remaining.");
		}
		else if(engineStatus <= 10){
			System.out.println("Engine needs replacement.");
		}
		else if(transmissionStatus <= 10){
			System.out.println("Transmission needs replacement.");
		}
		else if(fuelTankStatus <= 10){
			System.out.println("Fuel tank needs replacement.");
		}
		else if(interiorStatus <= 10){
			System.out.println("One or more interior parts needs replacement.");
		}
		else{
			System.out.println("**The car has stopped working due to one or more broken parts**");
		}
	}
}
