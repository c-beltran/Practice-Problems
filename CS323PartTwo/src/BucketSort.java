import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class BucketSort {
	int count =0;
	int[] sorted_bucket;
	public void bucketSort(int[] sequence, int maxVal, int fnum) throws IOException 
    {
        // Bucket Sort
        int[] Bucket = new int[maxVal + 1];
        sorted_bucket = new int[sequence.length];
 
        for (int i = 0; i < sequence.length; i++){
            Bucket[sequence[i]]++;
        }
        int position = 0;
        for (int i = 0; i < Bucket.length; i++){
            for (int j = 0; j < Bucket[i]; j++){
            	count++;  
                sorted_bucket[position++] = i;
            }
        }
        printArray(sorted_bucket, fnum);
    }
	
	//utility method to print result
    public void printArray(int arr[],int num) throws IOException{
		File fout = new File("BucketOutput//BucketOut"+num+".txt");
		FileOutputStream fos = new FileOutputStream(fout);	 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
		bw.write("Carlos Alberto \n");
		bw.write("\nTotal number of times counter line was executed: " + count+"\n");
	    bw.write("Bucket Sort (Num"+num+".txt): "+"\n");
	    for(int i=0;i<arr.length;i++) {//output array, makes a new line every 20 numbers
			bw.write(arr[i]+(i%20 != 0 || i == 0 ? " " : "\n"));
		}
		count =0;
		bw.close();
		System.out.format("%-40s%s", "\nBucket Sort(Num"+num+".txt) ", "BucketOutput/"+"BucketOut"+num+".txt");
	} 
}
