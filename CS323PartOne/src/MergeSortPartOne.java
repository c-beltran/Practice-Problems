import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class MergeSort {
     
    private int[] array, tempArray;
    private int length, count=0;
 
  //Sorting method 
    public void sort(int arr[],int num) throws IOException {
        this.array = arr;
        this.length = arr.length;
        this.tempArray = new int[length];
        mergeSortRecursive(0, length - 1);
        printArray(arr,num);
    }
 
    private void mergeSortRecursive(int lowerIndex, int higherIndex) {
		//check if the index's are equal (base case)
    	if(lowerIndex == higherIndex){ return; }
    	else if(lowerIndex < higherIndex) {
    		//create a new var and find the middle point to divide the array
            int midIndex = lowerIndex + (higherIndex - lowerIndex) / 2;
            //call mergeSort on the first half of the list
            mergeSortRecursive(lowerIndex, midIndex);
            //call mergeSort on the second half of list
            mergeSortRecursive(midIndex + 1, higherIndex);
            //merge both lists
            merge(lowerIndex, midIndex, higherIndex);
        }
    }
 
    private void merge(int lowerIndex, int midIndex, int higherIndex) {
 
        for (int i=lowerIndex; i<=higherIndex; i++) {
            tempArray[i] = array[i];
            count = count+1;  //counts number of time line is executed
        }
        int i = lowerIndex;
        int j = midIndex + 1;
        int k = lowerIndex;
        while (i <= midIndex && j <= higherIndex) {
            if (tempArray[i] <= tempArray[j]) {
                array[k] = tempArray[i];
                i++;
            } else {
                array[k] = tempArray[j];
                j++;
            }
            k++;
        }
        while (i <= midIndex) {
            array[k] = tempArray[i];
            k++;
            i++;
        }
    }
    //utility function to print array
    public void printArray(int arr[],int num) throws IOException{
		File fout = new File("MergeOutput//MergeOut"+num+".txt");
		FileOutputStream fos = new FileOutputStream(fout);	 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
		bw.write("Carlos Alberto \n");
		bw.write("\nTotal number of times counter line was executed: "+count+"\n");
	    bw.write("Merge Sort (Num"+num+".txt): "+"\n");
	    for(int i=0;i<arr.length;i++) {//output array, makes a new line every 20 numbers
			bw.write(arr[i]+(i%20 != 0 || i == 0 ? " " : "\n"));
		}
		count =0;
		bw.close();
		System.out.format("%-40s%s", "\nMerge Sort(Num"+num+".txt) ", "MergetOutput/"+"MergeOut"+num+".txt");
	}  
}