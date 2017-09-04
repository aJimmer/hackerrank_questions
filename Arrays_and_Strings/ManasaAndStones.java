import java.util.*;

public class ManasaAndStones {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		for (int i = 0; i < T; i++) {
			int N = in.nextInt() - 1;
			int A = in.nextInt();
			int B = in.nextInt();
			int min = Math.min(A, B);
			int max = Math.max(A, B);
			int sum = N * min;
			Set<Integer> set = new HashSet<Integer>();
			
			for (int j = 0; j < N; j++) {
				if (!set.contains(sum)) {
					System.out.print(sum + " ");
					set.add(sum);
				}
				sum -= min;
				sum += max;
			}
			
			if (set.contains(sum)) System.out.println();
			else System.out.println(sum);
		}
		in.close();
	}
}