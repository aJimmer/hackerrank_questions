import java.util.*;

public class CaesarCypher {
	private static char encrypt(char c, int shift) {
        if (!Character.isAlphabetic(c)) return c;
        
        char base = 'A';
        
        if (c >= 'a') base = 'a';
        
        return (char)(((c - base + shift) % 26) + base);
	}
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[] s = in.next().toCharArray();
        int k = in.nextInt();
    
        for (int i = 0; i < n; i++) {
        	s[i] = encrypt(s[i], k);
        }
        System.out.println(String.valueOf(s));
        in.close();
    }
}