import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

public class PlusMinus {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.000000");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        float pos = 0;
        float zero = 0;
        float neg = 0;
        
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            if (num < 0) {
                neg += 1;
            } else if (num > 0) {
                pos += 1; 
            } else {
                zero += 1;
            }
        }
        
        System.out.println(df.format(pos / n));
        System.out.println(df.format(neg / n));
        System.out.println(df.format(zero / n));
        
        
    }
}