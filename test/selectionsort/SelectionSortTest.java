package selectionsort;

import org.junit.Before;
import org.junit.Test;


public class SelectionSortTest {
	
	private SelectionSort sort = new SelectionSort();
	private int[] ints = new int[10];
	
	@Before
	public void setup(){
		ints[0] = 5;
		ints[1] = 2;
		ints[2] = 7;
		ints[3] = 0;
		ints[4] = 3;
		ints[5] = 8;
		ints[6] = 4;
		ints[7] = 6;
		ints[8] = 1;
		ints[9] = 9;
	}

	@Test
	public void selectionSort() {
		sort.sort(ints);
		
		for (int i = 0; i < ints.length; i++) {
			System.out.println("Selection Sort: " + ints[i]);
		}
	}

}
