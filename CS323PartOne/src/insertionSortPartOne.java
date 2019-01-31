import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

class insertionSort{

	void sort(int[]arr,int num) throws IOException{
		int count =0;
		for (int j = 1; j < arr.length; j++){
	        int key = arr[j];
	         int i = j - 1;
	         //move elements of arr[0..i-1] that are
	         //greater than value, to one position
	         //ahead of their current position
	        while (i >= 0 && arr[i] > key ){
	        	count = count +1; //counts number of time line is executed
	            arr[i+1] = arr[i];
	            i=i-1;
	           
	        } arr[i+1] = key;	
	    }//insertion sort

		//print array
		File fout = new File("InsertionOutput//InsertionOut"+num+".txt");	
		FileOutputStream fos = new FileOutputStream(fout);	 
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
		bw.write("Carlos Alberto \n");
		bw.write("\nTotal number of times counter line was executed: "+count+"\n");
		bw.write("Insertion Sorted(Num"+num+".txt): "+"\n");
		for(int i=0;i<arr.length;i++) {//output array, makes a new line every 20 numbers
			bw.write(arr[i]+(i%20 != 0 || i == 0 ? " " : "\n"));
		}
		count =0;
		bw.close();
		System.out.print("\nInsertion Sort(Num"+num+".txt) "+"\t"+"\t"+"InsertionOutput/"+"InsertionOut"+num+".txt");	   
	}
}