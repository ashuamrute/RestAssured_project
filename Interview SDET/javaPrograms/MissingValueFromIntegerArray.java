package javaPrograms;

import java.util.Arrays;

public class MissingValueFromIntegerArray {

	public static void main(String[] args) {
		int [] arr= {4,2,5,6,9};
		Arrays.sort(arr);
		// Way 1
		for(int i=0; i<arr.length-1;i++) {
			int current = arr[i];
			int next = arr[i+1];
			for(int j=current +1; j<next; j++) {
				System.out.println("Missing elements from Array:"+j);
			}
		}
		
		//Way 2
//		Integer prev = null;
//		for(int num:arr) {
//			if(prev!=null) {
//				for(int j=prev+1; j<num;j++) {
//					System.out.println("Missing elements from Array:"+j);
//				}
//				
//			}
//			prev=num;
//		}
	}

}
