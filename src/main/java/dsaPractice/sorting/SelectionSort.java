package dsaPractice.sorting;

//why n-1 in for loop 
//because we are not going to compare the last element because while it reaches last index 
//already would have been sorted

/*Concept:Sort the array in the ascending order.
 * 
 * Pushes the minimum to the first
 * 
Step 1: Find the minimum element and swap it with array.
Step 2: Follow the same for till the end of the loop.
*/

public class SelectionSort {
	// Method to select the minimum element index in the unsorted part of the array
	public static int select(int arr[], int i) {
		int minIndex = i;
		for (int j = i + 1; j < arr.length; j++) {
			if (arr[j] < arr[minIndex]) {
				minIndex = j;
			}
		}
		return minIndex;
	}

	// Method to sort the array using selection sort
	public static void selectionSort(int arr[], int n) {
		for (int i = 0; i < n-1; i++) {
			// Select the minimum element in the unsorted part of the array
			int minIndex = select(arr, i);

			// Swap the found minimum element with the first element of the unsorted part
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}

	public static void main(String[] args) {

		int[] arr = { 8, 1, 3, 9, 5, 4 };
		int n = arr.length;

		selectionSort(arr, n);

		// Print the sorted array
		for (int i : arr) {
			System.out.print(i +" ");
		}
	}
}
