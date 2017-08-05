import java.io.*;
import java.util.*;

public class InPlaceQS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int size = scanner.nextInt();
        int[] array = new int[size];
        
        for (int i = 0; i < size; ++i) {
            array[i] = scanner.nextInt();
        }
        
        quicksort(array);
    }
    
    public static void quicksort(int[] arr) {
        quicksort(arr, 0, arr.length - 1);
    }
    
    private static void quicksort(int[] arr, int first, int last) {
        if ((last - first) >= 1) {
            int q = partition(arr, first, last);
            print(arr);
            quicksort(arr, first, q - 1);
            quicksort(arr, q + 1, last);
        }
    }
    
    private static int partition(int[] arr, int first, int last) {
        int pivot = arr[last];
        int s = first;
    
        for (int i = first; i < last; i++) {
            if (arr[i] < pivot) {
                swap(arr, s, i);
                s++;
            }
        }
       
        swap(arr, s, last);
        return s;
    }
    
    private static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    private static void print(int[] arr) {  
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }   
        System.out.println("");
    }
}