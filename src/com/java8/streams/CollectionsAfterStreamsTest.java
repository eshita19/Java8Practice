package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

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
		
		//Sort elements
		System.out.println("Sorting elements");
		nums.stream().sorted(Integer::compare).forEach(num -> System.out.println(num));
		
		//Get product of elements - reduce function
		System.out.println("Product of all elements");
		System.out.println(nums.stream().reduce((num1, num2) -> num1 * num2).get());
		
		//Get product of even elements - reduce function 
		System.out.print(nums.stream().reduce(1, (op, elem) -> {
			if(elem % 2 == 0){
				return op*elem;
			}else{
				return op;
			}
		}));
		
		//Convert List of String to a set
		Set<Integer> numsSet = nums.stream().collect(Collectors.toSet());
	}
}
