import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubarraySum {
	
    static long subarraySum(int[] arr) {
        long result = 0;
        
        for (int i = 0; i < arr.length; i++) {
            result += (arr[i] * (i + 1) * (arr.length - i));
        }
        return result;
    }

	public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        int n = in .nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
        	arr[i] = in.nextInt();
        }
        
        System.out.println(subarraySum(arr));

    }
}