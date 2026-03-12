package javaPrograms;

import java.util.Arrays;

public class CheckIfTwoStringsAreAnagram {

	public static void main(String[] args) {
		String s1= "Mary";
		String s2= "Army";
		char[] a= s1.toLowerCase().toCharArray();
		char[] b= s2.toLowerCase().toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		
		if(Arrays.equals(a, b)) {
			System.out.println("String are Anagram");
		}else {
			System.out.println("String are not Anagram");
		}

	}

}
