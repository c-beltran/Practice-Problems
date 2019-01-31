// heap sort
public class HeapSort extends Sort {

    public void sort(int[] a) {
	counter = 0;
	heapSort(a);
    }

    private void heapSort(int[] A) {
	buildMaxHeap(A);

	int heapSize = A.length;
	for (int i = A.length - 1; i >= 0; i--) {
	    swap(A, 0, i);
	    heapSize--;
	    maxHeapify(A, 0, heapSize);	
	}
    }

    private void buildMaxHeap(int[] A) {
	int heapSize = A.length;
	for (int i = heapSize / 2; i >= 0; i--) {
	    maxHeapify(A, i, heapSize);
	}
    }

    private void maxHeapify(int[] A, int i, int heapSize) {
	int l = 2 * i + 1;
	int r = 2 * i + 2;
	
	int largest;
	
	if(l < heapSize && A[l] > A[i]) {
	    largest = l;
	} else
	    largest = i;
	
	if(r < heapSize && A[r] > A[largest])
	    largest = r;
	
	if(largest != i) {
	    swap(A, i, largest);
	    counter++;
	    maxHeapify(A, largest, heapSize);
	}
    }

}
