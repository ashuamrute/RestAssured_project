package javaPrograms;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// 153 → (1*1*1)+(5*5*5)+(3*3*3)= 1+125+27 = 153
		int num = 153;
		int result = 0;
		int rem;
		int temp = num;
		while (num > 0) {
			rem = num % 10; // 153%10=3, 15%10=5, 1%10=1
			num = num / 10; // 153/10=15, 15/10=1 , 1/10=0
			result = result + (rem * rem * rem); // 0+(3*3*3)=27, 27+(5*5*5)=27+125=152, 152 +(1*1*1)=153

		}
		if (result == temp) {
			System.out.println("Number is Armstrong");
		}else {
			System.out.println("Number is Not Armstrong");
		}
	}

}
