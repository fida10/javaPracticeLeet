package Fida;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class S1436 {
	public String destCity(List<List<String>> paths) {

		for(List<String> indivPath : paths){
			String currentCity = indivPath.get(1);
			boolean outgoingPath = false;
			for(List<String> otherPaths : paths){
				if(otherPaths.get(0).equals(currentCity)) {
					outgoingPath = true;
					break;
				}
			}
			if(!outgoingPath){
				return currentCity;
			}
		}
		return null;
	}
}
