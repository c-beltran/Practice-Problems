import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class RadixSort {
	int count =0;
	
    private int getMax(int arr[], int n)
    {
        int mx = arr[0];
        for (int i = 1; i < n; i++)
            if (arr[i] > mx)
                mx = arr[i];
        return mx;
    }
 
    private void countSort(int arr[], int n, int digit)
    {
        int B[] = new int[n]; // output array
        int i;
        int C[] = new int[10];
        for(int x=0;x<C.length;x++){
            C[x] = 0;

        }
        for (i = 0; i < n; i++){
            C[ (arr[i]/digit)%10 ]++;
        }
        for (i = 1; i < 10; i++){
            C[i] += C[i - 1];
        }
        for (i = n - 1; i >= 0; i--){
        	count++;
            B[C[ (arr[i]/digit)%10 ] - 1] = arr[i];
            C[ (arr[i]/digit)%10 ]--;
        }

        for (i = 0; i < n; i++){
            arr[i] = B[i];
        }
    }

    public void radixSort(int arr[], int n, int fnum) throws IOException
    {
        int m = getMax(arr, n);
 
        for (int exp = 1; m/exp > 0; exp *= 10){
            countSort(arr, n, exp);
        }
        printArray(arr, fnum);
    }
 
  //utility method to print result
    public void printArray(int arr[],int num) throws IOException{
		File fout = new File("RadixOutput//RadixOut"+num+".txt");
		FileOutputStream fos = new FileOutputStream(fout);	 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
		bw.write("Carlos Alberto \n");
		bw.write("\nTotal number of times counter line was executed: " + count+"\n");
	    bw.write("Radix Sort (Num"+num+".txt): \n");
		for(int i=0;i<arr.length;i++) {//output array, makes a new line every 20 numbers
			bw.write(arr[i]+(i%20 != 0 || i == 0 ? " " : "\n"));
		}
		count =0;
		bw.close();
		System.out.format("%-40s%s", "\nRadix Sort(Num"+num+".txt) ", "RadixOutput/"+"RadixOut"+num+".txt");
	}  
}