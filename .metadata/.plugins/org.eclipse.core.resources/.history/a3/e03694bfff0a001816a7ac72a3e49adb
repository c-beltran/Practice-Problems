
public class MergeSortAlgo {
	public static void main(String[] Args){
		MergeSortAlgo list1 = new MergeSortAlgo();
		MergeSortAlgo list2 = new MergeSortAlgo();
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
			
		}
	}
}
