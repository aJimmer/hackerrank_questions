import java.util.*;

class CavityMap {
        
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        char[][] grid = new char[n][];
        
        for (int i = 0; i < n; i++) {
        	grid[i] = in.next().toCharArray();
        }
        
        for (int i = 1; i < n-1; i++) {
                for (int j = 1; j < n-1; j++) {
                	if(grid[i][j] > grid[i][j-1] && 
                	   grid[i][j] > grid[i][j+1] && 
                	   grid[i][j] > grid[i-1][j] && 
                	   grid[i][j] > grid[i+1][j]) {
                            grid[i][j]='X';
                    }
            }
        }
                
        for (int i = 0; i < n; i++) System.out.println(new String(grid[i]));
	}
}