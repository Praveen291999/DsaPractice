package dsaPractice.sorting;

//Need to solve	

/*
 * ->Step 1: Pick a pivot element(any random element in the array)
Step 2: Place the number in the correct order in the sorted array.
Step 3: After placing the pivot number in the correct place sort number greater than pivot value on the right and lesser value on the left.
Step 4:Repeat the same steps for he left and right side of the array.
To solve: use 2 pointers low and high ->first index and last index of the array.
->In i->get the highest elem j->gets the lowest elem : swap them
->Continue same process I and j crosses each other stop , don’t swap 
After finding 1st correct order pivot value.
->  quickSort(arr, low, pi - 1);     ->low starting index of the left subarray and 
pi - 1 is the index just before the pivot, marking the end of the left subarray.
quickSort(arr, pi + 1, high);  -> pi + 1 is the index just after the pivot, marking the start of the right subarray.
high is the ending index of the current subarray.
*/

 public class QuickSort {
    // Function to sort an array using quick sort algorithm.
    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            // pi is the partitioning index, arr[pi] is now at right place
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Function to partition the array on the basis of pivot element
    static int partition(int arr[], int low, int high) {
        int pivot = arr[high]; // pivot
        int i = (low - 1); // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }


    public static void main(String args[]) {
        int arr[] = { 2, 1, 6, 10, 4, 1, 3, 9, 7 };
        int n = arr.length;

        quickSort(arr, 0, n-1);

        // Print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
