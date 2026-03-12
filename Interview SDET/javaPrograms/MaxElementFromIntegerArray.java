package javaPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxElementFromIntegerArray {

	public static void main(String[] args) {
		int [] arr = {12,44,35,77,4,99};
		//Way 1
//		int max=arr[0];
//		for(int num:arr) {
//			if(num>max) {
//				max=num;
//			}
//		}
		
		//Way 2  using stream
//		int max = Arrays.stream(arr).max().getAsInt();
		
		//Way 3  using collections class
//		Integer[] arr = {12, 44, 35, 77, 4, 99};
//		List<Integer> list = Arrays.asList(arr); 
//		int max = Collections.max(list);
		
		//Way 4  
		Arrays.sort(arr);
		int max = arr[arr.length - 1];
		System.out.println("Maximum element from array : "+max);
	}

}
