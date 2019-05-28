package com.java8.interfaces;

interface Moveable{
	public void moveRight();
	public void moveLeft();
	public void moveTop();
}
public class TestBeforeDefaultInterface {

}

class A implements Moveable{

	@Override
	public void moveRight() {
		System.out.println("A Move right");
	}

	@Override
	public void moveLeft() {
		System.out.println("A Move left");
	}
}

class B implements Moveable{

	@Override
	public void moveRight() {
		System.out.println("B Move right");
	}

	@Override
	public void moveLeft() {
		System.out.println("B Move left");
	}
	
}
