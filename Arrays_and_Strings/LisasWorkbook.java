import java.util.*;

public class LisasWorkbook {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int special = 0;
        int start = 1;
        
        for (int i = 0; i < N; i++) {
            int problem = in.nextInt();
            for (int j = 1; j <= problem; j++) {
                if (j == start) special++;
                if ((j % K == 0) || (j == problem)) start++;
            }
        }
        System.out.println(special);
    }
}