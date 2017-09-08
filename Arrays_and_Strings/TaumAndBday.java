public class TaumAndBday {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		for (int i = 0; i < T; i++) {
			long B = in.nextLong();
			long W = in.nextLong();
			long X = in.nextLong();
			long Y = in.nextLong();
			long Z = in.nextLong();
			long min = (B * X) + (W * Y);

			if (X > Y && (Y + Z < X)) min = min - (B * X) + (B * (Y + Z));
			else if (Y > X && (X + Z < Y)) min = min - (W * Y) + (W * (X + Z));
			
 			System.out.println(min);
		}
	}
}