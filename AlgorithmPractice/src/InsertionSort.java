//insertion sort is useful and efficient
//when sorting a small number of elements
public class InsertionSort {
	public static void main(String[] args){
		//given the following array
		int A[] = {5,2,4,6,1,3};
		int size = A.length;
		for(int j=1; j<size; j++){
			int key = A[j];
			int i = j-1;
			while( i >= 0 && A[i] > key){
				A[i+1] = A[i];
				i = i-1;
				A[i+1] = key;
			}
			
//			System.out.print(key);
		}
		for(int i=0; i<A.length; i++){
			System.out.print(A[i]);
		}
	}
}