import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the marsExploration function below.
    static int marsExploration(String s) {
        char[] sosSignal = s.toCharArray();
        int count = 0;
        int i = 0;
        
        while(i < sosSignal.length){
            if(sosSignal[i] != 'S') count += 1;
            if(sosSignal[i+1]!= 'O') count += 1;
            if(sosSignal[i+2] != 'S') count += 1;
            i += 3;
        }
        
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}