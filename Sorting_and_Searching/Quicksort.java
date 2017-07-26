public class Quicksort {
	public static void quicksort(int[] ar, int low, int high) {
		if (ar == null || ar.length == 0)
			return;
 
		if (low >= high)
			return;
	
		int middle = low + (high - low) / 2;
		int pivot = ar[middle];
		
		int i = low;
		int j = high;
		while (i <= j) {
			while (ar[i] < pivot) i++;
			while (ar[j] > pivot) j--;
			if (i <= j) {
				int temp = ar[i];
				ar[i] = ar[j];
				ar[j] = temp;
				i++;
				j--;
			}
		}
		if (low < j) quicksort(ar, low, j);
		if (high > i) quicksort(ar, i, high);
 	}
    public static void main(String[] args) {
        int[] test1 = { 5, 3, 1, 9, 8, 2, 4, 7};
        int[] test2 = {4, 5, 3, 7, 2};
        int[] test3 = {4, 1, 10, 8, 7, 12, 9, 2, 15};
        int[] test4 = {5, 8, 1, 3, 7, 9, 2};
        
        quicksort(test4, 0, test4.length - 1);
        
        printArray(test4);
    }

    private static void printArray(int ar[]) {
        for (int n: ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}