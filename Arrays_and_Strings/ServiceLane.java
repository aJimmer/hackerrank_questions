import java.util.Scanner;

public class ServiceLane {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int T = in.nextInt();
		
		int[] width = new int[N];
		
		for (int i = 0; i < N; i++) {
			width[i] = in.nextInt();
		}
		for (int j = 0; j < T; j++) {
			int I = in.nextInt();
			int J = in.nextInt();
			int max = 3;
			
			for (int k = I; k <= J; k++) {
				if (max > width[k]) {
					max = width[k];
				}
			}
			System.out.println(max);
		}	
		in.close();
	}
}