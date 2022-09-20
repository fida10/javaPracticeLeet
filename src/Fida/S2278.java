package Fida;

public class S2278 {
	public static void main(String[] args) {
		System.out.println(new S2278().percentageLetter("foobar", 'o'));
	}
	public int percentageLetter(String s, char letter) {
		int letterCount = 0;
		for(char indivChar : s.toCharArray()){
			if(indivChar == letter){
				letterCount++;
			}
		}

		return (letterCount * 100) / s.length();
	}
}
