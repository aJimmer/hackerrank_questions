import java.util.*;

public class TwoStrings {
	static Set<Character> a;
	static Set<Character> b;
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		for(int i = 0; i < n; i++){
			a = new HashSet<Character> ();
			b = new HashSet<Character> ();
			for (char c: in.next().toCharArray()) a.add(c);
			for (char c: in.next().toCharArray()) b.add(c);
			
			a.retainAll(b);
			
			System.out.println((a.isEmpty()) ? "NO": "YES");
		}
	}
	/*public static String twoStrings(String s1, String s2) {
		String letters = "abcdefghijklmnopqrstuvwxyz";
		String output = "NO";
		
		for(int i = 0; i < letters.length(); i++){
			if (s1.indexOf(letters.charAt(i)) > -1 && s2.indexOf(letters.charAt(i)) > -1) {
				output = "YES";
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		for (int i = 0; i < N; i++){
			String s1 = in.next();
			String s2 = in.next();
			
			System.out.println(twoStrings(s1, s2));
		}
	}*/
	
}