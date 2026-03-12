package javaPrograms;

public class LargestWordFromString {

	public static void main(String[] args) {
		String str= "I am learning java";
		String largest="";
	String [] s= str.split(" ");
	for(String word:s) {
		if(word.length()>largest.length()) {
			largest=word;
		}
		
	}
	System.out.println(largest);

	}

}
