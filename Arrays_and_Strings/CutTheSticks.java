import java.util.Arrays;
import java.util.Scanner;

public class CutTheSticks {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] sticks = new int[N];
		
		for (int i = 0; i < N; i++) {
			sticks[i] = in.nextInt();
		}
		
		Arrays.sort(sticks);
		System.out.println(N);
		for (int j = 0; j < sticks.length - 1; j++) {
			if (sticks[j] != sticks[j + 1]) System.out.println(N - (j + 1));
		}
		in.close();
	}
}