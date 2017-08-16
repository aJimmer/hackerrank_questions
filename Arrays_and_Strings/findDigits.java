import java.util.*;

public class findDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		int total = 0;
		
		for (int i = 0; i < T; i++) {
			int N = in.nextInt();
			String digit = "" + N;
			char[] arr = digit.toCharArray();
			
			
			for (char d: arr) {
				if (d != '0' && N % Integer.parseInt("" + d) == 0) {
					total++;
				}
			}
			System.out.println(total);
			total = 0;
		}
	}
}