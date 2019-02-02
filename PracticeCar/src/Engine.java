public class Engine extends CarPart {

	int cylinderCount = 4;
	int tempInCelsius = 90;
	String oilType = "0W30";
	boolean engineStart = false;
	boolean partFailed = false;
	
	
	@Override
	public void function() {
		System.out.println("Engine function is to provide the suficient power to make car do work.");
		
	}
	
	@Override
	public void carPartInMotion() {
		engineStart = true;
		System.out.println("Engine is running...");
	}

	@Override
	public void status() {
		if(partFailed == false){
			if(engineStart == true){
				int wearAndTear = 25;
				engineStatus = engineStatus - wearAndTear;
				System.out.println("Engine has about " + engineStatus + "%" + " of life remaining.");
			}
			if(engineStatus <= 25){
				System.out.println("Engine needs service.");
			}
			if(engineStatus <= 0){
				partFailed = true;
			}
		}
		else{
			System.out.println("ENGINE HAS FILED");
		}
	}
}
