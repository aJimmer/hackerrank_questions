public class CountingSort {

	public static int[] countingSort2(int[] unordered, int max) {
		int[] count = new int[max + 1];
		int[] output = new int[unordered.length];
		int index = 0;
		
		for (int i : unordered) count[i]++;
		
		for (int i = max; i >= 0; i--) {
			int c = count[i];
			
			for (int j = 0; j < c; j++) {
				output[index] = i;
				index++;
			}
		}
		return output;
	}
	public static int[] countingSort1(int[] arr, int range){
		
		int[] count = new int[range];
		int[] output = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) count[arr[i]]++;
		
		for (int i = 1; i < range; i++) count[i]+= count[i-1];
		
		for (int i = 0; i < arr.length; i++) {
			output[count[arr[i]]-1] = arr[i];
			count[arr[i]]--;
		}
		return output;
	}
	
	public static void printArray(int[] arr) {
		for(int i : arr){
			System.out.print(i + " ");
		}
		System.out.println("\n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {37, 89, 41, 65, 91, 53};
		int range = 100;
		
		printArray(countingSort1(arr, range));
		
		printArray(countingSort2(arr, range));
	}
}