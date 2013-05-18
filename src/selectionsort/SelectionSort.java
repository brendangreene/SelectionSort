package selectionsort;

public class SelectionSort {

	/**
	 * The implementation for Selection Sort
	 * 
	 * @param ints
	 */
	public void sort(int[] ints) {
		// nested for loop..first indicator this may be an N^2 algorithm
		for (int i = 0; i < ints.length; i++) {
			int min = i;
			// find smallest for index: i
			for (int j = i+1; j < ints.length; j++){
				// Example: If 2 is less than 5? Then min = 2
				if(ints[j] < ints[min]){
					min = j;
				}
			}
			//"Swap values: ints[i] and ints[min]
			swap(ints, i, min);
		}
	}

	/**
	 * Method to swap array values
	 * 
	 * @param ints
	 * @param j
	 * @param min
	 */
	private void swap(int[] ints, Integer j, Integer min) {
		int temp = ints[j];
		ints[j] = ints[min];
		ints[min] = temp;
	}
}
