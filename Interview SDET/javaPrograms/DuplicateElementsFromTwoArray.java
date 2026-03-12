package javaPrograms;

import java.util.Arrays;

public class DuplicateElementsFromTwoArray {

	public static void main(String[] args) {
		int [] arr1= {1,2,4,7,8,10};
		int [] arr2 = {3,2,5,8,9};
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println("Common element from array:");
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
					break;
				}
			}
		}

	}

}
