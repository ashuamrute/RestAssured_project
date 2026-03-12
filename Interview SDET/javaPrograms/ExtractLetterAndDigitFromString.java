package javaPrograms;

public class ExtractLetterAndDigitFromString {

	public static void main(String[] args) {
		String str = "hello@34%Wo$rld"; //output : hello34World
		StringBuilder sb = new StringBuilder();

		for (char ch : str.toCharArray()) {
			if (Character.isLetterOrDigit(ch)) {
				sb.append(ch);
			}
		}
		System.out.println("extracted String :" + sb.toString());
	}

}
