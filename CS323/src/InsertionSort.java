// insertion sort
public class InsertionSort extends Sort {

    public void sort(int arr[]) {
    	int size = arr.length; //store size of the array
		counter = 0;
		for(int i=1; i<size; i++){ //loop starting index 1 of array
			int value = arr[i]; //get key value, will be used to swap #'s
			int temp = i-1;
			//move elements of arr[0..i-1] that are
			//greater than value, to one position
			//ahead of their current position
			while(temp>=0 && arr[temp]>value){
				counter = counter+1;
				arr[temp+1] = arr[temp]; //moving an element to the next index
				temp = temp-1; 
			}
			//arr[temp+1] = value; //allocate the value in the new index of temp+1
		}
    }
}
