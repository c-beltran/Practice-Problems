import java.util.concurrent.TimeUnit;

public class Car {
	
	Engine TYT2JZ = new Engine();
	Transmission fiveSpeed = new Transmission();
	
	public void run(){
		System.out.println("Turning car on...");
		TYT2JZ.carPartInMotion();
		TYT2JZ.function();
		TYT2JZ.status();
		
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		fiveSpeed.carPartInMotion();
		fiveSpeed.function();
		fiveSpeed.status();
	}

}
