
public class Wheels extends CarPart {

	int tirePressure = 35;
	int tireSize = 17;
	String tireType = "Yokohama";
	boolean tireInMotion = false;
	
	@Override
	public void function() {
		System.out.println("Wheels keep the car firm on the ground and provide traction");
	}

	@Override
	public void carPartInMotion() {
		tireInMotion = true;
		System.out.println("Tires are moving..");
	}

	@Override
	public void status() {
		if(tireInMotion == true){
			int wearAndTear = 25;
			wheelStatus = wheelStatus - wearAndTear;
			System.out.println("Wheels has about " + wheelStatus + "%" + " of life remaining.");
		}
		else if(wheelStatus <= 25){
			System.out.println("Wheels need service.");
		}
		else{
			System.out.println("Wheels need to be replaced...");
			tireInMotion = false;
		}
		
	}

}
