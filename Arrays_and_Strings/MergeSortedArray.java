import java.util.Arrays;

public class MergeSortedArrays {
	public static int[] mergeArrays(int[] myArray, int[] aliceArray){
		int mergedArrLength = myArray.length + aliceArray.length;
		int[] mergedArray = new int[mergedArrLength];
		int myIndex = 0;
		int aliceIndex = 0;
		
		for(int i = 0; i < mergedArrLength; i++){
			
			boolean isMyArrayExhausted = myIndex >= myArray.length;
			boolean isAliceArrayExhausted = aliceIndex >= aliceArray.length;
			
			if(!isMyArrayExhausted && (isAliceArrayExhausted || (myArray[myIndex] < aliceArray[aliceIndex]))) {
				mergedArray[i] = myArray[myIndex];
				myIndex++;
			} else {
				mergedArray[i] = aliceArray[aliceIndex];
				aliceIndex++;
			}
		}
		return mergedArray;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] myArray = new int[]{3, 4, 6, 10, 11, 15};
		int[] aliceArray = new int[]{1, 5, 8, 12, 14, 19};
		
		System.out.println(Arrays.toString(mergeArrays(myArray, aliceArray)));
	}
}