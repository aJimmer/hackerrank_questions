import java.util.*;

public class ConnectFourWinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a = 6;
		int b = 7;
		
		char[][] board = {
				{'R', 'R','R','Y','R','R','Y'},
				{'Y', 'Y','R','Y','Y','R','R'},
				{'R', 'R','R','Y','R','Y','R'},
				{'Y', 'Y','Y','R','R','R','Y'},
				{'Y', 'R','Y','R','Y','Y','Y'},
				{'R', 'R','R','Y','R','R','R'}				
			};


	    char winner = 'N';
        ArrayList<Character> wins = new ArrayList<Character>();
        
	    for (int i = 0; i < 6; i++) {
	        for (int j = 0; j < 7; j++) { 
	            char player = board[i][j];
                
	            if (player != '0') {
	            	// check horizontal discs
		            if (j + 3 < 7 &&
			                player == board[i][j+1] && 
			                player == board[i][j+2] &&
			                player == board[i][j+3]) {
		            	winner = player;
		            	wins.add(winner);
		            }
		            
		            
		            if (i + 3 < 6) {
		            	//check vertical discs
		                if (player == board[i+1][j] &&
		                    player == board[i+2][j] &&
		                    player == board[i+3][j])
		                	winner = player;
		                
		                //check diagonal bottom to top right
		                if (j + 3 < 7 &&
		                    player == board[i+1][j+1] &&
		                    player == board[i+2][j+2] &&
		                    player == board[i+3][j+3])
		                	winner = player;
		                
		                //check diagonal bottom to top left
		                if (j - 3 >= 0 &&
		                    player == board[i+1][j-1] &&
		                    player == board[i+2][j-2] &&
		                    player == board[i+3][j-3])
		                	winner = player;
		                
		                wins.add(winner);
		            }
	            }
	        }
	    }
        if (wins.contains('Y') && wins.contains('R')) {
            winner = 'B';
        }
	    System.out.println(Character.toString(winner));       
	}
}