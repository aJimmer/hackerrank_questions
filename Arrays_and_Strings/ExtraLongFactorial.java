import java.math.BigInteger;
import java.util.*;

public class ExtraLongFactorials {

	private static BigInteger solve(int n) {
		BigInteger factorial = BigInteger.ONE;
		
		for (int i = n; i > 0; i--) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		
		return factorial;
	}
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        System.out.println(solve(n));
    }
}