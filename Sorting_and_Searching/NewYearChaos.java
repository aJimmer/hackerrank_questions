import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();

        for(int i = 0; i < test; i++){
            int n = in.nextInt();
            int q[] = new int[n];

            for(int q_i = 0; q_i < n; q_i++){
                q[q_i] = in.nextInt();
            }

            int count = 0;

            boolean flag1 = false;
            for (int i = n - 1; i >= 0; i--){
                boolean flag2 = true;
                for (int j = 0; j < i; j++){

                    if (Math.abs(q[j] - (j + 1)) > 2){
                        flag1 = true;
                        flag2 = true;
                        break;
                    }

                    if (q[j] > q[j + 1]) {
                        int temp = q[j];
                        q[j] = q[j + 1];
                        q[j + 1] = temp;
                        count++;
                        flag2 = false;
                    }
                }

                if (flag2) break;
            }

            if (flag1) System.out.println("Too chaotic");
            else System.out.println(count);            
        }
    }
}
