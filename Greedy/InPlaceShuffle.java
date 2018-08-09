import java.util.Arrays;
import java.util.Random;

public class InPlaceShuffle {
	private static Random rand = new Random();
	
	private static int getRandom(int floor, int ceiling) {
		return rand.nextInt((ceiling - floor) + 1) + floor;
	}
	
	public static void inPlaceShuffle(int[] arr) {
		if (arr.length <= 1) {
			return;
		}
		
		for (int i = 0; i < arr.length-1; i++) {
			int randChoice = getRandom(i, arr.length - 1);
			
			if (randChoice != i) {
				int temp = arr[i];
				arr[i] = arr[randChoice];
				arr[randChoice] = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int[] initial = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final int[] shuffled = Arrays.copyOf(initial, initial.length);
        inPlaceShuffle(shuffled);
        System.out.printf("initial array: %s\n", Arrays.toString(initial));
        System.out.printf("shuffled array: %s\n", Arrays.toString(shuffled));
	}
}