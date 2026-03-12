package javaPrograms;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		String str = "Hello World Java";
		StringBuilder sb = new StringBuilder();
		String[] words = str.split(" ");

		for (String word : words) {
			sb.append(new StringBuilder(word).reverse().append(" "));
		}
		System.out.println("Reverse each words in string: " + sb.toString());
	}
	

}
