package dsaPractice.sorting;

//why n-1 in for loop 

//because we are not going to compare the last element because while it reaches last index 
//already would have been sorted

/*Concept:Sort the array in the ascending order.
 * 
 * Pushes the maximum to the last
 * 
Step 1: Find the maximum element and do adjacent swaps
Step 2: After the first step the 1st max element will be there at the last index, now
 leave the last index and continue with the step 1 till the end of the loop.   
 
*/

public class BubbleSort {

	public static void bubbleSort(int arr[], int n) {

		for (int i = 0; i < n - 1; i++) {
			// Last i elements are already sorted
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					// Swap arr[j] and arr[j + 1]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}

		}
	}

	public static void main(String[] args) {
		int[] arr1 = { 4, 1, 3, 9, 7 };
		bubbleSort(arr1, arr1.length);
		System.out.println("Sorted array:");
		for (int value : arr1) {
			System.out.print(value + " ");
		}
	}
}
