import java.io.*;
import java.util.*;

public class NewYearChaos {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();

        for(int i = 0; i < test; i++){
            int n = in.nextInt();
            int q[] = new int[n];

            for(int i = 0; i < n; i++){
                q[i] = in.nextInt();
            }

            int count = 0;

            boolean flag1 = false;
            for (int j = n - 1; j >= 0; j--){
                boolean flag2 = true;
                for (int k = 0; k < j; k++){

                    if (Math.abs(q[k] - (k + 1)) > 2){
                        flag1 = true;
                        flag2 = true;
                        break;
                    }

                    if (q[k] > q[k + 1]) {
                        int temp = q[k];
                        q[k] = q[k + 1];
                        q[k + 1] = temp;
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