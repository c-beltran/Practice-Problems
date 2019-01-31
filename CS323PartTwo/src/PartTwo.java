import java.io.FileNotFoundException;
import java.io.IOException;

public class PartTwo {
    public static void main(String[] args) throws IOException {
    	 int[] A ;
    	 int[] B;
    	 int k ;
        CountingSort cSort = new CountingSort();
        BucketSort bSort = new BucketSort();
        RadixSort rSort = new RadixSort();
        ReadFileMain fReader = new ReadFileMain();
        System.out.print("CSCI 323 Sorting Assignment Part Two: \n\n");
		System.out.printf("%-40s%s", "Sorting Algorithm Performed:", "File Location:");
        for(int fnum=8;fnum<257;fnum=fnum*2){ // loop through each num files
        	int[] inputArr = new int[fReader.Reader(fnum).length]; //same size as file Num.txt
        	fReader.arrayTransfer(inputArr, fReader.Reader(fnum)); 
        	
        	A = new int[inputArr.length]; // same size and input Num.txt
        	B = new int[A.length];
        	
        	fReader.arrayTransfer(A, inputArr); //transfer inputArr to A
        	k = fReader.arrayMax(A); // returns max from given array
        	
        	//radix sort
        	rSort.radixSort(A, A.length, fnum);
        	//bucket sort
        	bSort.bucketSort(A, k, fnum);
        	//counting sort
        	cSort.countingSort(A, B, k, fnum);
        }
    } 
}
