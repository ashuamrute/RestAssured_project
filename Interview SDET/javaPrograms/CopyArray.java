package javaPrograms;

public class CopyArray {

	public static void main(String[] args) {
		int [] arr1= {2,3,4,5,6};
		int [] arr2 = new int [arr1.length];
		// Way 1
//		for(int i=0; i<arr1.length;i++) {
//			arr2[i]=arr1[i];
//		}

		//Way 2
		int index=0;
		for(int n:arr1) {
			arr2[index++]=n;
		}
		
		for(int num:arr2) {
			System.out.print(num+" ");
		}
	}

}
