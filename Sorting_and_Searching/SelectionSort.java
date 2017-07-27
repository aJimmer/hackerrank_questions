public class SelectionSort {
	public static void selectionSort(int[] arr) {
		
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {89, 45, 68, 90, 29, 34, 17};
		
		printArray(arr);
		selectionSort(arr);
		printArray(arr);	
	}
	private static void printArray(int[] arr){
		for (int n : arr) {
			System.out.print(n + " ");
		}
		System.out.println("");
	}
}