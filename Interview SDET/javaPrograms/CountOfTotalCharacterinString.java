package javaPrograms;

public class CountOfTotalCharacterinString {

	public static void main(String[] args) {
		String str = "Automation testing";
		int count = 0;
		for (char ch : str.toCharArray()) {
			if (ch != ' ') {
				count++;
			}
		}
		System.out.println("Total count of character in String: " + count);
	}

}
