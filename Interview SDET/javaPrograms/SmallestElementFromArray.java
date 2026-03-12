package javaPrograms;

import java.util.Arrays;

public class SmallestElementFromArray {

	public static void main(String[] args) {
		int [] arr = {12,44,35,77,4,99};
		//Way 1
		int min=arr[0];
		for(int i=0; i<arr.length-1; i++)
		{
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		
		//Way 2
		Arrays.sort(arr);
		min= arr[0];
		
			
		//Way 3
		
		min = Arrays.stream(arr).min().getAsInt();
		
		System.out.println("Smallest ele from Array: "+min);
	}

}
