import java.util.Scanner;

public class Solution {
	private static boolean search(String[] G, String[] P) {
		for (int i = 0; i <= G.length - P.length; i++) {
			for (int j = 0; j <= G[0].length() - P[0].length(); j++) {
				if (search(G, P, i, j)) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean search(String[] G, String[] P, int i, int j) {
		for (int k = 0; k < P.length; k++) {
			for (int l = 0; l < P[0].length(); l++) {
				if (G[i + k].charAt(j + l) != P[k].charAt(l)) {
					return false;
				}
			}
		}
		return true;
	}
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
        
		for (int i = 0; i < T; i++) {
			String[] G = new String[sc.nextInt()];
			sc.nextInt();
            
			for (int j = 0; j < G.length; j++) {
				G[j] = sc.next();
			}
            
			String[] P = new String[sc.nextInt()];
			sc.nextInt();
            
			for (int j = 0; j < P.length; j++) {
				P[j] = sc.next();
			}
			System.out.println(search(G, P) ? "YES" : "NO");
		}
		sc.close();
	}
}