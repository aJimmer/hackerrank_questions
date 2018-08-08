import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;

import java.util.Arrays;

public class SingleRiffleCheck {
/*
 *  Solution #1
 *  
	private static int[] removeTopCard(int[] cards) {
		return Arrays.copyOfRange(cards, 1 , cards.length);
	}
	
    public static boolean isSingleRiffle(int[] half1, int[] half2, int[] shuffledDeck) {

        // check if the shuffled deck is a single riffle of the halves
    	// base case
    	if (shuffledDeck.length == 0) {
    		return true;
    	}
    	// if the top of shuffled deck is the same as the top of half1
    	// (making sure first that we have a top card in half1)
    	if (half1.length > 0 && half1[0] == shuffledDeck[0]) {
    		
    		// take top card off of half1 and shuffledDeck and recurse
    		return isSingleRiffle(removeTopCard(half1), half2, removeTopCard(shuffledDeck));
    		
    	// if the top of shuffledDeck is the same as the top of half2	
    	} else if (half2.length > 0 && half2[0] == shuffledDeck[0]) {
    		
    		// take top card off of half2 and shuffledDeck and recurse
    		return isSingleRiffle(half1, removeTopCard(half2), removeTopCard(shuffledDeck));
    	
    	// top of shuffledDeck doesn't match top of half1 or half2
    	// so we know it's not a single riffle
    	} else {
    		return false;
    	}
    }*/

 /*
  * Solution #2 
  *
	public static boolean isSingleRiffle(int[] half1, int[] half2, int[] shuffledDeck) {
		return isSingleRiffle(half1, half2, shuffledDeck, 0, 0, 0);
	}
	
	private static boolean isSingleRiffle(int[] half1, int[] half2, int[] shuffledDeck, int shuffledDeckIndex, int half1Index, int half2Index) {
		
		// base case we've hit the end of shuffledDeck
		if (shuffledDeckIndex == shuffledDeck.length) {
			return true;
		}
		
		// if we still have cards in half1
		// and the top card in "half1" is the same
		// as the top card in shuffledDeck
		if((half1Index < half1.length) && (half1[half1Index] == shuffledDeck[shuffledDeckIndex])) {
			half1Index++;

		// if we still have cards in half2
		// and the "top" card in half2 is the same
		// as the top card in shuffledDeck
		} else if ((half2Index < half2.length) && half2[half2Index] == shuffledDeck[shuffledDeckIndex]) {
			half2Index++;
			
		// if the top card in shuffledDeck doesn't match the top
		// card in half1 or half2, this isn't a single riffle.
		} else {
			return false;
		}
		
	    // the current card in shuffledDeck has now been "accounted for"
	    // so move on to the next one
		shuffledDeckIndex++;
		return isSingleRiffle(half1, half2, shuffledDeck, shuffledDeckIndex, half1Index, half2Index);
	}
	*/
	
	public static boolean isSingleRiffle(int[] half1, int[] half2, int[] shuffledDeck) {
		int half1Index = 0;
		int half2Index = 0;
		
		for (int card : shuffledDeck) {
			if (half1Index < half1.length && card == half1[half1Index]) {
				half1Index++;
			} else if (half2Index < half2.length && card == half2[half2Index]) {
				half2Index++;
			} else {
				return false;
			}
		}
		return true;
	}
    @Test
    public void bothHalvesAreTheSameLengthTest() {
        final int[] half1 = {1, 4, 5};
        final int[] half2 = {2, 3, 6};
        final int[] shuffledDeck = {1, 2, 3, 4, 5, 6};
        final boolean result = isSingleRiffle(half1, half2, shuffledDeck);
        assertTrue(result);
    }

    @Test
    
    public void halvesAreDifferentLengthsTest() {
        final int[] half1 = {1, 5};
        final int[] half2 = {2, 3, 6};
        final int[] shuffledDeck = {1, 2, 6, 3, 5};
        final boolean result = isSingleRiffle(half1, half2, shuffledDeck);
        assertFalse(result);
    }

    @Test
    public void oneHalfIsEmptyTest() {
        final int[] half1 = {};
        final int[] half2 = {2, 3, 6};
        final int[] shuffledDeck = {2, 3, 6};
        final boolean result = isSingleRiffle(half1, half2, shuffledDeck);
        assertTrue(result);
    }

    @Test
    public void shuffledDeckIsMissingCardsTest() {
        final int[] half1 = {1, 5};
        final int[] half2 = {2, 3, 6};
        final int[] shuffledDeck = {1, 6, 3, 5};
        final boolean result = isSingleRiffle(half1, half2, shuffledDeck);
        assertFalse(result);
    }

    @Test
    public void shuffledDeckHasExtraCards() {
        final int[] half1 = {1, 5};
        final int[] half2 = {2, 3, 6};
        final int[] shuffledDeck = {1, 2, 3, 5, 6, 8};
        final boolean result = isSingleRiffle(half1, half2, shuffledDeck);
        assertFalse(result);
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(SingleRiffleCheck
        		.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("All tests passed.");
        }
    }
}
