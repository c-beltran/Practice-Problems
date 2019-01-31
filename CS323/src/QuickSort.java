//QUICK SORT
public class QuickSort extends Sort {

    public void sort(int[] a) {
	counter = 0;
	quickSort(a, 0, a.length - 1);
    }

    private void quickSort(int[] array, int p, int r) {
	if (p < r) {
	    int q = partition(array, p, r);
	    quickSort(array, p, q - 1);
	    quickSort(array, q + 1, r);
	}
    }

    private int partition(int[] array, int p, int r) {

	int x = array[r];
	int i = p - 1;
	for (int j = p; j <= r - 1; j++) {
	    counter++;
	    if (array[j] < x) {
		i++;
		swap(array, i, j);
	    }
	}

	swap(array, i + 1, r);

	return i + 1;
    }

}