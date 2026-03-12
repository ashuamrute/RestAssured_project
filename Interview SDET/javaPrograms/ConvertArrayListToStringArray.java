package javaPrograms;

import java.util.ArrayList;

public class ConvertArrayListToStringArray {

	public static void main(String[] args) {
		ArrayList<String> city = new ArrayList<>();
		city.add("Nagpur");
		city.add("Pune");
		city.add("Nashik");
		city.add("Mumbai");
		
//Way 1
		String[] list = new String[city.size()];
		int index = 0;
		for (String c : city) {
			list[index++] = c;
		}
		for (String added : list) {
			System.out.println(added);
		}
		
		
		//Way 2
//		String[] list = city.toArray(new String[city.size()]);
//		for (String added : list) {
//			System.out.println(added);
//		}
	}

}
