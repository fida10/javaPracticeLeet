package Fida;

import java.util.HashMap;
import java.util.Map;

public class S657 {
	public static void main(String[] args) {
		System.out.println(new S657().judgeCircle("LL"));
		System.out.println(new S657().judgeCircleTwo("LL"));
	}
	public boolean judgeCircle(String moves) {
		Map<Character, Integer> moveTracker = new HashMap<>();
		moveTracker.put('R', 0);
		moveTracker.put('L', 0);
		moveTracker.put('U', 0);
		moveTracker.put('D', 0);

		for(char indivChar : moves.toCharArray()){
			moveTracker.put(indivChar, moveTracker.get(indivChar) + 1);
		}

		return ((moveTracker.get('R') - moveTracker.get('L') == 0) && (moveTracker.get('U') - moveTracker.get('D') == 0));
	}
	public boolean judgeCircleTwo(String moves) {
		int xCounter = 0;
		int yCounter = 0;

		for(char indivChar : moves.toCharArray()){
			if(indivChar == 'R'){
				xCounter++;
			} else if(indivChar == 'L'){
				xCounter--;
			}

			if(indivChar == 'U'){
				yCounter++;
			} else if(indivChar == 'D'){
				yCounter--;
			}
		}

		return xCounter == 0 && yCounter == 0;
	}
}
