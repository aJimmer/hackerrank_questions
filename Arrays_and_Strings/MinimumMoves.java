import java.util.*;

public class MinimumMoves {
	private static List convertToList(int num) {
		int temp = num;
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while (temp > 0) {
			arr.add(0, temp % 10);
			temp /= 10;
		}
		return arr;
	}
	
	private static int minimumMoves(List<List<Integer>> mtx1, List<List<Integer>> mtx2, int size) {
		int moves = 0;
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < mtx1.get(i).size(); j++) {
				int num1 = mtx1.get(i).get(j);
				int num2 = mtx2.get(i).get(j);
				while ( num1 != num2) {
					if (num1 < num2) {
						mtx1.get(i).set(j, num1 + 1);	
					}
					else if (num1 > num2) {
						mtx1.get(i).set(j, num1 - 1);
					}
					
					num1 = mtx1.get(i).get(j);
					num2 = mtx2.get(i).get(j);
					moves++;
				}
			}
		}
		
		return moves;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		List<List<Integer>> mtx1 = new ArrayList<List<Integer>>(n);
	
		for (int i = 0; i < n; i++) {
			mtx1.add(convertToList(in.nextInt()));
		}
		
		int m = in.nextInt();
		List<List<Integer>> mtx2 = new ArrayList<List<Integer>>(m);
		for (int j = 0; j < m; j++) {
			mtx2.add(convertToList(in.nextInt()));
		}
		
		if (n == m) System.out.println(minimumMoves(mtx1, mtx2, n));
		else System.out.println(0);
	}
}