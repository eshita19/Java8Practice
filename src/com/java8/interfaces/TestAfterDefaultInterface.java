package com.java8.interfaces;

interface Moveable {
	public void moveRight();

	public void moveLeft();

	default public void moveTop() {
		System.out.println("Default Move top");
	}
}

public class TestAfterDefaultInterface {
	public static void main(String[] args) {
		A1 a = new A1();
		a.moveTop();
		
		B1 b = new B1();
		b.moveTop();
	}
}

class A1 implements Moveable {

	@Override
	public void moveRight() {
		System.out.println("A Move right");
	}

	@Override
	public void moveLeft() {
		System.out.println("A Move left");
	}
}

class B1 implements Moveable {

	@Override
	public void moveRight() {
		System.out.println("B Move right");
	}

	@Override
	public void moveLeft() {
		System.out.println("B Move left");
	}
	
	@Override
	public void moveTop() {
		Moveable.super.moveTop(); // Call interface default impl
		System.out.println("B1 Move top");
	}

}
