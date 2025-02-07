package com.tns.inheritance;

public class Child extends Father{


	String cycle="pink";
	
	public static void main(String[] args) {
		
		Child c=new Child();
		System.out.println(c.money);
		System.out.println(c.car);
		System.out.println(c.cycle);
		
		c.drinking();
	}

}
