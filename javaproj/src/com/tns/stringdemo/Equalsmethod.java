package com.tns.stringdemo;

// equals method
public class Equalsmethod {

	public static void main(String[] args) {
		String s1="raj";
		String s2="raj";
		String s3=new String("raj");
		String s4="nithin";

		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
	}

}
