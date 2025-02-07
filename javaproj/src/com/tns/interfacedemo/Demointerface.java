package com.tns.interfacedemo;

public class Demointerface implements Interfaceone,Interfacetwo{

	@Override
	public void show() {
		System.out.println("show");
		
	}

	@Override
	public void print() {
		System.out.println("print");
		
		
		
	}
public static void main(String[] args) {
	Demointerface dm=new Demointerface();
	dm.print();
	dm.show();
}
}
