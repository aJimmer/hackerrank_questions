import java.util.*;

public class ReverseInplace{

	public void reverseInplace(char[] originalArray){
		int leftIndex = 0;
		int rightIndex = originalArray - 1;

		while(leftIndex < rightIndex) {
			char temp = originalArray[rightIndex];
			originalArray[rightIndex] = originalArray[leftIndex];
			originalArray[leftIndex] = temp;
		}
	}
	
	public static void main(String[] args){
		char[] nonReversedArray = new char[]{'A','P','P','L','E'};
		reverseInplace(nonReversedArray);
		System.out.println(Arrays.toString(nonReversedArray));
	}
}