import java.util.*;

public class FindLIS {
	private static int findLIS(int[] s) {
		if(s == null || s.length == 0) return 0;
	 
	    ArrayList<Integer> list = new ArrayList<Integer>(); 
	 
	    for (int num: s) {
	        if (list.size() == 0 || num > list.get(list.size() - 1)) {
	            list.add(num);
	        } else {
	            int i = 0; 
	            int j = list.size() - 1;
	 
	            while (i < j) {
	                int mid = (i + j) / 2;
	                if (list.get(mid) < num) {
	                    i = mid + 1;
	                } else {
	                    j = mid;
	                }
	            }
	            list.set(j, num);
	        }
	    }
	    return list.size();
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		
		System.out.println(findLIS(arr));
	}
}