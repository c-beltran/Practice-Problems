import java.util.ArrayList;
import java.util.List;

public class EvenFib {
	
	public static void main(String[] Args){
		int givenNum = 3;
		int getResult = 0;
		
		getResult = getFib(givenNum);
		
		System.out.println(getResult);
		
	}
	
	public static int getFib(int num){
		
		int j, k, l;
		k = 0;
		j = 1;
		l = 1;
		while(k<num){
			
			k = j+l;
			j = k;
		}
		
		return 0;
	}
}
