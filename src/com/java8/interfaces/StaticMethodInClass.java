package com.java8.interfaces;

interface Displayable{
	public static void display(){
		System.out.println("Displayable display");
	}
}
class A2{
	public static void print(){
		System.out.println("Display method in A");
	}
}

class B2 extends A2 implements Displayable{
	public static void print(){
		System.out.println("Display method in B"); //A2 dislay method overriden
	}
}

public class StaticMethodInClass {
	public static void main(String[] args) {
		B2.print(); //It will call B2's print utility instead of A2 (Overriden main utility A2's functionality!
		A2.print(); // A2's print
		
		B2.display(); // Implmented Displayable but display method not visibie.
		Displayable.display(); //Interface static methods only visible through interface static reference.
	}
}
