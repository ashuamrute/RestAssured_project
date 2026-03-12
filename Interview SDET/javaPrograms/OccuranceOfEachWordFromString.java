package javaPrograms;

import java.util.HashMap;

public class OccuranceOfEachWordFromString {

	public static void main(String[] args) {
		String Str= "I am learning learning Java java Java";
		String str= Str.toLowerCase();
		String [] words = str.split(" ");
		
		int count =1;
		HashMap<String, Integer> map = new HashMap<>();
		for(String word:words) {
			if(!map.containsKey(word)) {
				map.put(word,count);
			}else {
				map.put(word, map.get(word)+1);
			}
		}
		for(String w:map.keySet()) {
			System.out.println("Occurance of words "+w +":"+map.get(w));
			
		}
	}

}
