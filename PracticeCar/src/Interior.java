
public class Interior extends CarPart {
	
	int seatCount = 4;
	int airbagCount = 6;
	boolean interiorLights = false; // false means off, true means on
	boolean airbagStatus = false;
	
	@Override
	public void function() {
		System.out.println("keep passanger save and comfortable from outside elements");
		
	}

	@Override
	public void carPartInMotion() {
		airbagStatus = true;
		interiorLights = true;
		System.out.println("Interior lights are on and airbags are ready.");
	}

	@Override
	public void status() {
		if(airbagStatus == true){
			int wearAndTear = 25;
			interiorStatus = interiorStatus - wearAndTear;
			System.out.println("One or more interior part has " + interiorStatus + "%" + " of life remaining.");
		}
		else if(wheelStatus <= 25){
			System.out.println("An interior part needs service.");
		}
		else{
			System.out.println("One or more interior part has filed...");
			airbagStatus = false;
		}
	}

}
