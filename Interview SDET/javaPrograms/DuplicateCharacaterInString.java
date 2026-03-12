package javaPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class DuplicateCharacaterInString {

	public static void main(String[] args) {
		String str = "Go to Gym";
		String s1 = str.toLowerCase();
		char[] ch = s1.toCharArray();
//		int count = 1;

//		for (int i = 0; i < ch.length; i++) {
//			for (int j = i + 1; j < ch.length; j++) {
//				if (ch[i] == ch[j] && ch[i] != ' ') {
//					count++;
//					System.out.println("Duplicate char in string :" + ch[i]);
//				}
//
//			}
//		}
		HashMap<Character, Integer> map = new HashMap<>();
		for(char c:ch) {
			if(c!=' ') {
				map.put(c, map.getOrDefault(c, 0)+1);
			}
		}
		for(Entry<Character, Integer> entry:map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey() +":"+ entry.getValue());
			}
		}
	}

}
