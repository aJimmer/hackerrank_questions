import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.*;

public class GetProductsOfAllIntsExceptAtIndex {
	
    public static int[] getProductsOfAllIntsExceptAtIndex(int[] intArray) {

    	if (intArray.length == 0) {
    		return new int[]{}; 
    	}
    	if (intArray.length == 1) {
    		return intArray;
    	}
        // make an array of the products
        int[] productArray = new int[intArray.length];
        
        for(int i = 0; i < intArray.length; i++) {
        	
            int[] beforeIndex = new int[i];
            int[] afterIndex = new int[intArray.length - i - 1];
            
            for (int j = 0; j < i; j++) {
                beforeIndex[j] = intArray[j];    
            }
            int index = 0;
            for (int k = i+1; k < intArray.length; k++) {
                afterIndex[index] = intArray[k];
                index++;
            }
            
            int product = 1; 
            
            for (int j = 0; j < beforeIndex.length; j++) {
                product *= beforeIndex[j];
            }
            
            for (int k = 0; k < afterIndex.length; k++) {
                product *= afterIndex[k];    
            }
            
            productArray[i] = product;
        }
        
        return productArray;
    }
    
    @Test
    public void smallArrayTest() {
    	final int[] actual = getProductsOfAllIntsExceptAtIndex(new int[] {1,2,3});
    	final int[] expected = new int[] {6,3,2};
    	assertArrayEquals(expected, actual);
    }
    
    @Test
    public void longArrayTest() {
    	final int[] actual = getProductsOfAllIntsExceptAtIndex(new int[] {8, 2, 4, 3, 1, 5}); 
    	final int[] expected = new int[] {120, 480, 240, 320, 960, 192};
    	assertArrayEquals(expected, actual);
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Result result = JUnitCore.runClasses(GetProductsOfAllIntsExceptAtIndex.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		if (result.wasSuccessful()) {
			System.out.println("All tests passed.");
		}
	}
}