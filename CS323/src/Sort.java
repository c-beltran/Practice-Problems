//base class to represent each sort
public abstract class Sort {

    // data to be calculated
    protected int counter;

    public Sort() {
	counter = 0;
    }

    // to swap two numbers
    public void swap(int[] a, int i, int j) {
	int temp = a[i];
	a[i] = a[j];
	a[j] = temp;
    }
    
    public void validateSorted(int[] a) {
	for (int i = 1; i < a.length; i++) {
	    if(a[i-1] > a[i])
		throw new RuntimeException();
	}
    }

    // abstract method, needed to be implemented by each child class
    public abstract void sort(int[] a);

    public int getCounter() {
	return counter;
    }
}
