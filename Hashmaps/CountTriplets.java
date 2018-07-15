import java.util.*;

public class CountTriplets {
	public static int countTriplets(long[] arr, int r) {
		int count = 0;
		
		Map<Long, Long> map1 = new HashMap<>();
		Map<Long, Long> map2 = new HashMap<>();
		
		for(long n : arr) {
			if(n % r == 0) {
				long previous = n / r;
				if(map2.get(previous) != null) count += map2.get(previous);
				if(map1.get(previous) != null) map2.put(n,  map2.getOrDefault(n, 0L) + map1.get(previous));
			}
			map1.put(n, map1.getOrDefault(n, 0L) + 1);
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int r = in.nextInt();
		long[] arr = new long[n];
		for (int i = 0; i < n; i++){
			arr[i] = in.nextLong();
		}
		System.out.println(countTriplets(arr, r));
	}
}