package javaPrograms;

public class CountOccuranceOfGivenCharacterInString {
	public static void main (String [] args) {
		String str = "Selenium";
		str = str.toLowerCase();
		int count = 0;
		char c= 'e';
		
		for(char ch:str.toCharArray()) {
			if(ch==c) {
				count++;
				
			}
			
		}
		System.out.println("count of charactor:"+count);
	}

}
