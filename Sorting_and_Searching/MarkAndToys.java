import java.util.*;

public class MarkAndToys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int budget = in.nextInt(); 
		
		int[] arr = new int[n];
		
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		Arrays.sort(arr);
		
		int sum = 0;
		int count = 0;
		while (sum < budget) {
			sum += arr[count];
			count++;
		}
		System.out.println(count -1);
	}
}