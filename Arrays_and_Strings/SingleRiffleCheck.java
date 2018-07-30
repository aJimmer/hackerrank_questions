public class SingleRiffleCheck {
	public static boolean isSingleRiffle(int[] half1, int[] half2, int[] shuffledDeck){
		return isSingleRiffle(half1, half2, shuffledDeck, 0, 0, 0);
	}
	public static boolean isSingleRiffle(int[] half1, int[] half2, int[] shuffledDeck, int sdIndex, int h1Index, int h2Index){
		if(sdIndex == shuffledDeck.length) {
			return true;
		}
		if((h1Index < half1.length) && half1[h1Index] == shuffledDeck[sdIndex]){
			h1Index++;
		} else if ((h2Index < half2.length) && half2[h2Index] == shuffledDeck[sdIndex]) {
			h2Index++;
		} else {
			return false;
		}
		
		sdIndex++;
		return isSingleRiffle(half1, half2, shuffledDeck, sdIndex, h1Index, h2Index);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
