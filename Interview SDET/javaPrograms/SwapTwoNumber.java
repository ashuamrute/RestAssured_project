package javaPrograms;

public class SwapTwoNumber {

	public static void main(String[] args) {
		int a= 10;
		int b= 20;
		
		// With third variable
//		int temp=0;
//		System.out.println("Before Swap: "+a +" and " +b);
//		temp = a;
//		a= b;
//		b= temp;
//		System.out.println("After Swap: "+a +" and " +b);
		
		// Without third variable
//		a= a+b;
//		b=a-b;
//		a=a-b;
//		
//		System.out.println("After Swap: "+a +" and " +b);
		
		// By Bitwise operator
		a= a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("After Swap: "+a +" and " +b);
	}

}
