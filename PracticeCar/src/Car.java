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
		
		for(int i = 0; i < partList.size(); i++){
			if(partList.get(i) instanceof Engine){
				((Engine) partList.get(i)).carPartInMotion();
				((Engine) partList.get(i)).function();
				((Engine) partList.get(i)).status();
				checkSystem();
			}
			else if(partList.get(i) instanceof Transmission){			
				((Transmission) partList.get(i)).carPartInMotion();
				((Transmission) partList.get(i)).function();
				((Transmission) partList.get(i)).status();
				checkSystem();
			}
			else if(partList.get(i) instanceof FuelTank){
				((FuelTank) partList.get(i)).carPartInMotion();
				((FuelTank) partList.get(i)).function();
				((FuelTank) partList.get(i)).status();
				checkSystem();
			}
			else if(partList.get(i) instanceof Wheels){
				((Wheels) partList.get(i)).carPartInMotion();
				((Wheels) partList.get(i)).function();
				((Wheels) partList.get(i)).status();
				checkSystem();
			}
			else if(partList.get(i) instanceof Interior){
				((Interior) partList.get(i)).carPartInMotion();
				((Interior) partList.get(i)).function();
				((Interior) partList.get(i)).status();
				checkSystem();
			}
			else{
				System.out.println("No car parts found :(");
			}
		}
	}
	
	public static void checkSystem(){
		try {
			TimeUnit.SECONDS.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
