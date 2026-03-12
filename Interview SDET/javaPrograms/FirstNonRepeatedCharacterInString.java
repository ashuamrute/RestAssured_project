package javaPrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacterInString {

	public static void main(String[] args) {
		String str = "aaabccdeeff";

		// Way 1
//		for(char ch:str.toCharArray()) {
//			if(str.indexOf(ch)==str.lastIndexOf(ch)) {
//				System.out.println("First non repeating char in string:"+ch);
//				break;
//			}
//		}

		// Way 2
		HashMap<Character, Integer> map = new LinkedHashMap<>();
		for (char ch : str.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println("First non repeating char in string:" + entry.getKey());
				break;
			}
		}

	}

}
