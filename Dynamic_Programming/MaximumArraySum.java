import java.util.*;

public class MaximumArraySum {
	
	static int maxArraySum(int[] arr){
		/* Geeks for geeks solution: 
		 * https://www.geeksforgeeks.org/maximum-sum-such-that-no-two-elements-are-adjacent/
		 */
		
		int include = arr[0];
		int exclude = 0;
		int excludeNew = 0;
		
		for (int i = 1; i < arr.length; i++) {
			
			// current max excluding i
			excludeNew = Math.max(include, exclude);

			
			// current max including i
			include = arr[i] + exclude;
			exclude = excludeNew;
			
			//
		}
		return Math.max(include, exclude);
	}
		/*
		 *Hacker rank solution...
		 *
		int left = 0, right = 0, sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum = left;
			left = Math.max(arr[i] + right, left);
			right = sum;
		}
		return Math.max(sum, left);
	}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		
		System.out.println(maxArraySum(arr));
	}
}