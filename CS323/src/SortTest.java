import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SortTest {

    public static void main(String[] args) throws FileNotFoundException {
	// sorts
	Sort[] sorts = { new InsertionSort(), new MergeSort(), new HeapSort(), new QuickSort() };

	// files
	String[] files = { "Num8.txt", "Num16.txt", "Num32.txt", "Num64.txt", "Num128.txt", "Num256.txt", "Num512.txt",
		"Num1024.txt", "Num2048.txt", "Num4096.txt", "Num8192.txt", "Num16384.txt" };

	// size of each file
	int[] sizes = { 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384 };

	// to store counters
	int[][] counts = new int[sorts.length][files.length];

	// to store sorted arrays
	int[][][] sortedArrays = new int[sorts.length][files.length][];

	// read arrays , sort and store results
	for (int sortNum = 0; sortNum < sortedArrays.length; sortNum++) {
	    Sort sort = sorts[sortNum];
	    for (int fileNum = 0; fileNum < files.length; fileNum++) {
		int[] array = readArray(files[fileNum], sizes[fileNum]);
		sort.sort(array);
		sort.validateSorted(array);
		counts[sortNum][fileNum] = sort.getCounter();
		sortedArrays[sortNum][fileNum] = array;
	    }
	}

	// sort index
	// see sorts array
	int sortNum = 0;

	
	// UNCOMMENT TO PRINT SORTED ARRAYS
	/*//print results
	for (int i = 0; i < sizes.length; i++) {
	    System.out.println("\n\fNum" + sizes[i] + ".txt");
	    if (sizes[i] < 100)
		printArray(sortedArrays[sortNum][i], 0, sizes[i] - 1);
	    else
		printArray(sortedArrays[sortNum][i], 51, 100);
	}*/
	
	// to print the data set size and number of steps taken
	for (int fileNum = 0; fileNum < files.length; fileNum++) {
	    System.out.printf("this is file size" + sizes[fileNum] + "");
	    for (sortNum = 0; sortNum < sortedArrays.length; sortNum++) {
		System.out.printf("\t" + counts[sortNum][fileNum]);
	    }
	    System.out.println();
	  }
	}

    // print array
    public static void printArray(int[] a, int from, int to) {
	for (int i = from; i <= to; i++) {
	    System.out.println(a[i]);
	}
    }

    // read array
    public static int[] readArray(String fileName, int size) throws FileNotFoundException {
	Scanner scanner = new Scanner(new File(fileName));
	int[] a = new int[size];
	for (int i = 0; i < a.length; i++) {
	    a[i] = scanner.nextInt();
	}
	scanner.close();
	return a;
    }
}

