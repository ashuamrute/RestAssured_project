package javaPrograms;

public class SortArrayInAscendingAndDescendingOrder {

	public static void main(String[] args) {
		int arr[] = { 4, 2, 6, 9, 5, 10, 1 };

		// Ascending order
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted Arrray in ascending order: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}

		// Descending order
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted Arrray in descending order: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}

}
