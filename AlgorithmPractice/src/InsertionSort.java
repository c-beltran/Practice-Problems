//insertion sort is useful and efficient
//when sorting a small number of elements
public class InsertionSort {
	public static void main(String[] args){
		//given the following arrays to test
		int A[] = {5,2,4,6,1,3,9,7,10,8};
		int B[] = {15,13,11,17,12,19,16,20,18,14};
		int C[] = {21,30,29,28,27,26,25,24,23,22};
		//array A
		InsertionSort sort1 = new InsertionSort();
		sort1.sortItems(A);
		printAnswer(A);
		
		//array B
		InsertionSort sort2 = new InsertionSort();
		sort2.sortItems(B);
		printAnswer(B);
		
		//array C
		InsertionSort sort3 = new InsertionSort();
		sort3.sortItems(C);
		printAnswer(C);
	}
	
	//insertion sort
	public void sortItems(int arr[]){
		int size = arr.length; //store size of the array
		for(int i=1; i<size; i++){ //loop starting index 1 of array
			int value = arr[i]; //get key value, will be used to swap #'s
			int temp = i-1;
			//move elements of arr[0..i-1] that are
			//greater than value, to one position
			//ahead of their current position
			while(temp>=0 && arr[temp]>value){
				arr[temp+1] = arr[temp]; //moving an element to the next index
				temp = temp-1; 
			}
			arr[temp+1] = value; //allocate the value in the new index of temp+1
		}
	}
	
	//print utility method
	public static void printAnswer(int arr[]){
		int size = arr.length;
		for(int i=0; i<size; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();		
	}
}
