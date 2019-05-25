package com.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class CollectionsBeforeStreamsTest {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(2);
		nums.add(1);
		nums.add(3);
		nums.add(4);
		
		//Get even numbers
		List<Integer> evenNumbers = getEvenNumbers(nums);
		System.out.println("Displaying even numbers:");
		display(evenNumbers);
				
	}

	private static List<Integer> getEvenNumbers(List<Integer> nums) {
		List<Integer> evenNumbers = new ArrayList<>();
		for(Integer num: nums){
			if(num % 2 == 0){
				evenNumbers.add(num);
			}
		}
		return evenNumbers;
	}
	
	private static void display(List<Integer> nums){
		for(Integer num : nums){
			System.out.println(num);
		}
	}
}
