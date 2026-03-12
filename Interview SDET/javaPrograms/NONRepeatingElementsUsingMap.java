package javaPrograms;

import java.util.HashMap;

public class NONRepeatingElementsUsingMap {

	public static void main(String[] args) {
		int [] arr = {4,5,4,6,7,5,7,8};
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int num:arr) {
			map.put(num, map.getOrDefault(num,0)+1);
		}
		for(int num:arr) {
			if(map.get(num)==1) {
				System.out.println("Non repeating element: "+num);
//				break;
			}
		}
	}

}
