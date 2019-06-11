package com.java8.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestBeforeLamda {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		for(int i =0; i<5; i++){
			students.add(new Student(i, "name" + i));
		}
		
		//Comparator Anonymous class - Sort by name Desc order
		Comparator<Student> studentByNameDesOrder = new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o2.getName().compareTo(o1.getName());
			}
		};
		
		Collections.sort(students, studentByNameDesOrder);
		for(Student stud : students){
			System.out.println(stud.getName());
		}
	}
}
