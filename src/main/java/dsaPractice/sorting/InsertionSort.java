package dsaPractice.sorting;

/*
 * Concept: Take one element at a time and insert it into its correct position among
the already sorted elements.

Step 1: The iteration starts from 2nd element. As the element we are going to compare to the left .
*/

class InsertionSort {

	public static void insert(int arr[], int i) {
		// Storing the element to be positioned
		int key = arr[i];
		// Initialize j to the index before i
		int j = i - 1;

		while (j >= 0 && arr[j] > key) {
			arr[j + 1] = arr[j];
			j--;
		}
		// Place the key at its correct position
		arr[j + 1] = key;	//why a[j+1] ->as sorting from left using j+1
	}

	// Function to sort the array using insertion sort algorithm.
	public static void insertionSort(int arr[], int n) {
		// Iterate over the array from the second element
		for (int i = 1; i < n; i++) {
			insert(arr, i);
		}
	}

	public static void main(String[] args) {

		int arr1[] = { 4, 1, 3, 9, 7 };
		int n1 = arr1.length;

		insertionSort(arr1, n1);
		for (int i : arr1) {
			System.out.print(i + " ");
		}
	}
}
