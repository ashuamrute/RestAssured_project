package javaPrograms;

import java.util.Scanner;

public class EvenAndOddNumber {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number:");
	int num = sc.nextInt();
	sc.close();
	
	if(num%2==0) {
		System.out.println("Num is Even");
	}else {
		System.out.println("Num is odd");
	}

	}

}
