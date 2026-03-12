package javaPrograms;

public class SearchElementinArrayAndDisplayIndicesOrNotFoundDisplayNotFound {

	public static void main(String[] args) {
		int arr []= {1,3,5,6,2,7,9};
		int searchEle=4;
//		int searchEle=7;
		boolean found=false;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==searchEle) {
				System.out.println("Indices of element "+searchEle+" = "+ i); //Print Indices of element
				found=true;
			}
		}
		if(!found) {
			System.out.println("Element not found");
		}

	}

}
