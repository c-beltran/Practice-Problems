
public class Transmission extends CarPart {

	int tempInCelsius = 90;
	String oilType = "World Standard";
	boolean transInMotion = false;
	
	@Override
	public void function() {
		System.out.println("Transmission draws power from the engine in order to make the axles of the car move.");		
	}

	@Override
	public void carPartInMotion() {
		transInMotion = true;
		System.out.println("Transmission is running...");
		
	}

	@Override
	public void status() {
		if(transInMotion == true){
			int wearAndTear = 25;
			transmissionStatus = transmissionStatus - wearAndTear;
			System.out.println("Transmission has about " + transmissionStatus + "%" + " of life remaining.");
		}
		else if(transmissionStatus <= 25){
			System.out.println("Transmission needs service.");
		}
		else{
			System.out.println("Transmission has failed...");
			transInMotion = false;
		}
	}

}
