package javaPrograms;

public class PrintOnlySpecialCharacter {

	public static void main(String[] args) {
		String str= "AB$45&BH@&df?";
		String finalString = str.replaceAll("[^@$&?]", "");
		// if only string without special character 
		String stringOnly = str.replaceAll("[@$&?]", "");
		System.out.println(finalString);// $&@&?
		System.out.println(stringOnly);// $&@&?
		
	}

}
