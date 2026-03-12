package javaPrograms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordsInString {

	public static void main(String[] args) {
		String str = "learn java learn Selenium learn API and Java";
		String s1 = str.toLowerCase();
		String[] words = s1.split(" ");
		HashMap<String, Integer> map = new HashMap<>();
		for(String word:words) {
			
				map.put(word, map.getOrDefault(word, 0)+1);
			}
		
		for(Map.Entry<String, Integer>entry:map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey() +":"+ entry.getValue());
			}
		}

	}

}
