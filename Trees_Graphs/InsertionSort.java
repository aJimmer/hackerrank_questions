import java.io.*;
import java.util.*;

public class Solution {

	public static void insertionSortPart2(int[] ar) {
		for (int i = 1; i < ar.length; i++) {
			int v = ar[i];
			int j = i - 1;

			while ((j >= 0) && (ar[j] > v) {
				ar[j + 1] = ar[j];
				j = j - 1;
			}

			ar[j + 1] = v;
			printArray(ar);
		}
	}

	public static void main(String[] args) {
		int[] ar = {1, 4, 3, 5, 6, 2};

		insertionSortPart2(ar);
	}

	private static void printArray(int[] ar) {
		for (int n : ar) {
			System.out.print(n + " ");
		}
			System.out.print("");
	}
}