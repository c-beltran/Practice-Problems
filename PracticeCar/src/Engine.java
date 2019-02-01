public class Engine extends CarPart {

	int cylinderCount = 4;
	int tempInCelsius = 90;
	String oilType = "0W30";
	boolean engineStart = false;
	
	
	@Override
	public void function() {
		System.out.println("Engine function is to provide the suficient power to make car do work.");
		
	}

	@Override
	public void status() {
		if(engineStart == true){
			int wearAndTear = 25;
			engineStatus = engineStatus - wearAndTear;
		}
		System.out.println("Engine has about " + engineStatus + "%" + " of life remaining.");
		
	}

	@Override
	public void carPartInMotion() {
		engineStart = true;
		System.out.println("Engine is running...");
	}

}
