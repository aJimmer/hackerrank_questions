import java.util.*;

public class LibraryFine {
	
	   public static void main(String[] args) {
		    Scanner in = new Scanner(System.in);
		    int d1 = in.nextInt();
		    int m1 = in.nextInt();
		    int y1 = in.nextInt();
		    int d2 = in.nextInt();
		    int m2 = in.nextInt();
		    int y2 = in.nextInt();
		    
		    int fine = 0;
		    
		    if (y1 > y2) {
		        fine += 10000;
		    } 
		    else if (y1 == y2 && m1 > m2 ) {
		        for (int i = 0; i < (m1 - m2); i++) fine += 500;
		    } 
		    else if (y1 == y2 && m1 == m2 && d1 > d2) {
		        for (int j = 0; j < (d1 - d2); j++) fine += 15;
		    }
		    System.out.println(fine);
	   }
}
