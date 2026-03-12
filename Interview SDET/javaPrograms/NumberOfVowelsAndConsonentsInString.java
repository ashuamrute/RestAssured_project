package javaPrograms;

public class NumberOfVowelsAndConsonentsInString {
	public static void main(String[] args) {
		String str = "Life is a beautiful enjoy it";
		int vowels = 0;
		int consonents = 0;
		str = str.toLowerCase();
		for (char c : str.toCharArray()) {
			if (c >= 'a' && c <= 'z') {
				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					vowels++;
				} else {
					consonents++;
				}
			}

		}
		System.out.println("Vowels in string: "+vowels);
		System.out.println("Consonents in string: "+consonents);
	}
}
