package Fida;

import java.util.ArrayList;
import java.util.List;

public class S1332 {
	public int removePalindromeSub(String s) {

		int value =0;

		for(int i=0; i<s.length(); i++){
			if(s.charAt(i)!=s.charAt(s.length()-1-i)){
				value = 2;
				break;
			}
			else {
				value =1;
			}
		}


		return value;

	}
}
