import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;

public class FindRepeat {
	
	public static int findRepeat(int[] arr) {
		int l = 1;
		int r = arr.length-1;
		
		while (l < r) {
			int m = l + ((r - l) / 2);
			int lowerRangeFloor = l;
			int lowerRangeCeiling = m;
			int upperRangeFloor = m + 1;
			int upperRangeCeiling = r;
			
			int itemsInLowerRange = 0;
			
			for (int item : arr) {
				if (item >= lowerRangeFloor && item <= lowerRangeCeiling) {
					itemsInLowerRange += 1;
				}
			}
			int distinctPossibleIntegersInLowerRange = lowerRangeCeiling - lowerRangeFloor + 1;
			
			if (itemsInLowerRange > distinctPossibleIntegersInLowerRange) {
				l = lowerRangeFloor;
				r = lowerRangeCeiling;
			} else {
				l = upperRangeFloor;
				r = upperRangeCeiling;
			}
		}
		return l;
	}

    @Test
    public void justTheRepeatedNumberTest() {
        final int[] numbers = {1, 1};
        final int expected = 1;
        final int actual = findRepeat(numbers);
        assertEquals(expected, actual);
    }

    @Test
    public void shortArrayTest() {
        final int[] numbers = {1, 2, 3, 2};
        final int expected = 2;
        final int actual = findRepeat(numbers);
        assertEquals(expected, actual);
    }

    @Test
    public void mediumArrayTest() {
        final int[] numbers = {1, 2, 5, 5, 5, 5};
        final int expected = 5;
        final int actual = findRepeat(numbers);
        assertEquals(expected, actual);
    }

    @Test
    public void longArrayTest() {
        final int[] numbers = {4, 1, 4, 8, 3, 2, 7, 6, 5};
        final int expected = 4;
        final int actual = findRepeat(numbers);
        assertEquals(expected, actual);
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(FindRepeat.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("All tests passed.");
        }
    }
}