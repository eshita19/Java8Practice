package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CollectionsAfterStreamsTest {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);

		//Display even numbers
		System.out.println("Even numbers: ");
		nums.parallelStream().filter((Integer num) -> num % 2 == 0).forEach(num -> System.out.println(num));
		
		//Find the max element
		Optional<Integer> maxnum = nums.stream().max(Integer::compare);
		if(maxnum.isPresent()){
			System.out.println("Maximum number: " + maxnum.get());
		}
		
		//Increment all numbers by one
		System.out.println("Numbers incremented by one: ");
		nums.parallelStream().map(num -> num+1).forEach(num -> System.out.println(num));
	}
}
