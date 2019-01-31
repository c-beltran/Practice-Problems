
public class MultiplesOf3And5 {
	
	public static void main(String[] Args){
		
		int printResult = 0;
		printResult = findMultiple(100);
		//call func
		System.out.println("The sum of the multiples of 3 and 5 is: " + printResult);
				
	}
	
	public static int findMultiple(int n){
		int multOfFive = 0;
		int multOfThree = 0;
		int total = 0;
		
		for(int i=0; i<n; i++){
			if(i%3 == 0){
				multOfThree = multOfThree + i;
			}
			else if(i%5 == 0){
				multOfFive = multOfFive + i;
			}
		}
		
		total = multOfThree + multOfFive;
		
		return total;
	}

}
