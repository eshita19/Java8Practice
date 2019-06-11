package com.java8.lambda;

interface StudentFactory{
	Student getStudent(int rollNum, String name);
}

public class TestConstructorReference {
	public static void main(String[] args) {
		StudentFactory studentFactory = Student::new;
		Student student = studentFactory.getStudent(123, "Hello");
	}
}
