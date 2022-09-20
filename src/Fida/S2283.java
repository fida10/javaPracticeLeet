package Fida;

public class S2283 {
	public static void main(String[] args){
		System.out.println(new S2283().digitCount("1210"));
	}
	public boolean digitCount(String num) {
		for(int i = 0; i < num.length(); i++){
			char currentNum = (char) (i + 48);
			int counter = 0;
			for(char indivChar : num.toCharArray()){
				if(indivChar == currentNum) {
					counter++;
				}
			}
			if(counter != num.charAt(i) - 48){
				return false;
			}
		}
		return true;
	}
}
