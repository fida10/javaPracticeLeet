package Fida;

public class S2185 {

	public static void main(String[] args) {
		String[] words = {"pay","attention","practice","attend"};
		String pref = "at";

		System.out.println(new S2185().prefixCount(words, pref));
	}
	public int prefixCount(String[] words, String pref) {
		int prefixCount = 0;

		for(String indivWord : words){
			if(indivWord.startsWith(pref)){
				prefixCount++;
			}
		}
		return prefixCount;
	}
}
