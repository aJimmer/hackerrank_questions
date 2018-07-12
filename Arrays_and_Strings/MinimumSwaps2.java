import java.util.*;

public class MinimumSwaps2 {
	public static void minimumSwaps(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] != i+1) {
				int j = i;
				while (arr[j] != i+1) {
					j++;
				}
				
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++){
			arr[i] = in.nextInt();
		}
		
		minimumSwaps(arr);
	}
}