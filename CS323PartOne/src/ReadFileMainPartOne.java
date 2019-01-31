import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class ReadFileMain {
	public static void main(String[] args) throws IOException {
		ArrayList arrList = new ArrayList();
		QuickSort qSort = new QuickSort();
		MergeSort mSort = new MergeSort();
		insertionSort inSort = new insertionSort();
		HeapSort hSort = new HeapSort();
		System.out.println("CSCI 323 Sorting Assignment Part One: \n");
		System.out.printf("%-40s%s", "Sorting Algorithm Performed:", "File Location:");
		
		int fileNum;
		int max = 16835;
		for(fileNum=8; fileNum<max; fileNum=fileNum*2){
			String fileInput = "NumFilesPartOne//Num"+fileNum+".txt"; 
			Scanner object = new Scanner(new File(fileInput));

			while(object.hasNext()){
				int input = object.nextInt();
				arrList.add(input);
			} 
			
			int[] array = new int[arrList.size()]; 
			//copy arrayList data in Array
			for(int k=0;k<arrList.size();k++){ 
				array[k]=(int) arrList.get(k);
			} //input arraylist in array[int]
			arrList.clear();
		
		    inSort.sort(array,fileNum); 
		    hSort.sort(array,fileNum);
		    qSort.sort(array, 0, array.length-1,fileNum);
		    mSort.sort(array, fileNum);
		    
			object.close();
		}
	}//main
}
