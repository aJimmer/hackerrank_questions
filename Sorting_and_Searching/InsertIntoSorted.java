import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class insertIntoSorted {
    
    public static void insert(int[] ar) {
        int v = ar[ar.length - 2];
        int j = ar.length - 1;
        int temp = ar[j];
        
        while ((j > 0) &&(temp < v)) {
            v = ar[j - 2];
            ar[j] = ar[j - 1];
            j = j - 1;
            printArray(ar);
        }
        ar[j] = temp;
        printArray(ar);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
            for(int i=0;i<s;i++){
                ar[i]=in.nextInt(); 
            }
        insert(ar);
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
    
    
}