package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str1 = String.valueOf(100);
//		String str2 = Integer.toString(100);
//		System.out.println(str1);
//		System.out.println(str2);
//		
//		
//		String num = "123";
//		int value = Integer.parseInt(num); // String to int
//		int value2 = Integer.valueOf(num);
//		System.out.println(value);
//		System.out.println(value2);
		
		
		List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 4, 1, 5));
		Collections.sort(list);
		System.out.println(Collections.max(list));
		System.out.println(list);
	}

}
