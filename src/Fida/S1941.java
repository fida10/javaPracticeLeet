package Fida;

import java.util.HashMap;
import java.util.Map;

public class S1941 {
	public static void main(String[] args) {
		System.out.println(new S1941().areOccurrencesEqual("abacbc"));
	}
	public boolean areOccurrencesEqual(String s) {

		Map<Character, Integer> appearances = new HashMap<>();
		for (char indivChar : s.toCharArray()) {
			if(appearances.containsKey(indivChar)){
				appearances.put(indivChar, appearances.get(indivChar) + 1);
			} else {
				appearances.put(indivChar, 1);
			}
		}

		int expectedAppearances = appearances.get(s.charAt(0)); //set initial value of no. of appearances

		for(Integer value : appearances.values()){
			if(value != expectedAppearances){
				return false;
			}
		}

		return true;
	}
}
