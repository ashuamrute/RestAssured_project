package javaPrograms;

import java.util.Arrays;

public class LargestAndSecondLargestElementFromIntegerArray {

	public static void main(String[] args) {
		int[] arr = { 22, 11, 99, 45, 67,-76 };
		
		//Way 1   Efficient Way
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for(int num:arr) {
			if(num>largest) {
				secondLargest= largest;
				largest= num;
			}else if (num>secondLargest && num!=largest){
				secondLargest=num;
			}
		}
		
		//Way 2   Less efficient way 
//		Arrays.sort(arr);
//		int largest= arr[arr.length-1];
//		int secondLargest =arr[arr.length-2];
		
		System.out.println("Largest num in array is: "+largest);
		System.out.println("Largest num in array is: "+secondLargest);
	}
}
