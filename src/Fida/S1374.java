package Fida;

public class S1374 {
	public static void main(String[] args) {

	}

	public String generateTheString(int n) {
		StringBuilder sb = new StringBuilder();

		boolean nIsEven = n % 2 == 0;
		if(nIsEven){
			n -= 1;
		}

		for(int i = 0; i < n; i++){
			sb.append('a');
		}

		if(nIsEven){
			sb.append('b');
		}

		return sb.toString();
	}

}
