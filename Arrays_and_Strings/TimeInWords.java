import java.util.*;

public class TimeInWords {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
		int M = in.nextInt();
		String[] hours = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve" };
		String[] minutes = {"one minute", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", 
							"eleven", "twelve", "thirteen", "fourteen", "quarter", "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
							"twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine", "half"};
	
		if (M == 0) {
			System.out.println(hours[H - 1] + " o' clock");
		}
        else if (M == 30 || M == 15 || M == 1) {
			System.out.println(minutes[M - 1] + " past " + hours[H - 1]);
		}
		else if (M < 30) {
			System.out.println(minutes[M - 1] + " minutes past " + hours[H - 1]);
		
		}
		else if (M > 30 && M == 30 || M == 15 || M == 45) {
			System.out.println(minutes[59 - M] + " to " + hours[H]);
		}
        else if (M > 30) {
			System.out.println(minutes[59 - M] + " minutes to " + hours[H]);
		}
	}
}
