package com.java8.streams;

import java.util.ArrayList;
import java.util.List;

public class CollectionsAfterStreamsTest {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(2);
		nums.add(1);
		nums.add(3);
		nums.add(4);

		nums.parallelStream().filter((Integer num) -> num % 2 == 0).forEach(num -> System.out.println(num));
	}
}
