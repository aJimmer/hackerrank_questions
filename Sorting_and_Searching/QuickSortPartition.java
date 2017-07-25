
public class QuickSortPartition {

	public static void lomutoPartition(int[] ar) {
		int pivot = ar[0];
		int s = 0;
		
		for (int i = s + 1; i < ar.length; i++) {
			if (ar[i] < pivot) {
				s += 1;
				ar = swap(s, i, ar);
				printArray(ar);
			}
		}
		ar = swap(0, s, ar);
		printArray(ar);
	}

	public static void hoarePartition(int[] ar) {
		int pivot = ar[0];
		int i = 1;
		int j = ar.length - 1;

		while (i < j) {

			while (ar[i] < pivot) {
				i += 1;	
			}
			while (ar[j] > pivot) {
				j -= 1;
			}
			ar = swap(i, j, ar);
		}
		ar = swap(i, j, ar);
		ar = swap(0, j, ar);
		printArray(ar);
	}

    public static void main(String[] args) {

        int[] test1 = { 5, 3, 1, 9, 8, 2, 4, 7};
        int[] test2 = {4, 5, 3, 7, 2};
        int[] test3 = {4, 1, 10, 8, 7, 12, 9, 2, 15};
        hoarePartition(test1);
        lomutoPartition(test3);
    }
    
    private static int[] swap(int a, int b, int[] ar) {

    	int temp = ar[a];
    	ar[a] = ar[b];
    	ar[b] = temp;
  
    	return ar;
    }
    
    private static void printArray(int ar[]) {
        for (int n: ar) {
            System.out.print(n + " ");
        }
        System.out.println("");
    }
}