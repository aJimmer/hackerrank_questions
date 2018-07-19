import java.util.*;

public class CoinChangeProblem {
	
	static int getWays(int [] arr, int n){
		int[] table = new int[arr.length];
		table[0] = 1;
		for (int i = 0; i < n; i++){
			for (int j = arr[i]; j <= arr.length - 1; j++){
				table[j] += table [j - arr[i]];
			}
		}
		return table[arr.length - 1];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int m = in.nextInt();
		int[] arr = new int[m];
		for (int i = 0; i < m; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println(getWays(arr, m));
	}
}
