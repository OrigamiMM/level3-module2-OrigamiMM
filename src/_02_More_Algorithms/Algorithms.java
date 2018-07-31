package _02_More_Algorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {
		int index = 0;
		for (String string : eggs) {
			if(string.contains("cracked")) {
				return index;
			}
			index++;
		}
		return 0;
	}
	public static int countPearls(List<Boolean> oysters) {
		int index = 0;
		for (Boolean bool : oysters) {
			if(bool == true) {
				return index;
			}
			index++;
		}
		return 0;
	}
}
