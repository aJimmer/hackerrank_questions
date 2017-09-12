import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		char[] message = in.next().toCharArray();
		int length = message.length;
        
		int row = (int) Math.floor(Math.sqrt(length));
		int col = (int) Math.ceil(Math.sqrt(length));
		
		if (row * col < length) {
			row++;
		}
 		if (row * col >= length) {
 			char[][] grid = new char[row][col];
 			int increment = 0;
 			
 			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if (increment < message.length) {
						grid[i][j] = message[increment];
						increment++;	
					} else {
						grid[i][j] = ' ';
					}
				}
			}
			
			for (int i = 0; i < col; i++) {
				for (int j = 0; j < row; j++) {
                    
                    if (grid[j][i] != ' ') System.out.print(grid[j][i]);
				}
				System.out.print(" ");
			}
		}
 		in.close();
	}
}
