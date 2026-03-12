package javaPrograms;

public class NumberIsPallindromeOrNot {

	public static void main(String[] args) {
		int num = 12321;
		int OriginalNum = num;
		int revNum = 0;
		while (num != 0) {
			int LastDigit = num % 10;
			num = num / 10;
			revNum = revNum * 10 + LastDigit;
		}
		if (OriginalNum == revNum) {
			System.out.println("Number is Pallindrome");
		} else {
			System.out.println("Number is NOT Pallindrome");
		}

	}
}
