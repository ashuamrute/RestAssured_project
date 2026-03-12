package javaPrograms;

import java.util.HashMap;

public class CountOccuranceOfIntegerFromArray {

	public static void main(String[] args) {
int[] arr = {1,2,3,4,5,4,6,2,7,4,8};
        
        HashMap<Integer, Integer> intCount = new HashMap<>();
        
        // Enhanced for loop to iterate through array
        for (int num : arr) { 
            intCount.put(num, intCount.getOrDefault(num, 0) + 1);
        }
        
        System.out.println(intCount);

	}

}
