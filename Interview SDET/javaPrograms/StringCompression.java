package javaPrograms;

public class StringCompression {

	    public static void main(String[] args) {
	    	// I/P="aaabbacdcc" O/P="a3b2acdc2"
	        String input = "aaabbacdcc";
	        StringBuilder output = new StringBuilder();

	        int count = 1; // start with first character count
	        for (int i = 1; i <= input.length(); i++) {
	            if (i < input.length() && input.charAt(i) == input.charAt(i - 1)) {
	                count++;  
	            } else {
	                output.append(input.charAt(i - 1));   //a,b,a,c,d,c
	                if (count > 1) {
	                    output.append(count);   //3,2,2
	                }
	                count = 1; // reset count
	            }
	        }

	        System.out.println("Output: " + output.toString());
	    }
	}

