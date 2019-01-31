import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;


public class HeapSort{
	private int count =0;
    public void sort(int arr[],int num) throws IOException{
        int n = arr.length;
        // Building heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            maxHeapify(arr, n, i);
        //extract each individual element of heap
        for (int i=n-1; i>=0; i--){
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            // call max heapify on the reduced heap
            maxHeapify(arr, i, 0);
        }
        printArray(arr,num);
    }
    // n is size of heap
    void maxHeapify(int arr[], int n, int i){
        int largest = i;  // largest is the root
        int left = 2*i + 1;  
        int right = 2*i + 2;  
        
        if (left < n && arr[left] > arr[largest])
            largest = left;
        if (right < n && arr[right] > arr[largest])
            largest = right;
        if (largest != i){
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            count = count+1; //counts number of time line is executed
            maxHeapify(arr, n, largest);
        }
    } 
 
    //utility function to print array
    public void printArray(int arr[],int num) throws IOException{
		File fout = new File("HeapOutput//HeapOut"+num+".txt");
		FileOutputStream fos = new FileOutputStream(fout);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
		bw.write("Carlos Alberto \n");
		bw.write("\nTotal number of times counter line was executed: "+count+"\n");
		bw.write("\nHeap Sort (Num"+num+".txt): "+"\n");
		for(int i=0;i<arr.length;i++) {//output array, makes a new line every 20 numbers
			bw.write(arr[i]+(i%20 != 0 || i == 0 ? " " : "\n"));
		}
		count =0;
		bw.close();
		System.out.format("%-40s%s", "\nHeap Sort(Num"+num+".txt) ", "HeapOutput/"+"HeapOut"+num+".txt");
    }
}