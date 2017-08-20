import java.util.*;

public class ChocolateFeast {
	private static int maxChocolates(int n, int c, int m) {
		int initialChoc = n / c;
		int totalChoc = initialChoc;
		
		while (initialChoc >= m) {
			initialChoc -= m;	
			totalChoc++;
			initialChoc++;
		}
		return totalChoc;
	}

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            System.out.println(maxChocolates(in.nextInt(), in.nextInt(), in.nextInt()));
        }
        in.close();
    }
}
