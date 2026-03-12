package javaPrograms;

public class CapitalizeFirstCharacter {

	public static void main(String[] args) {
		String str = "hello world";
		StringBuilder sb = new StringBuilder();
		String[] words = str.split(" ");
		//way 1
//		for (String word : words) {
//			if (!word.isEmpty()) {
//				sb.append(Character.toUpperCase(word.charAt(0))); // Capitalize first character 'H'
//				sb.append(word.substring(1)); // append remaining string "ello"
//				sb.append(" "); // adding space
//			}
//		}
//		System.out.println("Capitalize first char from string: " + sb.toString());
		
		//Way 2
		 for(String word: words){
	            System.out.print(word.substring(0,1).toUpperCase()+word.substring(1,word.length())+" ");
	        }
		
	}

}
