import java.io.*;
import java.util.*;

public class AngryProfessor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int N = 0;
        int K = 0;
        
        for (int i = 0; i < T; i++) {
            N = in.nextInt();
            K = in.nextInt();
            for(int j = 0; j < N; j++) {
                if (in.nextInt() <= 0) K -= 1;
            }   
            
            if (K <= 0) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}