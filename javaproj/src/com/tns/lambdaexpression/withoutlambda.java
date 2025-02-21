package com.tns.lambdaexpression;
// without lambda expression (funtional interface method)
public class withoutlambda implements myinterface{

	@Override
	public void display() {
		System.out.println("hello");	
	}
public static void main(String[] args) {
	withoutlambda wl=new withoutlambda();
	wl.display();

	}

}
