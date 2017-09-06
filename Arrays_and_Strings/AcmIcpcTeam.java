import java.util.*;

public class AcmIcpcTeam {
	
	private static int xor(int[] a, int[] b) {
		int result = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1 || b[i] == 1) {
				result++;
			}
		}
		return result;
	}

	private static void max(int[][] topic, int n, int m) {
		int maxVal = 0;
		int maxCount = 0;
		
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int count = xor(topic[i], topic[j]);
				if (count == maxVal) {
					maxCount++;
				}
				else if (count > maxVal) {
					maxVal = count;
					maxCount = 1;
				}
			}
		}
		System.out.println(maxVal);
		System.out.println(maxCount);
	}
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] topic = new int[n][m];
        for(int i = 0; i < n; i++) {
        	String t = in.next();
        	for (int j = 0; j < m; j++) {
        		topic[i][j] = Integer.parseInt(String.valueOf(t.charAt(j)));
        	}
        }
        max(topic,n,m);      
    }
}