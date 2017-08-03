import java.io.*;
import java.util.*;

public class DiagnolDifference {
    static void printDiaDiff(int n, int[][] mtx) {
        int sum1 = 0;
        int sum2 = 0;
        int counter = n;
        
        for (int i = 0; i < n; i++) {
            sum1 += mtx[i][i];    
            sum2 += mtx[i][counter - 1];
            counter -= 1; 
        }
        
        System.out.println(Math.abs(sum1 - sum2));
    } 

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] mtx = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mtx[i][j] = in.nextInt();  
            }
        }
        printDiaDiff(n, mtx);   
    }
}