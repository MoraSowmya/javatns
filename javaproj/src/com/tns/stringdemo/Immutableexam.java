package com.tns.stringdemo;

public class Immutableexam {

	public static void main(String[] args) {
		String s1="raj";
		String s2=s1;
		String s3=s2;

		System.out.println("before");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		 s1="waheed";
		System.out.println("After");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
	}

}
