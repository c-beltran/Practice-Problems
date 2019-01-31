
public class MergeSortAlgo {
	public static void main(String[] Args){

		int arr[] = {12, 11, 13, 5, 6, 7};
		System.out.println("given array");
		printfunc(arr, arr.length);
//		MergeSortAlgo list1 = new MergeSortAlgo();
//		MergeSortAlgo list2 = new MergeSortAlgo();
//		int arr_size = arr.length/arr[0];
//		
//		list1.mergeSort(arr, 0, arr_size -1);
	}
	
	public void mergeSort(int[] list, int lowIndex, int highIndex){
		//check if the index's are equal
		if(lowIndex == highIndex){ return; }
		else{
			//create a new var and find the middle point to divide the array
			int midIndex = (lowIndex + highIndex)/2;
			//call mergeSort on the first half of the list
			mergeSort(list, lowIndex, midIndex);
			//call mergeSort on the second half of list
			mergeSort(list, midIndex, highIndex);
			merge(list, lowIndex, midIndex, highIndex);
		}
	}
	
	public void merge(int[] list, int low, int mid, int high){
		//find the size of two subarrays to be merged
		int size1 = low - mid + 1;
		int size2 = high - mid;
		
		//create temp arrays
		int temparr1[] = new int[size1];
		int temparr2[] = new int[size2];
		
		//copy data to temp arrays
		for(int i=0; i<size1; i++){
			temparr1[i] = list[low + 1];
		}
		for(int j=0; j<size2; j++){
			temparr2[j] = list[mid + 1 + j];
		}
		
		//merge the temp arrays
	
		//initialize index of first and second subarray
		int i=0,j=0;
		//initial index of merged subarray
		int k = low;
		while(i< size1 && j < size2){
			if(temparr1[i] <= temparr2[j]){
				list[k] = temparr1[i];
				i++;
			}
			else{
				list[k] = temparr2[j];
				j++;
			}
			k++;
		}
		//copy remaining elements of temparr1[] if any
		while(i < size1){
			list[k] = temparr1[i];
			i++;
			k++;
		}
		//copy remaining elements of temparr2[] if any
		while(j < size2){
			list[k] = temparr2[j];
			j++;
			k++;
		}
	}
	
	//print function
	public static void printfunc(int arr[], int size){
		for(int i=0; i<arr.length; i++){
			System.out.println("%d" + arr[i]);
		}
		System.out.println();
	}
}
