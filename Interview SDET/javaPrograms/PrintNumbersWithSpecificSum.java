package javaPrograms;

import java.util.HashSet;

public class PrintNumbersWithSpecificSum {

	public static void main(String[] args) {
		// Input: [2, 7, 11, 15], target = 9   Output: (2, 7) --> Output should be list of numbers thats sum is 9
		int [] arr = {2, 7, 11, 15};
		int target = 9;
		
		// Way 1
		for(int i=0; i<arr.length;i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println("Numbers whose sum is "+target+" :"+ arr[i]+" & "+ arr[j]);
				}
			}
		}
		
		//Way 2
//		HashSet<Integer> numbers = new HashSet<>();
//		for(int num:arr ) {
//			int substract = target - num;
//			if(numbers.contains(substract)) {
//				System.out.println("Number whose sum: "+num +" & "+substract);
//			}
//			numbers.add(num);
//		}
	}

}
