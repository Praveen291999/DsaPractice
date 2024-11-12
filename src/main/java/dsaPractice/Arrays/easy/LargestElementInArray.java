package dsaPractice.Arrays.easy;

public class LargestElementInArray {

	public static int largest(int arr[], int n) {
		int max = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;

	}

	public static void main(String[] args) {
		int n = 7;
		int[] a = new int[] { 1, 2, 0, 3, 2, 4, 5 };
		System.out.println(largest(a, n));

	}

}
