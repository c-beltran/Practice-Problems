import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class QuickSort{
	private int count = 0;	
	public void sort(int [] arr, int low, int hight,int p) throws IOException{
		//call sorting method
		quickSort(arr,low,hight);
		
		//display sorted array
		printArray(arr, p);
	}//sort
	
	public void quickSort(int[] arr, int low, int high) {
		if (arr == null || arr.length == 0)
			return;
		if (low >= high)
			return;
		// pick the pivot
		int middle = low + (high - low) / 2;
		int pivot = arr[middle];
 
		// make left < pivot and right > pivot
		int i = low, j = high;
		
		while (i <= j){
			count=count+1;//count runtime
			while (arr[i] < pivot){
				i++;
				count=count+1;//count runtime
			}
			while (arr[j] > pivot){
				j--;
				count=count+1;//count runtime
			}
			if (i <= j){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}//while
 
		// recursively sort two sub parts
		if (low < j)
			quickSort(arr, low, j);
 
		if (high > i)
			quickSort(arr, i, high);
	}//quickSort
	
    //utility function to print array
	public void printArray(int arr[],int p) throws IOException{

		File fout = new File("QuickOutput//QuickOut"+p+".txt");
		FileOutputStream fos = new FileOutputStream(fout);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
		bw.write("Carlos Alberto \n");
		bw.write("\nTotal number of times counter line was executed: "+count+"\n");
		bw.write("Quick Sorted(Num"+p+".txt): "+"\n");
		for(int i=0;i<arr.length;i++) {//output array, makes a new line every 20 numbers
			bw.write(arr[i]+(i%20 != 0 || i == 0 ? " " : "\n"));
		}
		count =0;
		bw.close();
		System.out.format("%-40s%s", "\nQuick Sort(Num"+p+".txt) ", "QuickOutput/"+"QuickOut"+p+".txt");
	}
}//class