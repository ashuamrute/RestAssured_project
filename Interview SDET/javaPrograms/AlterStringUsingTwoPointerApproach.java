package javaPrograms;

public class AlterStringUsingTwoPointerApproach {

	public static void main(String[] args) {
		String input = "a-bC-dEf-ghlj";
		// output= "j-lh-gfE-dCba";
		char[] ch = input.toCharArray();
		int left = 0;
		int right = ch.length - 1;
		while (left < right) {
			if (!Character.isLetter(ch[left])) {
				left++;

			} else if (!Character.isLetter(ch[right])) {
				right--;
			} else {
				char temp = ch[left];
				ch[left] = ch[right];
				ch[right] = temp;
				left++;
				right--;
			}
		}
		System.out.println("Output is: " + new String(ch));

	}

}
