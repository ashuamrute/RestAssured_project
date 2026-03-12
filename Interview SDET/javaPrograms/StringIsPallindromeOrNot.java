package javaPrograms;

public class StringIsPallindromeOrNot {

	public static void main(String[] args) {
		String str= "Madam";
		String s1= str.toLowerCase();
		
		//Way 1 using StringBuilder class
//		StringBuilder sb = new StringBuilder(s1);
//		String s2= sb.reverse().toString();

		
// Way 2
		String s2= "";
		for(int i=s1.length()-1;i>=0;i--) {
			s2= s2 + s1.charAt(i);
		}
		
		
		if(s1.equals(s2)) {
			System.out.println("String is Pallindrome");
		}else {
			System.out.println("String is not Pallindrome");
		}

}
}
