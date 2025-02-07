package com.tns.packdemo;

public class Nestedinter implements Myinterface.MYinnerinterface{

@Override
public void print() {
	
	System.out.println("inner interface method");
}
public static void main(String[] args) {
	Nestedinter nr= new Nestedinter();
	nr.print();
	System.out.println(nr.id);
}
}
