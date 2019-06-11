package com.java8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

interface Operation<T>{
	T operate(T t1, T t2);
}

public class TestAfterLamda {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		for(int i =0; i<5; i++){
			students.add(new Student(i, "name" + i));
		}
		
		Collections.sort(students, (s1,s2) -> s1.getName().compareTo(s2.getName()));
		
		Operation<Integer> sum = (a1, a2) -> a1+ a2;
		System.out.println(sum.operate(1, 2)); //prints 3
		
		Operation<Integer> product = (a1,a2) -> a1*a2;
		System.out.println(product.operate(1, 2)); //prints 2
	}
	
}
