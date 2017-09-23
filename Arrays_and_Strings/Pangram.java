import java.util.*;

public class Panagrams {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine().toLowerCase();
        boolean[] map = new boolean[26];
        boolean panagram = true;
        int j = 0;
        
        for (int i = 0; i < str.length(); i++) {
        	if (str.charAt(i) >= 'a' && str.charAt(i) <='z') {
        		map[str.charAt(i) - 'a'] = true;
        	}
        }
        
        while(panagram && j < 26) {
        	if (!map[j]) {
        		panagram = false;
        	}
        	j++;
        }
        
        if (panagram) 
        	System.out.println("pangram");
        else
        	System.out.println("not pangram");
    }
}