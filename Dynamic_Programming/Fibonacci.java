import java.util.*;

public class Fibonacci {
	
	// Memoized approach to finding 'n' fibonacci numbers
	static int fibMemoized(int n) {
		Map <Integer, Integer> memo = new HashMap<>();
		
		if (n == 0 || n == 1) return n;
		
		// check to see if this has been calculated
		if (memo.containsKey(n)) return memo.get(n);
		
		int result = fibMemoized(n - 1) + fibMemoized(n - 2);
		
		// memoize
		memo.put(n, result);
		return result;
	}
	
	// Bottom-up approach to finding 'n' fibonacci numbers
	static int fibBottomUp(int n){
		int[] fibonacciNumbers = new int[n + 1];
		fibonacciNumbers[0] = 0;
		fibonacciNumbers[1] = 1;
		
		for(int i = 2; i <= n; i++) {
			fibonacciNumbers[i] = fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2];
		}
		return fibonacciNumbers[n];
	}
	
	// naive recursive approach to finding 'n' fibonacci numbers
	static int fib(int n){
		if (n == 0 || n == 1) return n;
		else return fib(n - 1) + fib(n - 2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		//long startTime = System.nanoTime();
		//System.out.println(fib(n));
		//System.out.println(System.nanoTime() - startTime);
		
		long startTime = System.nanoTime();
		System.out.println(fibBottomUp(n));
		System.out.println(System.nanoTime() - startTime);
		
		startTime = System.nanoTime();
		System.out.println(fibMemoized(n));
		System.out.println(System.nanoTime() - startTime);
	}
}