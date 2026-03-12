package javaPrograms;

public class ReverseWordsInString {

	public static void main(String[] args) {
		String str = "Life is beautiful enjoy it";

		String[] words = str.split(" ");

		for (int i = words.length - 1; i >= 0; i--) {
			System.out.print(words[i] + " "); // it enjoy beautiful is Life 

		}

	}

}
