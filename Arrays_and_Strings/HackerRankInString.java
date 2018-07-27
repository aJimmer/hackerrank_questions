import java.util.*;

public class HackerRankInString {

    public static String hackerrankInString(String originalStr) {
    	String hr = "hackerrank";
    	
    	if (originalStr.length() < hr.length()){
    		return "NO";
    	}
    	
    	int j = 0;
    	for (int i = 0; i < originalStr.length(); i++) {
    		if (j < hr.length() && originalStr.charAt(i) == hr.charAt(j)) {
    			j++;
    		}
    	}
    	
    	return (j == hr.length() ? "YES" : "NO");
    }

    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = hackerrankInString(s);

	        System.out.println(result);
        }
        scanner.close();
    }
}