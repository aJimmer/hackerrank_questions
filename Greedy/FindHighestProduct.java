public class FindHighestProduct {
	public static int findHighestProduct(int[] arr) {
		int highest = Math.max(arr[0], arr[1]);
		int lowest = Math.min(arr[0], arr[1]);
		
		int highestProductOf2 = arr[0] * arr[1];
		int lowestProductOf2 = arr[0] * arr[1];
		
		int highestProductOf3 = arr[0] * arr[1] * arr[2];
		
		for (int i = 2; i < arr.length; i++) {
			highestProductOf3 = Math.max(Math.max(highestProductOf3, arr[i] * highestProductOf2), arr[i] * lowestProductOf2);
			
			highestProductOf2 = Math.max(Math.max(highestProductOf2, arr[i] * highest), arr[i] * lowest);
			lowestProductOf2 = Math.min(Math.min(lowestProductOf2, arr[i] * highest), arr[i] * lowest);
			
			highest = Math.max(highest, arr[i]);
			lowest = Math.min(lowest, arr[i]);
		}
		
		return highestProductOf3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test1 = { 5, 3, 10, 1, 20 };
		int[] test2 = { -5, -3, -10, -1, -20 };
		int[] test3 = { -5, 3, 10 , -1, 20 };
		int[] test4 = { 1, 10, -5, 1, -100 };
		
		System.out.println(findHighestProduct(test1));
		System.out.println(findHighestProduct(test2));
		System.out.println(findHighestProduct(test3));
		System.out.println(findHighestProduct(test4));
	}
}