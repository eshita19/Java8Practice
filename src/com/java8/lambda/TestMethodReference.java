package com.java8.lambda;

import java.util.ArrayList;
import java.util.List;

interface Operator{
	public boolean test(String str);
}
public class TestMethodReference {

	public static boolean test(String str){
		return str.isEmpty();
	}
	
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		for(int i =0; i<5; i++){
			students.add(new Student(i, "name" + i));
		}
		students.add(new Student(100, ""));
		
		//Find student whose name is empty
		for(Student student : students){
			if(!filterStudent(TestMethodReference::test, student)){ // Method reference
				System.out.println("Student with roll number " + student.getRollNum()  + " has empty name.");
			}
		}
	}
	
	private static boolean filterStudent(Operator operator, Student student){
		return operator.test(student.getName());
	}
}
