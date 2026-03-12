package javaPrograms;

import java.util.ArrayList;

public class PrintSpecificValuesFromArrayList {

	public static void main(String[] args) {
		ArrayList<String> emails= new ArrayList<>();
		emails.add("abc@gmail.com");
		emails.add("abc@Yahoo.com");
		emails.add("xyz@gmail.com");
		emails.add("xyz@hotmail.com");
		
		for(String e:emails) {
			if(e.contains("gmail.com")) {
				System.out.println(e);
				
			}
		}

	}

}
