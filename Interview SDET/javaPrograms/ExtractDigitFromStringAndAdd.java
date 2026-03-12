package javaPrograms;

public class ExtractDigitFromStringAndAdd {

	public static void main(String[] args) {
		String str = "a1b2c3de4f5x";
		int sum = 0;
		for (char ch : str.toCharArray()) {
			if (Character.isDigit(ch)) {
				sum = sum + Character.getNumericValue(ch);
			}
		}
		System.out.println("sum of digit:" + sum);
	}

}
