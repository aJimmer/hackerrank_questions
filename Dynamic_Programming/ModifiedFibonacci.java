import java.io.*;
import java.util.*;
import java.math.BigInteger;

public class ModifiedFibonacci {
    public static BigInteger modFib(int n, Map<Integer, BigInteger> fibTable) {
        if (fibTable.containsKey(n)) return fibTable.get(n);
        
        BigInteger prev = modFib(n - 1, fibTable);
        BigInteger current = prev.multiply(prev).add(modFib(n - 2, fibTable));
        fibTable.put(n, current);
        
        return current;
    }
    
    public static void main(String args[] ) {
        Scanner in = new Scanner(System.in);
        BigInteger t1 = new BigInteger(in.next());
        BigInteger t2 = new BigInteger(in.next());
        Map<Integer, BigInteger> fibTable = new HashMap<>();
        
        fibTable.put(1, t1);
        fibTable.put(2, t2);
        
        int n = in.nextInt();
        
        System.out.println(modFib(n, fibTable));
    }
}