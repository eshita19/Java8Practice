package com.java8.optional;

import java.util.Optional;

public class TestAfterOptional {

	
	public static void main(String[] args) {
		String op ;
		
		//If the transformed String is not null get it otherwise "default" string
		Optional<String> str1 = transform("java 8");
		if (str1.isPresent()) {  // str1 == null check replaced by method call. But still if block is overhead
			op = str1.get();
		}else{
			op = "default";
		}
		System.out.println(op);
		
		//If the transformed String is not null get it otherwise "default" string
		Optional<String> str2 = transform("java 8");
		op = str2.orElse("default");
		System.out.println(op);
		
	//	op = str2.orElseGet(str2 ->  new String("eshita"));
		
		//If string matches "java8" execute a block
		Optional<String> str3 = transform("Hi");
	    if(str3.filter(str -> !str.equals("java8")).isPresent()){
	    	System.out.println("It is not equal to java 8");
	    }
	    
	    //Convert a String 
	    Optional<String> str4 = Optional.ofNullable("Eshita");
	    str4.map(str -> str + " mathur").ifPresent(str -> System.out.println("Converted String str4 : " + str));
	  
	    //Convert a String 
	    Optional<String> str5 = Optional.ofNullable(null);
	    str5.map(str -> str + " mathur").ifPresent(str -> System.out.println("Converted String str5 : " + str));
	}
	
	
	
	/**
	 * Returns a Optional String value.
	 *  Null - in case string contains "java"
	 *  Otherwise replaces "mathur" with "mathur2" if present
	 * @param str
	 * @return
	 */
	public static Optional<String> transform(String str){
		Optional<String> val;
		if(str.contains("java")){
			val = Optional.ofNullable(null);
		}else{
			val = Optional.ofNullable(str.replaceFirst("mathur", "mathur2"));
		}
		return val;
	}
}
