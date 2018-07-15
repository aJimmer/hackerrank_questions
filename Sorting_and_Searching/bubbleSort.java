import java.util.*;

public class bubbleSort {
	public static void bubbleSort(int[] arr) {
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[ j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					count++;
				}
			}
		}
		System.out.println("Array is sorted in " + count + " swaps.\nFirst Element: " + arr[0]+ "\nLast Element: " + arr[arr.length - 1]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		bubbleSort(arr);
	}

}