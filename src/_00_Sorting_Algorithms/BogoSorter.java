package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	Random r = new Random();

	public BogoSorter() {
		type = "Bogo";
	}

	// Bogo sort is a joke sorting algorithm. It is considered the most
	// inefficient sorting algorithm while still maintaining the possibility
	// of eventually sorting data.

	// It works by following these steps:
	// STEP 1. Is the array in order?
	// if yes, finished; if no, go to step 2.
	// STEP 2. Take two random elements in the array and swap them.
	// STEP 3. Go back to step 1.

	// 1. Complete the sort method using the Bogo sort algorithm.
	@Override

	void sort(int[] array, SortingVisualizer display) {
		boolean inOrder = false;
		while(!inOrder) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					break;
				}
				if(j == array.length-1) {
					inOrder = true;
				}
			}
				int element1 = r.nextInt(array.length-1);
				int element2 = r.nextInt(array.length-1);
				int temp = array[element1];
				array[element1] = array[element2];
				array[element2] = temp;
			display.updateDisplay();
		}

	}
}
