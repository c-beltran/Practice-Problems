
public class FuelTank extends CarPart {
	
	int fuelLevel = 100;
	boolean fuelDistribution = false;

	@Override
	public void function() {
		System.out.println("Fuel tank stores the fuel necessary to keep the engine in motion.");	
	}

	@Override
	public void carPartInMotion() {
		fuelDistribution = true;
		System.out.println("Fuel is being distributed to engine...");
		
	}

	@Override
	public void status() {
		if(fuelDistribution == true){
			int wearAndTear = 25;
			transmissionStatus = transmissionStatus - wearAndTear;
			fuelLevel = fuelLevel - wearAndTear;
			System.out.println("Fuel tank has about " + fuelLevel + "%" + " of life remaining.");
		}
		else if(transmissionStatus <= 25){
			System.out.println("Fuel tank needs to be refilled.");
		}
		else{
			System.out.println("Fuel tank is empty...");
			fuelDistribution = false;
		}
		
	}

}
