package Fida;

public class S1967 {

	public int numOfStrings(String[] patterns, String word) {
		int counter = 0;

		for(String pattern : patterns){
			if(word.contains(pattern)){
				counter++;
			}

		}

		return counter;
	}
}
