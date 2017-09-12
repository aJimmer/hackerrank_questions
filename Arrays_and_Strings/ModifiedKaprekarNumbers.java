import java.util.*;

public class ModifiedKaprekarNumbers {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		long P = in.nextLong();
		long Q = in.nextLong();
		ArrayList<Long> list = new ArrayList<Long>();
		
		for (Long i = P; i <= Q; i++) {
			Long sqrt = i * i;
		
			char[] arr = sqrt.toString().toCharArray();
			char[] left;
			char[] right; 
			
			if (arr.length == 1) {
				left = new char[1];
			} else {
				left = new char[arr.length / 2];
			}
			
			right =  (arr.length % 2 == 0) ? new char[arr.length / 2] : new char[arr.length / 2 + 1];
			
			if (arr.length != 1) {
				for (int j = 0; j < left.length; j++) {
					left[j] = arr[j];
				}
				for (int k = 0; k < right.length; k++) {
					right[k] = arr[k + left.length];
				}	
			}
			else {
				left[0] = '0';
				right[0] = arr[0];
			}

			if ((Long.parseLong(new String(left)) + Long.parseLong(new String(right))) == i) {
				list.add(i);
			}
			
		}
		
		if (list.size() == 0) System.out.println("INVALID RANGE");
		else {
			for(Long num:list) {
				System.out.print(num + " ");
			}
		}
		in.close();
	}
}