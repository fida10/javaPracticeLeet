package Fida;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class S1370 {

	public static void main(String[] args) {
		System.out.println(new S1370().sortStringTwo("aaaabbbbcccclllldddd"));
	}
	public String sortStringTwo(String s){
		StringBuilder sb = new StringBuilder(s);
		StringBuilder sc = new StringBuilder();
		while(sb.length() > 0){
			for(int i = 'a'; i <= 'z'; i++){
				if(sb.toString().contains(Character.toString((char) i))){
					sc.append((char) i);
					sb.deleteCharAt(sb.indexOf(Character.toString((char) i)));
				}
			}

			if(sb.length() < 1){
				break;
			}

			for(int i = 'z'; i >= 'a'; i--){
				if(sb.toString().contains(Character.toString((char) i))){
					sc.append((char) i);
					sb.deleteCharAt(sb.indexOf(Character.toString((char) i)));
				}
			}
		}
		return sc.toString();
	}
}
