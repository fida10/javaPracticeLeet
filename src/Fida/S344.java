package Fida;

public class S344 {
	public static void main(String[] args) {
		char[] s = {'h','e','l', 'l','o'};
		new S344().reverseString(s);
	}
	public void reverseString(char[] s) {

		int sCounter = 0;
		for(int i = s.length - 1; i > s.length/2 - 1; i--){
			char holder = s[i];
			s[i] = s[sCounter];
			s[sCounter] = holder;
			sCounter++;
		}
		System.out.println(s);
	}
}
