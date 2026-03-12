package javaPrograms;

public class FibinacciSeries {

	public static void main(String[] args) {
		int prev=1, next =1;
		int sum = 0;
		System.out.print(prev+" ");
		
		for(int i=0; i<=10; i++) {
		sum = prev + next;
		System.out.print(sum +" ");
		prev= next;
		next=sum;
		}
	}

}
