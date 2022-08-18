package Fida;

public class S2351 {
	public char repeatedCharacter(String s) {

		int lowestSecond = s.length();
		for(int i = 0; i < s.length(); i++){
			for(int j = i + 1; j < s.length(); j++){
				if(s.charAt(i) == s.charAt(j) && j < lowestSecond){
					lowestSecond = j;
				}
			}
		}

		return s.charAt(lowestSecond);
	}
}
