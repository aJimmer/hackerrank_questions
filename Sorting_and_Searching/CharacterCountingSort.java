public class CharacterCountingSort {

	public static void countingSort(char[] arr) {
		int n = arr.length;
		char[] output = new char[n];
		int[] count = new int[256];
		
		for (int i = 0; i < n; i++) count[arr[i]]++;	
		
		for (int i = 1; i <= count.length - 1; i++) count[i] += count[i - 1];
		
		for (int i = 0; i < n; i++) {
			output[count[arr[i]] - 1] = arr[i];
			count[arr[i]]--;
		}
		for (int i = 0; i < n; i++) arr[i] = output[i];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char arr[] = {'g', 'e', 'e', 'k', 's', 'f', 'o','r', 'g', 'e', 'e', 'k', 's'};
		
		countingSort(arr);
		
		System.out.println(arr.toString());
	}
}