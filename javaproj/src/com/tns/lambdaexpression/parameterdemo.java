package com.tns.lambdaexpression;

public class parameterdemo {
	public static void main(String[] args) {
		square s=(a)->{return (a*a);};
		System.out.println(+s.area(5));
	}
}
