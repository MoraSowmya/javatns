package com.tns.stringdemo;

public class Testimmutable {

	public static void main(String[] args) {
		String s="welcome";
		 s.concat("hello");
		 
		 System.out.println(s);
		 
		 s=s.concat("hello");
		 System.out.println(s);

	}

}
