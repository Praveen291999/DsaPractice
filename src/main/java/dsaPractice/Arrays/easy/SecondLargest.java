package dsaPractice.Arrays.easy;

//Concept:Step1: First find the first largest element
//Step 2: Then find the secon largest element
public class SecondLargest {
	public static int print2largest(int arr[], int n) {
		
		// If there are fewer than 2 elements, second largest doesn't exist
		if (n < 2) {
			return -1;
		}
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;	
		// Find the largest element
		for (int i = 0; i < n; i++) {
			if (arr[i] > first) {
				first = arr[i];
			}
		}
		// Find the second largest distinct element
		for (int i = 0; i < n; i++) {
			if (arr[i] > second && arr[i] < first) {
				second = arr[i];
			}
		}
		// If second largest is still Integer.MIN_VALUE, it means there was no second
		// distinct element
		if (second == Integer.MIN_VALUE) {
			return -1;
		}
		return second;
	}
	public static void main(String[] args) {
		int n = 7;
		int[] a = new int[] { 12, 35, 1, 10, 35, 34, 1 };
		System.out.println(print2largest(a, n));
	}
}
