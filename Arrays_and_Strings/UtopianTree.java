import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UtopianTree {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int k = 0; k < t; k++) {
            int n = scan.nextInt();
            int result = 1;
            for(int i = 0; i < n; i++) {
                if(i % 2 == 0) {
                    result *= 2;
                }
                else {
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}