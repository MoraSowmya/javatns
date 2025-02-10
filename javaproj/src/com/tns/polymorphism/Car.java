package com.tns.polymorphism;

public class Car extends Vehicle {
	@Override
	void move() {
		System.out.println("car drives");
	}
	
	void display() {
		super.move();
		move();
	}
	
	public static void main(String[] args) {
		Car c=new Car();
		c.move();
		
		c.display();
	}


}
