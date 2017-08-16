import java.util.Scanner;

public class SherlockAndSquares {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int total = 0;
		
		for (int i = 0; i < T; i++) {
			int A = in.nextInt();
			int B = in.nextInt();

			System.out.println((int) Math.floor(Math.sqrt(B)) - (int) Math.ceil(Math.sqrt(A)) + 1);
			total = 0;
		}
	}
}