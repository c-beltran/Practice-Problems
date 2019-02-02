import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Car<E> {
	
	ArrayList<E> partList = new ArrayList<E>();
	
	public Car(){
		Engine TYT2JZ = new Engine();
		partList.add((E) TYT2JZ);
		Transmission fiveSpeed = new Transmission();
		partList.add((E) fiveSpeed);
		FuelTank fuelTank = new FuelTank();
		partList.add((E) fuelTank);
		Wheels tires = new Wheels();
		partList.add((E) tires);
		Interior interior = new Interior();
		partList.add((E) interior);
	}
	
	public void run(){
		
		for(int i = 0; i < 3; i++){
			
			if(partList.get(i) instanceof Engine){
				((Engine) partList.get(i)).carPartInMotion();
				((Engine) partList.get(i)).function();
				((Engine) partList.get(i)).status();
			}
			else if(partList.get(i) instanceof Transmission){			
				((Transmission) partList.get(i)).carPartInMotion();
				((Transmission) partList.get(i)).function();
				((Transmission) partList.get(i)).status();
			}
			else if(partList.get(i) instanceof FuelTank){
				((FuelTank) partList.get(i)).carPartInMotion();
				((FuelTank) partList.get(i)).function();
				((FuelTank) partList.get(i)).status();
			}
			else if(partList.get(i) instanceof Wheels){
				((Wheels) partList.get(i)).carPartInMotion();
				((Wheels) partList.get(i)).function();
				((Wheels) partList.get(i)).status();
			}
			else if(partList.get(i) instanceof Interior){
				((Interior) partList.get(i)).carPartInMotion();
				((Interior) partList.get(i)).function();
				((Interior) partList.get(i)).status();
			}
			else{
				System.out.println("No car parts found :(");
			}
		}
		
//		System.out.println("Turning car on...");
//		TYT2JZ.carPartInMotion();
//		TYT2JZ.function();
//		TYT2JZ.status();
//		
//		try {
//			TimeUnit.SECONDS.sleep(5);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		fiveSpeed.carPartInMotion();
//		fiveSpeed.function();
//		fiveSpeed.status();
	}

}
