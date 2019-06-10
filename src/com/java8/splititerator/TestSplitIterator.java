package com.java8.splititerator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

public class TestSplitIterator {
	
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		
		//Traditional iterator with two calls hasnext and next
		Iterator<Integer> numsIterator = nums.iterator();
		System.out.println("Printing nums from traditional Iterator");
		while(numsIterator.hasNext()){
			System.out.println(numsIterator.next());
		}
		
		//Split the list in two halfs
		Spliterator<Integer> secondSplit = nums.spliterator(); // Contains elements [3,4]
		Spliterator<Integer> firstSplit = secondSplit.trySplit(); // Contains elements [1,2]
		
		//tryAdvance: Iterates through remaining elements. Returns true if there are more elements to be iterated. No hasNext call.
		while(secondSplit.tryAdvance(n -> {
			n = n +1;
			System.out.println(n);
		}));
		
		//forEachRemaining : Iterates through remaining elements. No hasNext and next call.
		secondSplit.forEachRemaining(System.out::println);
		
		//Difference between forEach and forEachRemaining/tryadvance
		System.out.println("Iterator starts iteration only for the remaining elements to be iterated");
		while(firstSplit.tryAdvance(System.out::println));
		firstSplit.forEachRemaining(System.out::println);
	    
		System.out.println("for each always iterates through all elements");
	    nums.forEach(System.out::println);
	    nums.forEach(System.out::println);
	}
}
