package com.tns.exceptionhandle;

import java.io.IOException;

public class Throwsdemo {
	void v1() {
		System.out.println("no exception");
	}
	void v2() throws IOException{
		System.out.println("device error");
	}
	void v3() throws ArithmeticException, IndexOutOfBoundsException{
		System.out.println("no file found ");
	}
  
	public static void main(String[] args) {
		Throwsdemo td=new Throwsdemo();
		td.v1();
		try {
			td.v2();
		}
		catch(Exception e) {
			System.out.println(e);
		}
       try {
    	   td.v3();
       }
       catch (Exception f) {
    	   System.out.println(f);
       }
}
}