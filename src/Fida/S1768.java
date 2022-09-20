package Fida;

public class S1768 {

	public String mergeAlternately(String word1, String word2) {
		int greaterLength;
		if(word1.length() > word2.length()){
			greaterLength = word1.length();
		} else {
			greaterLength = word2.length();
		}
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < greaterLength; i++){
			boolean firstAppendSuccessful = false;
			try {
				sb.append(word1.charAt(i));
				firstAppendSuccessful = true;
				sb.append(word2.charAt(i));
			} catch (StringIndexOutOfBoundsException e){
				if(!firstAppendSuccessful){
					sb.append(word2.charAt(i));
				}
			}
		}

		return sb.toString();
	}
	public String mergeAlternatelyTwo(String word1, String word2){
		int greaterLength;
		int smallerLength;
		boolean word1Smaller;

		if(word1.length() > word2.length()){
			greaterLength = word1.length();
			smallerLength = word2.length();
			word1Smaller = false;
		} else {
			greaterLength = word2.length();
			smallerLength = word2.length();
			word1Smaller = true;
		}

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < smallerLength; i++){
			sb.append(word1.charAt(i)).append(word2.charAt(i));
		}

		if (word1Smaller) {
			sb.append(word2, smallerLength - 1, greaterLength);
		} else {
			sb.append(word1, smallerLength - 1, greaterLength);
		}

		return sb.toString();
	}
}
