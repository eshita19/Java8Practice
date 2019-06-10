package com.java8.optional;

public class TestBeforeOptional {
	
	public static void main(String[] args) {
		
		String str = transform("eshita");
		if(null == str){  // If block for Null check which sometimes result in null assignment if(str =null) :D, increases code complexity
			str = "eshita"; // reinitialize to old value if null
		}
		System.out.println(str.charAt(0));
	}
	
	
	public static String transform(String str){
		//Do some computation over string and return string
		return null; // It might be returning null in some cases!
	}

}
