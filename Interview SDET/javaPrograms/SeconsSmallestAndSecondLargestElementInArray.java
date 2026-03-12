package javaPrograms;

import java.util.ArrayList;
import java.util.TreeSet;

public class SeconsSmallestAndSecondLargestElementInArray {

	public static void main(String[] args) {
		int[] arr = { 22, 11, 99, 45, 67,-76 };

		TreeSet<Integer> sorted = new TreeSet<>(); // to sort and remove duplicate
		for(int num:arr) {
			sorted.add(num);
		}
		if(sorted.size()<2) {
			System.out.println("Not enough element to show");
			return;
		}

		ArrayList<Integer> number = new ArrayList<>(sorted);
		System.out.println("number :"+number);
		int secondSmallest = number.get(1);
		int secondLargest = number.get(number.size()-2);
		System.out.println("secondSmallest :"+secondSmallest);
		System.out.println("secondLargest :"+secondLargest);
	}

}
