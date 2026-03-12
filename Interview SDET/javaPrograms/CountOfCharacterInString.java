package javaPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOfCharacterInString {

	public static void main(String[] args) {
		String str ="Hello World";
		String s= str.toLowerCase();
		Map<Character, Integer> map= new LinkedHashMap<>();
		for(char ch:s.toCharArray()) {
			if(ch!=' ') {
				map.put(ch,map.getOrDefault(ch,0)+1);
			}
		}
		System.out.println(map); //{h=1, e=1, l=3, o=2, w=1, r=1, d=1}
		for(Map.Entry<Character, Integer>entry:map.entrySet()) {
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
	}

}
