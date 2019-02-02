
public class FuelTank extends CarPart {
	
	int fuelLevel = 100;
	boolean fuelDistribution = false;
	boolean partFailed = false;

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
		if(partFailed == false){
			if(fuelDistribution == true){
				int wearAndTear = 25;
				fuelTankStatus = fuelTankStatus - wearAndTear;
				fuelLevel = fuelLevel - wearAndTear;
				System.out.println("Fuel tank has about " + fuelLevel + "%" + " of life remaining.");
			}
			if(fuelTankStatus <= 25){
				System.out.println("Fuel tank needs to be refilled.");
			}
			if(fuelTankStatus <= 0){
				partFailed = true;
			}
		}
		else{
			System.out.println("FUEL TANK IS EMPTY");
		}
	}
}
