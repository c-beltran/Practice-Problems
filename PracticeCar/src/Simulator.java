import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Simulator {

	public static void main(String[] args) throws IOException {
		
		Car<?> newCar = new Car<Object>();		
		BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
		String commandLine;
		
		while(true){
			System.out.println("To start the car, type the 'Start' command");
			commandLine = console.readLine();
			commandLine.toLowerCase();

			// if the user entered a return, just loop again
			if (commandLine.equals("")) continue;
			else{
				
				if(commandLine.equalsIgnoreCase("Start")){
					newCar.run();
					System.out.println("\n-Car has been turned off-");
				}
				else{
					System.out.println("programs ended...");
					System.exit(0);
				}
			}
		}
	}
}
