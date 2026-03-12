package javaPrograms;

import java.util.Arrays;

public class ReverseIntegerArray {

	public static void main(String[] args) {
		int[] arr = {10,22,33,44,55};
		//Way 1
//		int [] rev=new int [arr.length];
//		
//		for(int i=0; i<arr.length; i++) {
//			rev[i]=arr[arr.length-1-i];
//		}
//		System.out.println("Reverse Array :"+Arrays.toString(rev));
		
		//Way2
		int start=0;
		int end=arr.length-1;
		while(start<end) {
			int temp = arr[start];
			arr[start]= arr[end];
			arr[end]= temp;
			start++;
			end--;
		}
		for(int num:arr) {
			System.out.print(num+",");
		}
	}

}
