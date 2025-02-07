package com.tns.exceptionhandle;

public class Divide {

	public static void display() {
		int a=6,b=0,c;
		try {
			c=a/b;
			System.out.println("division "+c);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("exception caught");
		}

	public static void main(String[] args) {
		

	}

}
