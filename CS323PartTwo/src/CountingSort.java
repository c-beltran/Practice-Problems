import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class CountingSort {
    int count =0;
    public void countingSort(int[]A,int[]B,int k,int fnum) throws IOException{

        int  [] C = new int[k+1];

        for(int i=0;i<=k;i++){ // initialize elements to zero
            C[i] = 0;
        }
        for(int j=0;j<A.length;j++){
            C[A[j]] = C[A[j]]+1;
        }
        for(int i=1;i<=k;i++ ){ 
            C[i] = C[i]+C[i-1];
        }
        for(int j =(A.length-1);j>=0;j--){
            int temp =A[j]; 
        	count++;
               B[C[temp]-1] = temp;
               C[temp] = C[temp] -1;
        }
        printArray(B, fnum);
    } 
    //utility method to get max val
    public int getMax(int arr[], int n){
        int maxVal = arr[0];
        for (int i = 1; i < n; i++){
            if (arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    
  //utility method to print result
    public void printArray(int arr[],int num) throws IOException{
		File fout = new File("CountingOutput//CountingOut"+num+".txt");
		FileOutputStream fos = new FileOutputStream(fout);	 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
		bw.write("Carlos Alberto \n");
		bw.write("\nTotal number of times counter line was executed: " + count+"\n");
	    bw.write("Counting Sort (Num"+num+".txt): "+"\n");
	    for(int i=0;i<arr.length;i++) {//output array, makes a new line every 20 numbers
			bw.write(arr[i]+(i%20 != 0 || i == 0 ? " " : "\n"));
		}
		count =0;
		bw.close();
		System.out.format("%-40s%s", "\nCounting Sort(Num"+num+".txt) ", "CountingOutput/"+"CountingOut"+num+".txt");
	}

}